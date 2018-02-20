package gdn; 

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections15.Transformer;

import ecst.ECSTNode;
import ecst.universalNodes.AttributeDecl;
import ecst.universalNodes.FunctionDecl;
import util.LOG;

import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.io.PajekNetWriter;

public class GDN {

    private DirectedSparseMultigraph<GDNNode, GDNLink> net = 
            new DirectedSparseMultigraph<GDNNode, GDNLink>();
    
    private HashMap<String, GDNNode> nodeMap =
            new HashMap<String, GDNNode>();
            
    private HashMap<String, GDNLink> linkMap = 
            new HashMap<String, GDNLink>();
    
    private boolean newlyCreatedLink;
    
    public int UNCONSISTENT_LINKS = 0;
    
    public GDNNode newNode(String name, GDNNodeType type, ECSTNode ecstNode, String sourceFileName) {
            if (!nodeMap.containsKey(name)) {
                    GDNNode newn = null;
                    if (ecstNode instanceof FunctionDecl) {
                            FunctionDecl fdNode = (FunctionDecl) ecstNode;
                            newn = new GDNFuncNode(name, type, fdNode.getParamTypes(), fdNode.getRetType(), sourceFileName);
                    } 
                    else 
                    if (ecstNode instanceof AttributeDecl) {
                            AttributeDecl adNode = (AttributeDecl) ecstNode;
                            newn = new GDNVarNode(name, type, sourceFileName, adNode.getType());
                    }
                    else {
                            newn = new GDNNode(name, type, sourceFileName);
                    }
                    net.addVertex(newn);
                    nodeMap.put(name, newn);
                    return newn;
            } else {
                    return nodeMap.get(name);
            }
    }
    
    public GDNNode getNode(String name) {
            if (!nodeMap.containsKey(name)) {
                    return null;
            } else {
                    return nodeMap.get(name);
            }
    }
    
    public GDNLink newLink(String srcName, String dstName, GDNLinkType type, String explain) {
            if (explain == null || explain.length() == 0) {
                    throw new IllegalArgumentException("Trying to create link wo explanation: " + srcName + ", " + dstName + ", " + type);
            }
            
            GDNNode src = nodeMap.get(srcName);
            if (src == null) {
                    return null;
            }
            
            GDNNode dst = nodeMap.get(dstName);
            if (dst == null) {
                    return null;
            }
            
            return newLink(src, dst, type, explain);
    }
    
    
    public GDNLink newLink(GDNNode src, GDNNode dst, GDNLinkType type, String explain) {
            
            if (explain == null || explain.length() == 0) {
                    throw new IllegalArgumentException("Trying to create link wo explanation: " + src.getName() + ", " + dst.getName() + ", " + type);
            }
            
            checkConsistency(src, dst, type, explain);
            
            // avoid self-reference links
            if (src.getName().compareTo(dst.getName()) == 0)
                    return null;
            
            String linkName = src.getName() + "_" + GDNLinkType.desc(type) + "_" + dst.getName();
            if (linkMap.containsKey(linkName)) {
                    GDNLink l = linkMap.get(linkName);
                    l.incWeight();
                    l.updateExplanation(explain);
                    newlyCreatedLink = false;
                    return l;
            }
            else {
                    if (type == GDNLinkType.EXTENDS && dst.getType() == GDNNodeType.INTERFACE)
                            type = GDNLinkType.IMPLEMENTS;
                    
                    GDNLink newl = new GDNLink(linkName, src, dst, type, explain);
                    linkMap.put(linkName, newl);
                    net.addEdge(newl, src, dst, EdgeType.DIRECTED);
                    newlyCreatedLink = true;
                    return newl;
            }
    }
    
    public boolean isLinkNewlyCreated() {
            return newlyCreatedLink;
    }
    
