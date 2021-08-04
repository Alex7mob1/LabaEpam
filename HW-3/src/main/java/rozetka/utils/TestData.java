package rozetka.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import rozetka.model.Data;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class TestData {

    public static Data getTestData() {
        File file = new File("src/main/resources/data.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);

            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("data");

            Node node = nodeList.item(0);
            if (node.getNodeType()
                    == Node.ELEMENT_NODE) {
                Element tElement = (Element) node;

                String type = tElement.getElementsByTagName("type")
                        .item(0).getTextContent();

                String company = tElement.getElementsByTagName("company")
                        .item(0).getChildNodes().item(0).getNodeValue();

                int price = Integer.parseInt(tElement.getElementsByTagName("price")
                        .item(0).getChildNodes().item(0).getNodeValue());

                return new Data(type, company, price);
            }


        } catch (Exception ignored) {
        }
        throw new RuntimeException("0");
    }
}