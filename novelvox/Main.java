package novelvox;

import novelvox.pojo.user.stories.SymXResponse;
import novelvox.rpc.CustomerRPC;

public class Main {

        public static void main(String[] args) throws Exception {

                System.out.println("Hello Fiserv");

                System.out.println("Starting CustomerRPC main method");
                // SymXResponse response = CustomerRPC.searchByPhoneNumber("uniqueId123", "sequenceId456", "envId789",
                //                 "11111");

                // SymXResponse response = CustomerRPC.searchByAccountNumber("uniqueId123", "sequenceId456", "envId789",
                //                  "80100001236");
                // SymXResponse response2 = searchBySSN("uniqueId123", "sequenceId456", "envId789", "789-12-3456");
                // SymXResponse response = CustomerRPC.authenticateCustomer("uniqueId123", "sequenceId456", "envId789",
                //                   "456789010");
                // SymXResponse response = CustomerRPC.getLoanDetails("uniqueId123", "sequenceId456", "envId789",
                //                   "80100004567","11");

                // SymXResponse response = CustomerRPC.getLoanTransactions("uniqueId123", "sequenceId456", "envId789",
                //                         "80100004567","11");
                // SymXResponse response = CustomerRPC.getDeposits("uniqueId123", "sequenceId456", "envId789",
                //                   "22222", null);
                 SymXResponse response = CustomerRPC.getDepositTransactionHistory("uniqueId123", "sequenceId456", "envId789",
                                  "80100004567", "1");
                System.out.println(response);
        }
}