    private void checkConsistency(GDNNode src, GDNNode dst, GDNLinkType type, String desc) {
            
            if (type == GDNLinkType.CONTAINS)
                    return;
            
            if (src.getType() == GDNNodeType.FUNCTION && dst.getType() == GDNNodeType.FUNCTION) {
                    if (type != GDNLinkType.CALLS) {
                            LOG.error("FUNCTIONS " + src.getName() + ", " + dst.getName() + 
                                              " conncted by " + GDNLinkType.desc(type) + ", desc: " + desc);
                            ++UNCONSISTENT_LINKS;
                    }
            }
            else
            if (src.getType() == GDNNodeType.FUNCTION && dst.getType() == GDNNodeType.GLOBAL_VAR) {
                    if (type != GDNLinkType.ACCESS) {
                            LOG.error("FUNCTION " + src.getName() + ", GLOBAL_VAR " + dst.getName() + 
                                              " conncted by " + GDNLinkType.desc(type) + ", desc: " + desc);
                            ++UNCONSISTENT_LINKS;
                    }
            }
            else
            if (type == GDNLinkType.REFERENCES) {
                    if ((unitOrInterface(src) && unitOrInterface(dst)) ||
                        (src.getType() == GDNNodeType.PACKAGE && dst.getType() == GDNNodeType.PACKAGE)) {
                            return;
                    } else {
                            LOG.error("Invalid REFERENCES link, " + src.getName() + ", " + dst.getName() + ", desc: " + desc);
                            ++UNCONSISTENT_LINKS;
                    }
            }
    }
    
    public void dump(String outFile) 
            throws IOException
    {
            
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
            
            pw.println("Nodes: ");
            Collection<GDNNode> inc = net.getVertices();
            Iterator<GDNNode> ni = inc.iterator();
            while (ni.hasNext()) {
                    GDNNode n = ni.next();
                    pw.println(n.getDesc());
            }
            
            pw.println("\nLinks: ");
            Collection<GDNLink> ilc = net.getEdges();
            Iterator<GDNLink> li = ilc.iterator();
            while (li.hasNext()) {
                    GDNLink l = li.next();
                    pw.println(l.getDesc());
            }
            
            pw.close();
    }
    
    public int checkContainsLinks() {
            int numWrongContains = 0;
            
            Collection<GDNLink> ilc = net.getEdges();
            Iterator<GDNLink> li = ilc.iterator();
            while (li.hasNext()) {
                    GDNLink l = li.next();
                    if (l.getType() == GDNLinkType.CONTAINS) {
                            String srcName = l.getSrc().getName();
                            String dstName = l.getDst().getName();
                            
                            boolean startsWith = dstName.startsWith(srcName);
                            if (!startsWith) {
                                    ++numWrongContains;
                            }
                    }
            }
            
            Collection<GDNNode> nodeC = net.getVertices();
            Iterator<GDNNode> nIt = nodeC.iterator();
            while (nIt.hasNext()) {
                    GDNNode n = nIt.next();
                    LinkedList<GDNNode> hierarchicallyAbove = _getContainedIn(n);
                    if (hierarchicallyAbove.size() >= 2) {
                            ++numWrongContains;
                    }
            }
            
            return numWrongContains;
    }
    
    /**
     * Pretrazivanje GDN cvorova koji reprezentuju funkcije po punom imenu (ono 
     * koje ukljucuje i parametre i povratni tip)
     */
    public GDNFuncNode findFunction(String functionFullName) {
            GDNNode ret = nodeMap.get(functionFullName);
            if (ret != null) {
                    if (ret instanceof GDNFuncNode)
                            return (GDNFuncNode) ret;
                    else
                            return null;
            }
            
            return null;
    }
    
    /**
     * Returns all functions defined in scope of the first parameter (GDNNode n)
     * whose compact name is determined by the second parameter (compactFunctionName)
     */
    public LinkedList<GDNFuncNode> findFunctionsIn(GDNNode n, String compactFunctionName) {
            LinkedList<GDNNode> contains = getContains(n);
            LinkedList<GDNFuncNode> ret = new LinkedList<GDNFuncNode>();
            
            for (GDNNode in : contains) {
                    if (in instanceof GDNFuncNode) {
                            GDNFuncNode f = (GDNFuncNode) in;
                            if (f.getCompactName().compareTo(compactFunctionName) == 0) {
                                    ret.add(f);
                            }
                    }
            }
            
            return ret;
    }
    
