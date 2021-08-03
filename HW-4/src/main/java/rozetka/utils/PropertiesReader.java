package rozetka.utils;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesReader {

    public static String getValueProperty(String key) {
        Properties properties = new Properties();
        try {
            properties.load(Objects.requireNonNull(PropertiesReader
                    .class.getClassLoader().getResourceAsStream("data.properties")));
            return properties.getProperty(key);
        } catch (IOException e) {
            System.err.println("error");
            throw new RuntimeException("error with properties reading");
        }
    }
}
