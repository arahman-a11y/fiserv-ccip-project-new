package novelvox.common;

public class CommonGeneralFunctions {

    public static boolean validateLicense() {
      return true;
   }

    public static String checkNulls(String... data) {
      for(int i = 0; i < data.length - 1; i += 2) {
         if (data[i + 1] == null) {
            return data[i] + " Param is Missing";
         }
      }

      return "SUCCESS";
   }

}
