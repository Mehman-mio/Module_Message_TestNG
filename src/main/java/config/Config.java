package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties getPropertyObject() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        return prop;
    }
    public static String getUrl() throws IOException {
        return getPropertyObject().getProperty("url");
    }
    public static String getPhoneSender() throws IOException {
        return getPropertyObject().getProperty("loginPhoneSender");
    }
    public static String getIdSender() throws IOException {
        return getPropertyObject().getProperty("loginIdSender");
    }
    public static String getPhoneReceiver() throws IOException {
        return getPropertyObject().getProperty("loginPhoneReceiver");
    }
    public static String getIdReceiver() throws IOException {
        return getPropertyObject().getProperty("loginIdReceiver");
    }
    public static String getVoenOfReceiver() throws IOException {
        return getPropertyObject().getProperty("voenOfReceiver");
    }
}