    public GDNNode findNodeByName(String name) {
            return nodeMap.get(name);
    }       
    
    /**
     * Trazi cvor u GDN mrezi po imenu (name). Ako je parametar lookForFunctions == true
     * tada se pretrazivanje funkcija vrsi po kompaktnom imenu.
     * Kompaktno ime funkcije je formata imePaketa.imeUnita.imeFunckcije bez parametara i povratne vrednosti
     * Vraca null ukoliko cvor nije pronadjen u mrezi.
     * Ukoliko postoji vise funkcija koje imaju isto kompaktno ime vraca se prva u listi
     */
    public GDNNode findNode(String name, boolean lookForFunctions) {
            GDNNode ret = nodeMap.get(name);
            if (ret != null)
                    return ret;
            
            if (!lookForFunctions)
                    return null;
            
            LinkedList<GDNNode> funcCandidates = new LinkedList<GDNNode>();
            
            Set<Entry<String, GDNNode>> es = nodeMap.entrySet();
            Iterator<Entry<String, GDNNode>> it = es.iterator();
            while (it.hasNext()) {
                    Entry<String, GDNNode> ent = it.next();
                    GDNNode eNode = ent.getValue();
                    if (eNode instanceof GDNFuncNode) {
                            GDNFuncNode funcNode = (GDNFuncNode) eNode;
                            String funcName = funcNode.getCompactFuncName();
                            if (funcName.compareTo(name) == 0) {
                                    funcCandidates.add(funcNode);
                            }
                    }
            }
            
            if (funcCandidates.size() > 0) {
                    if (funcCandidates.size() > 1) {
                            StringBuilder sb = new StringBuilder();
                            for (int i = 0; i < funcCandidates.size(); i++) {
                                    sb.append(funcCandidates.get(i).getName()).append("\n");
                            }
                            
                            LOG.warning("Phase2, find node (GDN.java) " + name +
                                                                              " resulted with several candidates:\n" + sb.toString());
                    }
                    return funcCandidates.get(0);
            } else {
                    return null;
            }
    }
    
    public GDNNode findUnitOrInterface(String unitName) {
            GDNNode ret = nodeMap.get(unitName);
            if (ret != null) {
                    if (ret.getType() == GDNNodeType.UNIT || ret.getType() == GDNNodeType.INTERFACE)
                            return ret;
            }
            
            return null;
    }
    
    public int getNumNodes() {
            return net.getVertexCount();
    }
    
    public int getNumLinks() {
            return net.getEdgeCount();
    }
    
    public LinkedList<GDNNode> getContains(GDNNode node) {
            Collection<GDNLink> outLinks = net.getOutEdges(node);
            Iterator<GDNLink> outLinksIt = outLinks.iterator();
            LinkedList<GDNNode> ret = new LinkedList<GDNNode>();
            
            while (outLinksIt.hasNext()) {
                    GDNLink l = outLinksIt.next();
                    if (l.getType() == GDNLinkType.CONTAINS) {
                            ret.add(l.getDst());
                    }
            }
            
            return ret;
    }
    
    /* REIMPLEMENTED with better error handling -- SEE BELOW 
    public GDNVarNode findGlobalVariable(GDNNode currentScope, String varName) {
            LinkedList<GDNNode> contains = getContains(currentScope);
            for (int i = 0; i < contains.size(); i++) {
                    GDNNode current = contains.get(i);
                    if (current instanceof GDNVarNode) {
                            GDNVarNode vn = (GDNVarNode) current;
                            if (vn.getCompactName().compareTo(varName) == 0) {
                                    return vn;
                            }
                    }
            }
            
            return null;
    }
    */
    
