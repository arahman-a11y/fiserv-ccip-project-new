package novelvox.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import novelvox.pojo.user.stories.CustomerDetails;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PropertyUtil {

 private static final Properties PROPERTIES = new Properties();
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
       private static final Logger logger = LogManager.getLogger(PropertyUtil.class);

    static {
        try (InputStream inputStream =
        PropertyUtil.class.getClassLoader()
        .getResourceAsStream("property/application.properties")) {
            System.out.println(
    PropertyUtil.class.getClassLoader()
        .getResource("property/application.properties")
);
          
            System.out.println("Loading application.properties");
            System.out.println(inputStream);
            if (inputStream == null) {
                throw new RuntimeException("application.properties not found");
            }

            PROPERTIES.load(inputStream);
              System.out.println("PROPERTY" + getProperty("fiserv.dataset"));

        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file", e);
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    public static List<CustomerDetails> getCustomers() {
        try {
            String json = getProperty("fiserv.dataset");

            return OBJECT_MAPPER.readValue(
                    json,
                    new TypeReference<List<CustomerDetails>>() {
                    }
            );

        } catch (Exception e) {
            throw new RuntimeException("Failed to parse customer dataset", e);
        }
    }
}  
