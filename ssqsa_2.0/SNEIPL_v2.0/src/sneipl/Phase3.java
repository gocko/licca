package sneipl;

import java.util.LinkedList;

import ecst.ECSTNode;
import ecst.ECSTTypedNode;
import ecst.ECSTree;
import ecst.universalNodes.BlockScope;
import ecst.universalNodes.FunctionCall;
import ecst.universalNodes.FunctionDecl;
import ecst.universalNodes.ImportDecl;
import ecst.universalNodes.Name;
import ecst.universalNodes.PackageDecl;
import ecst.universalNodes.ParameterDecl;
import ecst.universalNodes.SymTab;
import ecst.universalNodes.Type;
import ecst.universalNodes.VarDecl;
import gdn.GDN;
import util.LOG;

public class Phase3 {

	// input
	private String xmlFile;
	private ECSTree tree;
	//private GDN gdn;
	
	private ImportList importList;
	private TypeResolver typeResolver;
	private NameResolver nameResolver;
	private FuncCallResolver funcCallResolver;
	
	private PackageDecl packageNode = null;
	
	public Phase3(String xmlFile, ECSTree tree, GDN gdn) {
		this.xmlFile = xmlFile;
		this.tree = tree;
		
		importList = new ImportList(gdn, xmlFile);
		typeResolver = new TypeResolver(xmlFile, gdn, importList);
		nameResolver = new NameResolver(xmlFile, gdn, importList);
		funcCallResolver = new FuncCallResolver(xmlFile, gdn, importList);
	}
	
	public void analyze() {
		ECSTNode root = tree.getRoot();
		LinkedList<ECSTNode> queue = new LinkedList<ECSTNode>();
		
		// postponed stack for FUNCTION_CALL nodes
		LinkedList<FunctionCall> postponed = new LinkedList<FunctionCall>();
		
		queue.add(root);
		
		while (queue.size() > 0) {
			ECSTNode currentNode = queue.removeFirst();
			
			if (currentNode instanceof PackageDecl) {
				if (packageNode == null) {
					packageNode = (PackageDecl) currentNode;
					importList.initWithPackage(packageNode.getName(), xmlFile);
				} else {
					LOG.error("Phase2, duplicated PACKAGE_DECL in " + xmlFile);
				}
			}
			if (currentNode instanceof ImportDecl) {
				importDeclHandler((ImportDecl) currentNode);
			} 
			else
			if (currentNode instanceof Type) {
				typeHandler((Type) currentNode);
			}
			else
			if (currentNode instanceof Name) {
				nameHandler((Name) currentNode);
			}
			else
			if (currentNode instanceof FunctionCall) {
				postponed.addFirst((FunctionCall) currentNode);
			}
			else
			if (currentNode instanceof VarDecl) {
				VarDecl vd = (VarDecl) currentNode;
				insertSymbol(vd, vd.getName());
			}
			else
			if (currentNode instanceof ParameterDecl) {
				ParameterDecl pd = (ParameterDecl) currentNode;
				insertSymbol(pd, pd.getName());
			}
			
			LinkedList<ECSTNode> childs = currentNode.getChilds();
			for (int i = 0; i < childs.size(); i++) {
				queue.addLast(childs.get(i));
			}
		}
		
		while (postponed.size() > 0) {
			FunctionCall fcNode = postponed.removeFirst();
			funcCallHandler(fcNode);
		}
	}
	
	
	private void importDeclHandler(ImportDecl importNode) {
		importList.resolveImport(importNode.getName());
	}
	
	private void typeHandler(Type typeNode) {
		typeResolver.resolve(typeNode, packageNode);
	}
	
	private void nameHandler(Name nameNode) {
		nameResolver.resolve(nameNode);
	}
	
	
	private void funcCallHandler(FunctionCall funcCallNode) {
		funcCallResolver.resolve(funcCallNode);
	}
	
	private void insertSymbol(ECSTTypedNode typedNode, String name) {
		ECSTNode tmp = typedNode.getParent();
		
		while (tmp != null) {
			
			if (tmp instanceof BlockScope || tmp instanceof FunctionDecl) {
				SymTab st = (SymTab) tmp;
				
				ECSTTypedNode overridenType = typedNode.findInstantiate();
				if (overridenType != null) {
					st.insertName(name, overridenType.getTypeNode(), overridenType.getType());
				}
				else {
					st.insertName(name, typedNode.getTypeNode(), typedNode.getType());
				}
				
				break;
			}
			
			tmp = tmp.getParent();
		}
	}
}
