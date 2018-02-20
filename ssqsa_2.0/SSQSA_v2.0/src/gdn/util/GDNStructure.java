package gdn.util;

import ecst.ECSTLoaderException;
import gdn.GDNLink;
import gdn.GDNLinkType;
import gdn.GDNNode;
import gdn.GDNNodeType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import util.DirectoryWalker;
import util.LOG;



public class GDNStructure {
	
	
	static LinkedList<GDNNode> cvorovi ;
	static LinkedList<GDNLink> ivice;
	static GDNStruct gdnStruct;
	
	private static LinkedList<String> compilationUnits; 
	
	
	public static LinkedList<String> getFilesFromFolder(String workingDir){
		
		File f = new File(workingDir);
		if (!f.exists() && !f.isDirectory()) {
			LOG.info("Sneipl error: directory " + workingDir + " does not exists");
			return null;
		} 
			
		DirectoryWalker dw = new DirectoryWalker(workingDir, new String[]{"xml"});
		compilationUnits = dw.getFiles();
		
		return compilationUnits;
		
	}
	
	

	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	private static Document initXMLParser(String xmlFile) 
			throws ECSTLoaderException
		{
			File file = new File(xmlFile);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = null;
			try {
				db = dbf.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
					throw new ECSTLoaderException("Cannot instantiate new document builder," +
						"ParserConfigurationException", e);
			}
		
			Document doc = null;
			try {
				doc = db.parse(file);
			} catch (SAXException e) {
				throw new ECSTLoaderException("Cannot parse " + xmlFile + ", SAXException ", e);
			} catch (IOException e) {
				throw new ECSTLoaderException("Cannot parse " + xmlFile + ", IOException ", e);
			}
			
			doc.getDocumentElement().normalize();
		
			return doc;
		}
		
	
	
		private static GDNStruct parse(Document doc) throws Exception{
		
			
			//Element rootElement = doc.getDocumentElement();
			//System.out.println(rootElement.toString());
			cvorovi = new LinkedList<GDNNode>();
			ivice = new LinkedList<GDNLink>();
			
			NodeList nl = doc.getElementsByTagName("node");
			if(nl != null && nl.getLength() > 0) {
				for(int i = 0 ; i < nl.getLength();i++) {

					//get the node element
					Element el = (Element)nl.item(i);
				
					//get the id
					String name = el.getAttribute("id");

				//	System.out.println(name.toString());
					
					
					
					NodeList data = el.getElementsByTagName("data");
				
					Element dta =(Element) data.item(0);
					String edgeType = dta.getTextContent();
					
					GDNNodeType type = GDNNodeType.valueOf(edgeType);
					
					//System.out.println(tip.toString());
				
					
					GDNNode cvor = new GDNNode(name, type);
					cvorovi.add(cvor);
				}
			}
			
			NodeList edges = doc.getElementsByTagName("edge");
			if(edges != null && edges.getLength() > 0) {
				for(int i = 0 ; i < edges.getLength();i++) {

					
					Element el = (Element)edges.item(i);
				
					String id = el.getAttribute("id");
					
					
					String source = el.getAttribute("source");
					String target = el.getAttribute("target");
				
					NodeList data = el.getElementsByTagName("data");
					
					Element type =(Element) data.item(0);
					String edgeType = type.getTextContent();
					
					
					Element weight =(Element) data.item(1);
					String edgeWeight = weight.getTextContent();

					GDNNode src = null;
					GDNNode dsc = null;
					
					for(GDNNode g:cvorovi){
						
						if(g.getName().equalsIgnoreCase(source)){
							
							src = g;
						}
						if(g.getName().equalsIgnoreCase(target)){
							dsc = g;
						}
						
					}
					
					GDNLinkType LinkType = GDNLinkType.valueOf(edgeType);
					
					GDNLink link = new GDNLink(id, src, dsc,LinkType , edgeWeight);
					
					ivice.add(link);
				}
				
			}
			
			gdnStruct = new GDNStruct(cvorovi, ivice);
			
			return gdnStruct;
			
		
		}
		
		static private void printGDN(GDNStruct struct){
			
			for(GDNNode g:struct.getNodes()){
				System.out.println("<node id="+'"'+g.getName()+'"'+">");
				System.out.println("<data key="+'"'+"nt"+'"'+">" +g.getType()+"</data>");
				System.out.println("</node>");
				
			}
			
			
			for(GDNLink l:struct.getLinks()){
				System.out.println("<edge id="+'"'+l.getName()+'"'+" source="+'"'+l.getSrc().getName()+'"'+ " target="+'"'+l.getDst().getName()+'"'+">");
				System.out.println("<data key="+'"'+"lt"+'"'+">"+l.getType()+"</data>");
				System.out.println("<data key="+'"'+"lw"+'"'+">" +l.getWeight()+"</data>");
				System.out.println("</edge>");
			}
		}
		
		static private void printToXMLFile(GDNStruct struct, String outPathAndNameForXML) throws IOException{
			
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outPathAndNameForXML)));
			
			pw.println("<?xml version=" +'"' +"1.0"+'"'+ " encoding="+ '"'+ "UTF-8"+'"'+"?>");
			pw.println("<graphml>");
			pw.println("<graph id="+'"'+ "G"+'"'+ " edgedefault=" +'"'+"directed"+'"'+ ">");
			pw.println("<key id="+'"'+ "nt"+'"'+ " for=" +'"'+"node"+'"'+ " attr.name="+'"'+ "nodeType"+'"'+" attr.type="+'"'+ "string"+'"'+"/>");
			pw.println("<key id="+'"'+ "lt"+'"'+ " for=" +'"'+"edge"+'"'+ " attr.name="+'"'+ "linkType"+'"'+" attr.type="+'"'+ "string"+'"'+"/>");
			pw.println("<key id="+'"'+ "lw"+'"'+ " for=" +'"'+"edge"+'"'+ " attr.name="+'"'+ "linkWeight"+'"'+" attr.type="+'"'+ "integer"+'"'+"/>");
			
			for(GDNNode g:struct.getNodes()){
				pw.println("<node id="+'"'+g.getName()+'"'+">");
				pw.println("<data key="+'"'+"nt"+'"'+">" +g.getType()+"</data>");
				pw.println("</node>");
				
			}
			
			
			for(GDNLink l:struct.getLinks()){
				pw.println("<edge id="+'"'+l.getName()+'"'+" source="+'"'+l.getSrc().getName()+'"'+ " target="+'"'+l.getDst().getName()+'"'+">");
				pw.println("<data key="+'"'+"lt"+'"'+">"+l.getType()+"</data>");
				pw.println("<data key="+'"'+"lw"+'"'+">" +l.getWeight()+"</data>");
				pw.println("</edge>");
			}
			
			pw.println("</graph>");
			pw.println("</graphml>");
			pw.close();
		}
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	public static void main(String[] args) 
			throws IOException
		{
			
			LinkedList<String> lista = getFilesFromFolder(args[0]);
			
			String fajl = lista.get(0);
			
			System.out.println(fajl);
			
			try {
				Document doc = initXMLParser(fajl);
				
				
				parse(doc);
				
				
				printGDN(gdnStruct);
				
				printToXMLFile(gdnStruct, "D:/fajl");
				
			} catch (ECSTLoaderException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
		}
}
