package com.ssn.xml.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomAPP2 {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException, SAXException, IOException {
		
		String createdFile = "C:\\BOX\\ssnCoreJava\\src\\com\\ssn\\xml\\test\\createdFile.xml";
		
	   
	     
	     File xmlFile = new File(createdFile);

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			Document doc = documentBuilder.parse(xmlFile);
			
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("Student");

			for (int temp = 0; temp < nodeList.getLength(); temp++) {
				Node node = nodeList.item(temp);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element student = (Element) node;
					System.out.println("Student id : " + student.getAttribute("id"));
					System.out.println("First Name : " + student.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("First Name second : " + student.getElementsByTagName("firstname").item(1).getTextContent());
				}

			}
			
			System.out.println("End of program");

	}

}
