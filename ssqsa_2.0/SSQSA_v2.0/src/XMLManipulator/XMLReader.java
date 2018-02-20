package XMLManipulator;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import ecst.ECSTLoaderException;

public class XMLReader {
	
	public Document initXMLParser(String xmlFile) 
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


}
