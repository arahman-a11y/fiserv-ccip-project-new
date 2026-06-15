package novelvox.common;

import java.util.ArrayList;
import java.util.List;

import novelvox.pojo.user.stories.CustomerDetails;

public class Commons {
public static final List<CustomerDetails> customerData = new ArrayList();
   public static final List<String> allAccount = new ArrayList();

   public void allAccount() {
      for(CustomerDetails data : customerData) {
        //  System.out.println("CUSTOMER DATA:::"+customerData);
         allAccount.add(data.getAccountNumber());
        // System.out.println("ALL Account::"+allAccount);
      }

   }

   public CustomerDetails getCustomerData(String accNo) {
      for(CustomerDetails data : customerData) {
         if (data.getAccountNumber().equalsIgnoreCase(accNo)) {
            return data;
         }
      }

      return null;
   }

   public double parseAmount(String amount) {
      String cleanedAmount = amount.replace("$", "").replace(",", "");
      double doubleAmount = Double.parseDouble(cleanedAmount);
      return doubleAmount;
   }

   public static void main(String[] args) {
   }
}
