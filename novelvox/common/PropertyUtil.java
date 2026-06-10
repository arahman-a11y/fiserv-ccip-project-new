package novelvox.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\Fiserv Premier IVR\\com\\property\\config.properties"));

        String jsonString = properties.getProperty("user.details");

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(jsonString);

        // Read primitive fields
        int id = root.get("id").asInt();
        String name = root.get("name").asText();

        // Read nested object
        String city = root.get("address").get("city").asText();

        // Read array
        JsonNode skills = root.get("skills");
        for (JsonNode skill : skills) {
            System.out.println(skill.asText());
        }

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
    }
}  
