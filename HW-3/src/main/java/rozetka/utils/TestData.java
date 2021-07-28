package rozetka.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import rozetka.model.Data;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static Data getTestData() {
        File file = new File("D:\\Java Prog\\LabaEpam\\HW-3\\src\\data.xml");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = null;

            document = builder.parse(file);

            List<Data> employees = new ArrayList<>();
            NodeList nodeList = document.getDocumentElement().getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) node;
                    String type = elem.getElementsByTagName("type")
                            .item(0).getChildNodes().item(0).getNodeValue();
                    String company = elem.getElementsByTagName("company").item(0)
                            .getChildNodes().item(0).getNodeValue();
                    String price = elem.getElementsByTagName("price")
                            .item(0).getChildNodes().item(0).getNodeValue();
                    employees.add(new Data(type, company, price));
                }
            }
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return null;
    }
}