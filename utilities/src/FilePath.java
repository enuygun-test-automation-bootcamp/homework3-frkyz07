package utilities.src;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class FilePath {
        public static Properties properties;
        static {
            String filePath = "configuration.properties";
            try{
                FileInputStream fis = new FileInputStream(filePath);
                properties = new Properties();
                properties.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static String getProperty(String key){
            return properties.getProperty(key);
        }
}
