package rozetka.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import rozetka.model.Product;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestProducts {

    public static List<Product> getTestProducts() {
        File file = new File("D:/JavaProg/LabaEpam/HW-4/src/main/resources/products.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);

            document.getDocumentElement().normalize();
            List<Product> products = new ArrayList<>();
            NodeList nodeList = document.getElementsByTagName("product");

            for (int i = 0; i < nodeList.getLength(); ++i) {
                Node node = nodeList.item(i);
                System.out.println("\nNode Name :"
                        + node.getNodeName());
                if (node.getNodeType()
                        == Node.ELEMENT_NODE) {
                    Element tElement = (Element) node;

                    String type = tElement.getElementsByTagName("type")
                            .item(0).getTextContent();

                    String company = tElement.getElementsByTagName("company")
                            .item(0).getChildNodes().item(0).getNodeValue();

                    int price = Integer.parseInt(tElement.getElementsByTagName("price")
                            .item(0).getChildNodes().item(0).getNodeValue());

                    products.add(new Product(type, company, price));
                }
            }
            return products;
        } catch (Exception e) {
            throw new RuntimeException("0");
        }
    }
}