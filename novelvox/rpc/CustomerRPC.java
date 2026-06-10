package novelvox.rpc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.JsonUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import novelvox.common.AESEncryption;
import novelvox.common.CommonGeneralFunctions;
import novelvox.common.CustomisedFunctions;
import novelvox.pojo.user.stories.SymXResponse;
import novelvox.service.CustomerService;
import novelvox.service.impl.CustomerServiceImpl;

public class CustomerRPC {
    private static final Logger logger = LogManager.getLogger(CustomerRPC.class);
    private static final CustomerService customerService = new CustomerServiceImpl();

      public static void main(String[] args) {
        // Example usage
         System.out.println("Starting CustomerRPC main method");
        SymXResponse response = CustomerRPC.searchByPhoneNumber("uniqueId123", "sequenceId456", "envId789", "11111");
         System.out.println(response);
    }
  

     public static SymXResponse searchByPhoneNumber(String uniqueId, String sequenceId, String environmentId, String phoneNumber) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      phoneNumber = CustomisedFunctions.normalize(phoneNumber);
      logger.info("{} searchByPhoneNumber - sequenceId: {}, phoneNumber: {}", "INPUT|", sequenceId, phoneNumber);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId, "environmentId", environmentId, "phoneNumber", phoneNumber);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData") && AESEncryption.validateKeys(environmentId, "SymXEnv") ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.searchByPhoneNumber(phoneNumber)) : new SymXResponse("401", "UNAUTHORIZED", sequenceId, " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }
    

}
