package com.dom.AbstractFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class AbstractFactoryEverdayExample {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder factory = abstractFactory.newDocumentBuilder();

        Document document = factory.parse("src/com/dom/AbstractFactory/test.xml");
        document.getDocumentElement().normalize();

        System.out.println(document.getDocumentElement().getNodeName());

        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());
    }

}