    public LinkedList<GDNVarNode> getGlobalVariablesFor(GDNNode n) {
            LinkedList<GDNNode> contains = getContains(n);
            LinkedList<GDNVarNode> variables = new LinkedList<GDNVarNode>();
            
            for (GDNNode current : contains) {
                    if (current instanceof GDNVarNode) {
                            variables.addLast((GDNVarNode) current);
                    }
            }
            
            return variables;
    }
    
    public GDNVarNode findGlobalVariable(GDNNode n, String varName) {
            LinkedList<GDNVarNode> vars =  getGlobalVariablesFor(n);
            GDNVarNode ret = null;
            
            for (GDNVarNode v : vars) {
                    if (v.getCompactName().compareTo(varName) == 0) {
                            if (ret == null) {
                                    ret = v;
                            } else {
                                    System.err.println("### Multiple variable with the same name <" + varName + "> for " + n.getName());
                                    LOG.error("Multiple variable with the same name <" + varName + "> for " + n.getName());
                                    return null;
                            }
                    }
            }
            
            return ret;
    }
    
    /**
     * Multiple inheritance supported
     * 
     * @param node
     * @return
     */
    public LinkedList<GDNNode> getBaseUnits(GDNNode node) {
            LinkedList<GDNNode> baseUnits = new LinkedList<GDNNode>();
            
            Collection<GDNLink> outLinks = net.getOutEdges(node);
            Iterator<GDNLink> outLinksIt = outLinks.iterator();
            
            while (outLinksIt.hasNext()) {
                    GDNLink l = outLinksIt.next();
                    if (l.getType() == GDNLinkType.EXTENDS) {
                            baseUnits.addLast(l.getDst());
                    }
                    else
                    if (l.getType() == GDNLinkType.IMPLEMENTS) {
                            baseUnits.addLast(l.getDst());
                    }
            }
            
            return baseUnits;
    }
    
    public LinkedList<GDNNode> getStrictParents(GDNNode node) {
            LinkedList<GDNNode> baseUnits = new LinkedList<GDNNode>();
            
            Collection<GDNLink> outLinks = net.getOutEdges(node);
            Iterator<GDNLink> outLinksIt = outLinks.iterator();
            
            while (outLinksIt.hasNext()) {
                    GDNLink l = outLinksIt.next();
                    if (l.getType() == GDNLinkType.EXTENDS) {
                            baseUnits.addLast(l.getDst());
                    }
            }
            
            return baseUnits;
    }
    
    public LinkedList<GDNNode> getAllParents(GDNNode node) {
            LinkedList<GDNNode> parents = new LinkedList<GDNNode>();
            
            LinkedList<GDNNode> q = getStrictParents(node);
            while (!q.isEmpty()) {
                    GDNNode tmp = q.removeFirst();
                    parents.add(tmp);
                    q.addAll(getStrictParents(tmp));
            }
            
            return parents;
    }
    
    public LinkedList<GDNNode> getChilds(GDNNode node) {
            LinkedList<GDNNode> childUnits = new LinkedList<GDNNode>();
            
            Collection<GDNLink> inLinks = net.getInEdges(node);
            Iterator<GDNLink> inLinksIt = inLinks.iterator();
            
            while (inLinksIt.hasNext()) {
                    GDNLink l = inLinksIt.next();
                    if (l.getType() == GDNLinkType.EXTENDS) {
                            childUnits.addLast(l.getSrc());
                    }
            }
            
            return childUnits;
    }
    
    public LinkedList<GDNNode> getAllChilds(GDNNode node) {
            LinkedList<GDNNode> childs = new LinkedList<GDNNode>();
            
            LinkedList<GDNNode> q = getChilds(node);
            while (!q.isEmpty()) {
                    GDNNode tmp = q.removeFirst();
                    childs.add(tmp);
                    q.addAll(getChilds(tmp));
            }
            
            return childs;
    }
    
