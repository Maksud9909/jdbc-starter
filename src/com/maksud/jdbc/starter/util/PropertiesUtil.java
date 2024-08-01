package com.maksud.jdbc.starter.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


// класс для чтения properties
public class PropertiesUtil {
    public static final Properties PROPERTIES = new Properties();

    static { // он будет один раз читать наш метод
        loadProperties();
    }

    private static void loadProperties() {
        // таким образом мы читаем наш properties
        // из-за того, что это стрим надо его оборачивать
        try (InputStream resourceAsStream = PropertiesUtil.class.getClassLoader().getResourceAsStream("application.properties")) {
            PROPERTIES.load(resourceAsStream); // здесь мы к нему загружаем наш properties
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String get(String key){
        return PROPERTIES.getProperty(key);
    }

    private PropertiesUtil() {
    }
}
