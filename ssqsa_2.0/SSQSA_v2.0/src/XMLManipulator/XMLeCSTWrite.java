package XMLManipulator;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import org.antlr.runtime.tree.CommonTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import util.FileFind;



public class XMLeCSTWrite {

	private static Document document;

	 public static String newXMLeCST(CommonTree ct, String filePath, String fileName, String lastModified, boolean caseSensitive){
					 	
			String file = filePath + "\\"+ fileName + "_eCST_V"+ lastModified + ".xml";
					
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();			
			//DOM related - for obtaining the parses wich will generate DOM tree from XML			
				try{		            
		            DocumentBuilder builder = factory.newDocumentBuilder();
		            document = builder.newDocument();
				}catch(ParserConfigurationException pce) {
						// error parser building - options problem
						pce.printStackTrace();
				}				
				if (!document.equals(null)){
					
		 			//Element ver = document.createElement("versionElement");
		 			//ver.setAttribute("Version", lastModified);
		 			//document.appendChild(ver);
		 			
		 			document.appendChild(childToXMLElement(ct, document, caseSensitive));										
					try{
							//cuvamo u izlazni fajl
						TransformerFactory xformFactory = TransformerFactory.newInstance();
						Transformer idTransform = xformFactory.newTransformer();            
						idTransform.setOutputProperty(OutputKeys.INDENT, "yes");
						Source in = new javax.xml.transform.dom.DOMSource(document);		    
							//java.io.File f = new java.io.File(file);
						Result out = new javax.xml.transform.stream.StreamResult(new java.io.FileWriter(file));
						idTransform.transform(in,out);
					} 
						catch(Exception e) {
					// SAX Parsing Error
							System.out.println("Saving ERROR "	+ e );
						} 
						return file;
				} 
				return "";

	 }

		            
		            
	 protected static Element childToXMLElement(CommonTree ct, Document document, boolean caseSensitive){            
		 				
		 
		    	   Element childElement = document.createElement("childElement");
		    	  
		    	   Element token = document.createElement("token");
		    	   
		    	   if (ct.token != null) {
		   			String tokenContent = ct.token.getText();
		   			if (!caseSensitive)
		   				tokenContent = tokenContent.toUpperCase();
		    	   
		    	   token.setAttribute("text", tokenContent);
		    	   token.setAttribute("line", ""+ct.token.getLine());
		    	   token.setAttribute("column", ""+ct.token.getCharPositionInLine());
		    	   token.setAttribute("type", ""+ct.token.getType());		    	   
		    	   token.setAttribute("index", ""+ct.token.getTokenIndex());
		    	   
		    	   //ovaj deo mozda treba posle rekurzije
		    	   childElement.appendChild(token);
		    	   
		    	   }
		    	   	//zavirimo u svaki cvor stabla
					// prolazimo rekurzivno...
			    	   
			    	
		    	   	if (ct.getChildCount()>0){
		    	   		for(int i=0;i<ct.getChildCount();i++){
					
		    			   //za svaki napravimo token i prodjemo kroz decu
		    			   childElement.appendChild(childToXMLElement((CommonTree)ct.getChild(i), document, caseSensitive));
		    			   
		    	   		}
					}
		    	   	return childElement;
	 }
			
	 
				
}
