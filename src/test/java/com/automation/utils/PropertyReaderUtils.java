package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReaderUtils {

    static Properties property;

    //Property Initialisation
    public static void intiProperty() {
        property = new Properties();
        try {
            property.load(new FileInputStream("src/test/resources/config/config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Property Reader
    public static String getProperty(String key) {
        return property.getProperty(key);

    }
}


