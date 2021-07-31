//package rozetka.utils;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import rozetka.model.Data;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestDatas {
//
//    public static List<Data> getTestData() {
//        File file = new File("D:/JavaProg/LabaEpam/HW-3/src/main/resources/data.xml");
//
//        try {
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document document = builder.parse(file);
//
//            document.getDocumentElement().normalize();
//            List<Data> data = new ArrayList<>();
//            NodeList nodeList = document.getElementsByTagName("data");
//
//            for (int i = 0; i < nodeList.getLength(); ++i) {
//                Node node = nodeList.item(i);
//                System.out.println("\nNode Name :"
//                        + node.getNodeName());
//                if (node.getNodeType()
//                        == Node.ELEMENT_NODE) {
//                    Element tElement = (Element) node;
//
//                    String type = tElement.getElementsByTagName("type")
//                            .item(0).getTextContent();
//                    System.out.println("type: " + tElement
//                            .getElementsByTagName("type")
//                            .item(0)
//                            .getTextContent());
//
//                    String company = tElement.getElementsByTagName("company")
//                            .item(0).getChildNodes().item(0).getNodeValue();
//                    System.out.println(" company: " + tElement
//                            .getElementsByTagName("company")
//                            .item(0)
//                            .getTextContent());
//
//                    String price = tElement.getElementsByTagName("price")
//                            .item(0).getChildNodes().item(0).getNodeValue();
//                    System.out.println(" price: " + tElement
//                            .getElementsByTagName("price")
//                            .item(0)
//                            .getTextContent());
//
//                    data.add(new Data(type, company, price));
//                }
//            }
//            return data;
//        } catch (Exception e) {
//            throw new RuntimeException("0");
//        }
//    }
//}