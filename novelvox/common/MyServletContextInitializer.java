package novelvox.common;

import java.util.List;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.pojo.user.stories.FpDataObject2;

public class MyServletContextInitializer implements ServletContextListener {
   PropertyUtil prop = new PropertyUtil();

   public void contextInitialized(ServletContextEvent e) {
      List<CustomerDetails> customerData = PropertyUtil.getCustomers();
      FpDataObject2 fpData = PropertyUtil.getFpDataObject2();

      for (CustomerDetails customerData2 : customerData) {
         System.out.println("Processing customer: " + customerData2);
      }

      Commons.customerData.clear();
      Commons.customerData.addAll(customerData);
      Commons.fpDataObject2 = fpData;
   }

   public static void main(String[] args) {
      (new MyServletContextInitializer()).contextInitialized((ServletContextEvent)null);
      // CustomerRPC customerRPC = new CustomerRPC();
      // SymXResponse response = CustomerRPC.getDebitCardTransactions("uniqueId123", "sequenceId456", "envId789",
      //                             "22222", "8429");
      // SymXResponse response = CustomerRPC.getDepositsLoansCards("uniqueId123", "sequenceId456", "envId789",
      //                             "22222", "card");
      
      // SymXResponse response = CustomerRPC.searchBySSN("uniqueId123", "sequenceId456", "envId789",
      //                             "123-45-1111");
                                  
      // System.out.println(response);
   }

   public void contextDestroyed(ServletContextEvent e) {
   }
}
