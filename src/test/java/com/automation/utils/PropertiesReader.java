package com.automation.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    static Properties prop;
    public static void loadFile() throws IOException {
        prop = new Properties();
        prop.load(new FileReader("src/test/resources/config/application.properties"));
    }

    public static String getPropValue(String key){
        return prop.getProperty(key);
    }
}
