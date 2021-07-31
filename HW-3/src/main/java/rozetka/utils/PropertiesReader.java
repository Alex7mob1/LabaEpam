package rozetka.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    Properties prop = new Properties();

   public PropertiesReader() {
       FileInputStream input;
       try {
           input = new FileInputStream("src\\main\\resources\\data.properties");
           prop.load(input);
           input.close();
       } catch (IOException e) {
           System.err.println("error");
           throw new RuntimeException("error with properties reading");
       }
   }

   public String getName(){
       String name=prop.getProperty("name");
       return name;
   }

    public String getLocation(){
        String location=prop.getProperty("location");
        return location;
    }
}
