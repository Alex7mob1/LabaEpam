//package rozetka.utils;
//
//import org.seleniumhq.jetty9.server.Authentication;
//import rozetka.model.Data;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//import java.io.File;
//
//public class XMLToObject {
//    public Authentication.User convert(){
//
//        try {
//            File file = new File("src/main/resources/data.xml");
//            JAXBContext jaxbContext=JAXBContext.newInstance(Data.class);
//
//            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//            Data data = (Data) jaxbUnmarshaller.unmarshal(file);
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}