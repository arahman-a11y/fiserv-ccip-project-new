package novelvox.common;

public class CustomisedFunctions {

      public static String normalize(String value) {
      if (value == null) {
         return null;
      } else {
         value = value.trim();
         return value.length() >= 2 && value.startsWith("\"") && value.endsWith("\"") ? value.substring(1, value.length() - 1) : value;
      }
   }


}
