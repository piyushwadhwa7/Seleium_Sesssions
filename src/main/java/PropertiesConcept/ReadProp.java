package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

    public final static String CONFIG_FILE_PATH=".\\src\\main\\java\\PropertiesConcept\\config.properties";
    static Properties prop;

    public static void main(String[] args) {
        try {
            FileInputStream ip= new FileInputStream(CONFIG_FILE_PATH);
            prop = new Properties();
            try {
                prop.load(ip);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
         String browsername= prop.getProperty("browser");
        System.out.println(browsername);
        String appUrl=prop.getProperty("url");
        System.out.println(appUrl);

        prop.setProperty("browser", "firefox");
        browsername=prop.getProperty("browser");
        System.out.println(browsername);

    }
}