    /**
     * Checks if src directly or indirectly extends dst
     * multiple inheritance supported
     */
    public boolean srcExtendsDst(GDNNode src, GDNNode dst) {
            LinkedList<GDNNode> baseUnits = getStrictParents(src);
            
            while (baseUnits.size() > 0) {
                    GDNNode current = baseUnits.removeFirst();
                    if (current == dst)
                            return true;
                    
                    LinkedList<GDNNode> expand = getStrictParents(current);
                    for (int i = 0; i < expand.size(); i++) {
                            baseUnits.addLast(expand.get(i));
                    }
            }
            
            return false;
    }
    
    public boolean srcExtendsOrImplementsDst(GDNNode src, GDNNode dst) {
            LinkedList<GDNNode> baseUnits = getBaseUnits(src);
            
            while (baseUnits.size() > 0) {
                    GDNNode current = baseUnits.removeFirst();
                    if (current == dst)
                            return true;
                    
                    LinkedList<GDNNode> expand = getBaseUnits(current);
                    for (int i = 0; i < expand.size(); i++) {
                            baseUnits.addLast(expand.get(i));
                    }
            }
            
            return false;
    }
    
    private LinkedList<GDNNode> _getContainedIn(GDNNode node) {
            Collection<GDNLink> inLinks = net.getInEdges(node);
            Iterator<GDNLink> inLinksIt = inLinks.iterator();
            LinkedList<GDNNode> ret = new LinkedList<GDNNode>();
            
            while (inLinksIt.hasNext()) {
                    GDNLink l = inLinksIt.next();
                    if (l.getType() == GDNLinkType.CONTAINS) {
                            ret.add(l.getSrc());
                    }
            }
            
            return ret;
    }
    
