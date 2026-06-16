package novelvox.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.pojo.user.stories.FpDataObject2;
import novelvox.pojo.user.stories.Loan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
// import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PropertyUtil {

   private static final Logger logger = LogManager.getLogger(PropertyUtil.class);
   private static final Properties propCommonUtility = new Properties();
   private static final PropertyUtil INSTANCE = new PropertyUtil();
    // private static final Properties PROPERTIES = new Properties();

    public PropertyUtil() {
      try {
        this.initializeUtil();
      } catch (Throwable e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
   }

   public static PropertyUtil getInstance() {
      return INSTANCE;
   }


    private static final ObjectMapper OBJECT_MAPPER = JsonMapper.builder()
            .enable(JsonReadFeature.ALLOW_UNQUOTED_FIELD_NAMES)
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .build();

    public void initializeUtil() throws Throwable{
        //  OBJECT_MAPPER.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        // try (InputStream inputStream =
        // PropertyUtil.class.getClassLoader()
        // .getResourceAsStream("property/application.properties")) {
        //     System.out.println("@@@" + PropertyUtil.class.getClassLoader().getResource("property/application.properties"));
          
        //     System.out.println("Loading application.properties");
        //     //System.out.println(inputStream);
        //     if (inputStream == null) {
        //         throw new RuntimeException("application.properties not found");
        //     }

        //     propCommonUtility.load(inputStream);
        //       //System.out.println("PROPERTY" + getProperty("fiserv.dataset"));

        // } catch (IOException e) {
        //     throw new RuntimeException("Failed to load properties file", e);
        // }

        File file = new File("property/application.properties");
      if (!file.exists()) {
         logger.info("PROCESS| property file not found");
      } else {
         try {
            Throwable var2 = null;
            Object var3 = null;

            try {
               FileInputStream in = new FileInputStream(file);

               try {
                  propCommonUtility.load(in);
               } finally {
                  if (in != null) {
                     in.close();
                  }

               }
            } catch (Throwable var12) {
               if (var2 == null) {
                  var2 = var12;
               } else if (var2 != var12) {
                  var2.addSuppressed(var12);
               }

               throw var2;
            }
         } catch (IOException e) {
            logger.error("Error loading properties: {}", e.getMessage(), e);
         }
        }
    }

    public static String getProperty(String key) {
        return propCommonUtility.getProperty(key);
    }

    public static List<CustomerDetails> getCustomers() {
        try {
            String json = cleanJsonProperty(getProperty("fiserv.dataset"));
            List<CustomerDetails> customers = OBJECT_MAPPER.readValue(
                    json,
                    new TypeReference<List<CustomerDetails>>() {
                    });
            logger.info("Customer records loaded successfully");
            return customers;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse customer dataset", e);
        }
    }

    public static FpDataObject2 getFpDataObject2() {
        try {
            String json = cleanJsonProperty(getProperty("fpDataObject2"));
            FpDataObject2 fpDataObject2 = OBJECT_MAPPER.readValue(json, FpDataObject2.class);
            logger.info("FpDataObject2 loaded successfully");
            return fpDataObject2;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse fpDataObject2", e);
        }
    }

    public static List<Loan> getLoansRecords() {
        try {
            String json = cleanJsonProperty(getProperty("fpDataObject2"));
            FpDataObject2 fpDataObject2 = OBJECT_MAPPER.readValue(json, FpDataObject2.class);
            logger.info("Loan records loaded successfully");
            return fpDataObject2.getAccountInformation().getLoans();         
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse loan records", e);
        }
    }

    private static String cleanJsonProperty(String value) {
        if (value == null) {
            throw new RuntimeException("Property value not found");
        }

        String json = value.trim();
        if (json.endsWith(";")) {
            json = json.substring(0, json.length() - 1).trim();
        }
        return json;
    }
}  
