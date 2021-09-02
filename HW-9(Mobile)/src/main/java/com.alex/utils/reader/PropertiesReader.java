package com.alex.utils.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesReader {

    private static final Logger LOG = LogManager.getLogger(PropertiesReader.class);

    public static String getValueProperty(String key) {
        Properties properties = new Properties();
        try {
            properties.load(Objects.requireNonNull(PropertiesReader
                    .class.getClassLoader().getResourceAsStream("properties/data.properties")));
            return properties.getProperty(key);
        } catch (IOException e) {
            LOG.error("File properties does not exist!");
            throw new RuntimeException("error with properties reading");
        }
    }
}