    public GDNNode getContainedIn(GDNNode node) {
            LinkedList<GDNNode> ret = _getContainedIn(node);
            
            if (ret.size() == 0) {
                    return null;
            } 
            else
            if (ret.size() == 1) {
                    return ret.get(0);
            }
            else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[GDN.java], getContainedIn for ");
                    sb.append(node.getDesc());
                    sb.append(" resulted with ").append(ret.size()).append(" nodes:\n");
                    for (int i = 0; i < ret.size(); i++) {
                            sb.append(ret.get(i).getDesc()).append("\n");
                    }
                    
                    LOG.error(sb.toString());
                    return null;
            }
    }
    
    public GDNNode getPackageFor(GDNNode n) {
            if (n.getType() == GDNNodeType.PACKAGE)
                    return n;
            
            GDNNode ha = getContainedIn(n);
            while (ha != null) {
                    if (ha.getType() == GDNNodeType.PACKAGE)
                            return ha;
                    ha = getContainedIn(ha);
            }
            
            return ha;
    }
    
    public GDNNode getUnitFor(GDNNode n) {
            if (n.getType() == GDNNodeType.UNIT)
                    return n;
            
            GDNNode ha = getContainedIn(n);
            while (ha != null) {
                    if (ha.getType() == GDNNodeType.UNIT)
                            return ha;
                    ha = getContainedIn(ha);
            }
            
            return ha;
    }
    
    public GDNNode getUnitOrInterfaceFor(GDNNode n) {
            if (n.getType() == GDNNodeType.UNIT || n.getType() == GDNNodeType.INTERFACE)
                    return n;
            
            GDNNode ha = getContainedIn(n);
            while (ha != null) {
                    if (ha.getType() == GDNNodeType.UNIT || ha.getType() == GDNNodeType.INTERFACE)
                            return ha;
            
                    ha = getContainedIn(ha);
            }
            return ha;
    }
    
    public GDNNode getScope(GDNNode f) {
            GDNNode s = getUnitOrInterfaceFor(f);
            if (s == null)
                    return getPackageFor(f);
            else
                    return s;
    }
    
    public GDNNode getInterfaceFor(GDNNode n) {
            if (n.getType() == GDNNodeType.INTERFACE)
                    return n;
            
            GDNNode ha = getContainedIn(n);
            while (ha != null) {
                    if (ha.getType() == GDNNodeType.INTERFACE)
                            return ha;
            
                    ha = getContainedIn(ha);
            }
            return ha;
    }
    

    /**
     * Do not use this method to form any link.
     * This method is used by checkUnresolvedTypes (just to report warnings)
     * 
     * @param compactName
     * @return
     */
    public GDNNode findNodeByCompactName(String compactName) {
            Set<Entry<String, GDNNode>> es = nodeMap.entrySet();
            Iterator<Entry<String, GDNNode>> it = es.iterator();
            while (it.hasNext()) {
                    Entry<String, GDNNode> e = it.next();
                    GDNNode n = e.getValue();
                    if (n.getCompactName().compareTo(compactName) == 0)
                            return n;
            }
            
            return null;
    }
    
    public String gdnStatus() {
            StringBuilder sb = new StringBuilder();
            
            int packages = 0, units = 0, interfaces = 0, glob = 0, func = 0, types = 0;
            
            Collection<GDNNode> inc = net.getVertices();
            Iterator<GDNNode> ni = inc.iterator();
            while (ni.hasNext()) {
                    GDNNode n = ni.next();
                    if (n.getType() == GDNNodeType.PACKAGE)
                            packages++;
                    else
                    if (n.getType() == GDNNodeType.UNIT)
                            units++;
                    else
                    if (n.getType() == GDNNodeType.INTERFACE)
                            interfaces++;
                    else
                    if (n.getType() == GDNNodeType.GLOBAL_VAR)
                            glob++;
                    else
                    if (n.getType() == GDNNodeType.FUNCTION)
                            func++;
                    else
                    if (n.getType() == GDNNodeType.TYPE)
                            types++;
            }
    
            sb.append("GDN [numNodes = ")
              .append(net.getVertexCount())
              .append(", ")
              .append(net.getEdgeCount())
              .append("]\n");
            
            sb.append("Node distr:")
              .append("\npackages    = ").append(packages)
              .append("\nunits       = ").append(units)
              .append("\ninterfaces  = ").append(interfaces)
              .append("\nglobal vars = ").append(glob)
              .append("\nfunctions   = ").append(func)
              .append("\ntypes       = ").append(types);
            
            Collection<GDNLink> ilc = net.getEdges();
            Iterator<GDNLink> li = ilc.iterator();
            
            int contains = 0, refPack = 0, refUnit = 0, calls = 0, acc = 0;
            int ext = 0, imple = 0, gv = 0, lv = 0, fp = 0, fr = 0, inst = 0;
            
            while (li.hasNext()) {
                    GDNLink l = li.next();
                    if (l.getType() == GDNLinkType.CONTAINS) contains++;
                    else 
                    if (l.getType() == GDNLinkType.REFERENCES) {
                            if (l.getSrc().getType() == GDNNodeType.PACKAGE && 
                                    l.getDst().getType() == GDNNodeType.PACKAGE) 
                            {
                                    refPack++;
                            }
                            else
                            if (unitOrInterface(l.getSrc()) && unitOrInterface(l.getDst())) {
                                    refUnit++;
                            }
                            else
                                    LOG.error("Wrong REFERENCES link: " + 
                                                        l.getSrc().getDesc() +  " --> " + l.getDst().getDesc());
                    }
                    else
                    if (l.getType() == GDNLinkType.CALLS) calls++;
                    else if (l.getType() == GDNLinkType.EXTENDS) ext++;
                    else if (l.getType() == GDNLinkType.IMPLEMENTS) imple++;
                    else if (l.getType() == GDNLinkType.GLOBAL_VAR) gv++;
                    else if (l.getType() == GDNLinkType.LOCAL_VAR) lv++;
                    else if (l.getType() == GDNLinkType.FUNC_PARAM) fp++;
                    else if (l.getType() == GDNLinkType.FUNC_RET) fr++; 
                    else if (l.getType() == GDNLinkType.INSTANTIATES) inst++;
                    else if (l.getType() == GDNLinkType.ACCESS) acc++;
            }
            
            sb.append("\nLink distribution: ");
            sb.append("\ncontains    = ").append(contains)
              .append("\nref_pack    = ").append(refPack)
              .append("\nref_unit    = ").append(refUnit)
              .append("\ncalls       = ").append(calls)
              .append("\nextend      = ").append(ext)
              .append("\nimplements  = ").append(imple)
              .append("\nglobal_var  = ").append(gv)
              .append("\nlocal var   = ").append(lv)
              .append("\nfunc_param  = ").append(fp)
              .append("\nfunc_ret    = ").append(fr)
              .append("\ninst        = ").append(inst)
              .append("\naccess      = ").append(acc);
            return sb.toString();
    }
    
    private boolean unitOrInterface(GDNNode n) {
            return n.getType() == GDNNodeType.UNIT || n.getType() == GDNNodeType.INTERFACE;
    }
    
    private class NodeTransformer implements Transformer<GDNNode, String> {
            @Override
            public String transform(GDNNode arg0) {
                    return arg0.getName();
            }
    }
    
    private class LinkTransformer implements Transformer<GDNLink, Number> {

            @Override
            public Number transform(GDNLink arg0) {
                    return new Integer(1);
            }
    }
    
    public void exportToPajek(String outFilePath) 
            throws IOException
    {
            PajekNetWriter<GDNNode, GDNLink> pajko = new PajekNetWriter<GDNNode, GDNLink>();
            pajko.save(net, outFilePath, new NodeTransformer(), new LinkTransformer());
    }

    public DirectedSparseMultigraph<GDNNode, GDNLink> getNet() {
            return net;
    }

    public void exportUnits(String outDir) 
            throws IOException
    {
            HashSet<String> compactNames = new HashSet<String>();
            int innerUnits = 0;
            
            PrintWriter pw = new PrintWriter(
                            new BufferedWriter(
                                            new FileWriter(outDir + "\\units.dat")));
    
            Collection<GDNNode> inc = net.getVertices();
            Iterator<GDNNode> ni = inc.iterator();
            while (ni.hasNext()) {
                    GDNNode n = ni.next();
                    if (n.getType() == GDNNodeType.UNIT || n.getType() == GDNNodeType.INTERFACE) {
                            pw.println(n.getName());
                            
                            String compactName = n.getCompactName();
                            compactNames.add(compactName);
                            
                           // if (getContainedIn(n).isUnitOrInterface()) {
                            if ((getContainedIn(n)!= null) && (getContainedIn(n).isUnitOrInterface())) {
                                    ++innerUnits;
                            }
                    }
            }
            
            pw.close();
    
            LOG.info("Different compact names: " + compactNames.size());
            LOG.info("Inner units: " + innerUnits);
    }
    
    
    public void collectInstantiates() {
            Collection<GDNNode> inc = net.getVertices();
            Iterator<GDNNode> ni = inc.iterator();
            while (ni.hasNext()) {
                    GDNNode n = ni.next();
                    __collectInstantiates(n);
            }
    }
    
    private void __collectInstantiates(GDNNode n) {
            HashSet<GDNNode> instSet = new HashSet<GDNNode>();
            n.setInstantiatesSet(instSet);
            
            // direct instantiates
            Collection<GDNLink> outLinks = net.getOutEdges(n);
            Iterator<GDNLink> lit = outLinks.iterator();
            while (lit.hasNext()) {
                    GDNLink l = lit.next();
                    if (l.getType() == GDNLinkType.INSTANTIATES) {
                            GDNNode dst = l.getDst();
                            instSet.add(dst);
                    }
            }
            
            // indirect instantiates
            Collection<GDNLink> inLinks = net.getInEdges(n);
            lit = inLinks.iterator();
            while (lit.hasNext()) {
                    GDNLink l = lit.next();
                    if (l.getType() == GDNLinkType.REFERENCES) {
                            GDNNode src = l.getSrc();
                            if (src.getInstantiatesSet() == null) {
                                    __collectInstantiates(src);
                            }
                            
                            HashSet<GDNNode> instSetForSrc = src.getInstantiatesSet();
                            instSet.addAll(instSetForSrc);
                    }
            }
    }
    
 // ======
	// PANIPA
	// ======
	// method dump() in this class shows how GDN nodes and link can be traversed
	//
	// Nodes (see class svc.sneipl.gdn.GDNNode):
	//    each node has name (primary key), type (see class GDNNodeType), 
	// Links (see class svc.sneipl.gdn.GDNLink):
	//    each link has srcNode (reference to GDNNode), dstNode (reference to GDNNode), type (see class GDNNodeType) and weight (int).
	//    (srcNode, dstNode, type) are composite primary key
	
	
	/**
	 * This method exports GDN to GXL XML file (http://www.gupro.de/GXL/)
	 * 
	 * GXL is the Graph-Based Standard Exchange Format for Reengineering
	 * 
	 * see also: http://en.wikipedia.org/wiki/GXL
	 * 
	 * @param outXML - name of output XML file
	 */
	public void exportToGXL(String outXML) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method export GDN to GraphML XML file (http://graphml.graphdrawing.org/)
	 * 
	 * The GraphML file format results from the joint effort of the graph drawing community to 
	 * define a common format for exchanging graph structure data.
	 * 
	 * see also: http://en.wikipedia.org/wiki/GraphML
	 * 
	 * @param outXML - name of output XML file
	 */
	public void exportToGraphML(String outXML) throws IOException {
		int i=0;
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outXML)));
		
		pw.println("<?xml version=" +'"' +"1.0"+'"'+ " encoding="+ '"'+ "UTF-8"+'"'+"?>");
		pw.println("<graphml>");
		pw.println("<graph id="+'"'+ "G"+'"'+ " edgedefault=" +'"'+"directed"+'"'+ ">");
		pw.println("<key id="+'"'+ "nt"+'"'+ " for=" +'"'+"node"+'"'+ " attr.name="+'"'+ "nodeType"+'"'+" attr.type="+'"'+ "string"+'"'+"/>");
		pw.println("<key id="+'"'+ "lt"+'"'+ " for=" +'"'+"edge"+'"'+ " attr.name="+'"'+ "linkType"+'"'+" attr.type="+'"'+ "string"+'"'+"/>");
		pw.println("<key id="+'"'+ "lw"+'"'+ " for=" +'"'+"edge"+'"'+ " attr.name="+'"'+ "linkWeight"+'"'+" attr.type="+'"'+ "integer"+'"'+"/>");
		
		Collection<GDNNode> inc = net.getVertices();
		Iterator<GDNNode> ni = inc.iterator();
		while (ni.hasNext()) {
			GDNNode n = ni.next();
			//print vertices name
			pw.println("<node id="+'"'+n.getName()+'"'+">");
			pw.println("<data key="+'"'+"nt"+'"'+" sourceFileName="+'"'+n.getSourceFileName()+'"'+ ">" +n.getType()+"</data>");
			pw.println("</node>");
		}
		
		//print edge
		Collection<GDNLink> il = net.getEdges();
		Iterator<GDNLink> li = il.iterator();
		
		while (li.hasNext()) {
			GDNLink l = li.next();
			
			pw.println("<edge id="+'"'+"e"+i+'"'+" source="+'"'+l.getSrc().getName()+'"'+ " target="+'"'+l.getDst().getName()+'"'+">" );
			pw.println("<data key="+'"'+"lt"+'"'+">"+l.getType()+"</data>");
			pw.println("<data key="+'"'+"lw"+'"'+">" +l.getWeight()+"</data>");
			pw.println("</edge>");
			i=i+1;
			
		}
		pw.println("</graph>");
		pw.println("</graphml>");
		pw.close();
	}

}