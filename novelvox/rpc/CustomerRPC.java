package novelvox.rpc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import novelvox.common.AESEncryption;
import novelvox.common.CommonGeneralFunctions;
import novelvox.common.CustomisedFunctions;
import novelvox.pojo.user.stories.SymXResponse;
import novelvox.service.CustomerService;
import novelvox.service.impl.CustomerServiceImpl;

public class CustomerRPC {
   private static final Logger logger = LogManager.getLogger(CustomerRPC.class);
   private static final CustomerService customerService = new CustomerServiceImpl();

   public static SymXResponse searchByPhoneNumber(String uniqueId, String sequenceId, String environmentId,
         String phoneNumber) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      phoneNumber = CustomisedFunctions.normalize(phoneNumber);
      logger.info("{} searchByPhoneNumber - sequenceId: {}, phoneNumber: {}", "INPUT|", sequenceId, phoneNumber);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "phoneNumber", phoneNumber);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId,
                              customerService.searchByPhoneNumber(phoneNumber))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse searchByAccountNumber(String uniqueId, String sequenceId, String environmentId,
         String accountNumber) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      accountNumber = CustomisedFunctions.normalize(accountNumber);
      System.out.println("searchByAccountNumber - sequenceId: " + sequenceId + ", accountNumber: " + accountNumber);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "accountNumber", accountNumber);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId,
                              customerService.getCustomerInfoByAccountNumber(accountNumber))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse searchBySSN(String uniqueId, String sequenceId, String environmentId, String ssn) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      ssn = CustomisedFunctions.normalize(ssn);
      logger.info("{} searchBySSN - sequenceId: {}, ssn: {}", "INPUT|", sequenceId, ssn);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "ssn", ssn);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.searchBySSN(ssn))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse authenticateCustomer(String uniqueId, String sequenceId, String environmentId,
         String customerInput) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      customerInput = CustomisedFunctions.normalize(customerInput);
      System.out.println("customerAuthentication - sequenceId: " + sequenceId + ", customerInput: " + customerInput);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "customerInput", customerInput);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId,
                              customerService.authenticateCustomer(customerInput))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse getdetailsOfDepositOrCardOrLoanOrSdb(String uniqueId, String sequenceId, String environmentId, String phoneNumber, String data) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      phoneNumber = CustomisedFunctions.normalize(phoneNumber);
      data = CustomisedFunctions.normalize(data);
      logger.info("{} getDeposits - sequenceId: {}, phoneNumber: {}", "INPUT|", sequenceId, phoneNumber);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "phoneNumber", phoneNumber, "data", data);
		if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? data.equalsIgnoreCase("deposit")
                              ? new SymXResponse("200", "SUCCESS", sequenceId,
                                    customerService.getDeposits(phoneNumber))
                              : data.equalsIgnoreCase("loan")
                                    ? new SymXResponse("200", "SUCCESS", sequenceId,
                                          customerService.getLoans(phoneNumber))
                                    : data.equalsIgnoreCase("card")
                                          ? new SymXResponse("200", "SUCCESS", sequenceId,
                                                customerService.getCards(phoneNumber))
                                          : data.equalsIgnoreCase("sdb")
                                                ? new SymXResponse("200", "SUCCESS", sequenceId,
                                                      customerService.getSafetyDepositBoxDetails(phoneNumber))
                                                : new SymXResponse("400", "Bad Request", sequenceId,
                                                      "Invalid data parameter. Must be 'deposit', 'loan', 'card', or 'sdb'.")
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              "Issue in validating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse getDepositDetails(String uniqueId, String sequenceId, String environmentId, String accountNumber, String depositId) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      accountNumber = CustomisedFunctions.normalize(accountNumber);
      depositId = CustomisedFunctions.normalize(depositId);
      logger.info("{} getDepositDetails - sequenceId: {}, accountNumber: {}, depositId: {}", "INPUT|", sequenceId, accountNumber, depositId);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "accountNumber", accountNumber, "depositId", depositId);
			if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.getDepositDetails(accountNumber, depositId))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }   
		

   public static SymXResponse getLoanDetails(String uniqueId, String sequenceId, String environmentId, String accNo, String loanId) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      accNo = CustomisedFunctions.normalize(accNo);
      loanId = CustomisedFunctions.normalize(loanId);
      System.out.println("getLoanDetails - sequenceId: " + sequenceId + ", accNo: " + accNo + ", loanId: " + loanId);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "accNo", accNo, "loanId", loanId);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId,
                              customerService.getLoanDetails(accNo, loanId))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse getLoanTransactions(String uniqueId, String sequenceId, String environmentId, String accNo, String loanId) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      accNo = CustomisedFunctions.normalize(accNo);
      loanId = CustomisedFunctions.normalize(loanId);
      System.out.println("getLoanTransactions - sequenceId: " + sequenceId + ", accNo: " + accNo + ", loanId: " + loanId);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "accNo", accNo, "loanId", loanId);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId,
                              customerService.getLoanTransactions(accNo, loanId))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

     public static SymXResponse getDepositTransactionHistory(String uniqueId, String sequenceId, String environmentId, String accountNumber, String depositId) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      accountNumber = CustomisedFunctions.normalize(accountNumber);
      depositId = CustomisedFunctions.normalize(depositId);
      logger.info("{} getDepositTransactionHistory - sequenceId: {}, accountNumber: {}, depositId: {}", "INPUT|", sequenceId, accountNumber, depositId);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "accountNumber", accountNumber, "depositId", depositId);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.getDepositTransactionHistory(accountNumber, depositId))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse getDebitCardTransactions(String uniqueId, String sequenceId, String environmentId, String phnNo, String cardNumber) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      phnNo = CustomisedFunctions.normalize(phnNo);
      cardNumber = CustomisedFunctions.normalize(cardNumber);
      logger.info("{} getDebitCardTransactions - sequenceId: {}, phnNo: {}, cardNumber: {}", "INPUT|", sequenceId, phnNo, cardNumber);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "phnNo", phnNo, "cardNumber", cardNumber);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.getDebitCardTransactions(phnNo, cardNumber))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse getDebitCardInfoByCardNumber(String uniqueId, String sequenceId, String environmentId, String phnNo, String cardNumber) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      phnNo = CustomisedFunctions.normalize(phnNo);
      cardNumber = CustomisedFunctions.normalize(cardNumber);
      logger.info("{} getDebitCardInfoByCardNumber - sequenceId: {}, phnNo: {}, cardNumber: {}", "INPUT|", sequenceId, phnNo, cardNumber);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "phnNo", phnNo, "cardNumber", cardNumber);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.getDebitCardsByCardNumber(phnNo, cardNumber))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse getPortfolio(String uniqueId, String sequenceId, String environmentId, String phoneNumber, String accountNumber) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      phoneNumber = CustomisedFunctions.normalize(phoneNumber);
      accountNumber = CustomisedFunctions.normalize(accountNumber);
      logger.info("{} getPortfolio - sequenceId: {}, phoneNumber: {}, accountNumber: {}", "INPUT|", sequenceId, phoneNumber, accountNumber);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "phoneNumber", phoneNumber, "accountNumber", accountNumber);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.getPortfolio(accountNumber, phoneNumber))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse getCollateralDetails(String uniqueId, String sequenceId, String environmentId, String loanId, String accountNumber) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      loanId = CustomisedFunctions.normalize(loanId);
      accountNumber = CustomisedFunctions.normalize(accountNumber);
      logger.info("{} getCollateralDetails - sequenceId: {}, loanId: {}, accountNumber: {}", "INPUT|", sequenceId, loanId, accountNumber);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "loanId", loanId, "accountNumber", accountNumber);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.getCollateralDetails(accountNumber, loanId))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

   public static SymXResponse getBeneficiaryCustomerDetails(String uniqueId, String sequenceId, String environmentId, String accNo, String role) {
      uniqueId = CustomisedFunctions.normalize(uniqueId);
      sequenceId = CustomisedFunctions.normalize(sequenceId);
      environmentId = CustomisedFunctions.normalize(environmentId);
      accNo = CustomisedFunctions.normalize(accNo);
      role = CustomisedFunctions.normalize(role);
      logger.info("{} getBeneficiaryCustomerDetails - sequenceId: {}, accNo: {}, role: {}", "INPUT|", sequenceId, accNo, role);
      if (CommonGeneralFunctions.validateLicense()) {
         String nullCheck = CommonGeneralFunctions.checkNulls("uniqueId", uniqueId, "sequenceId", sequenceId,
               "environmentId", environmentId, "accNo", accNo, "role", role);
         if (!nullCheck.equalsIgnoreCase("SUCCESS")) {
            return new SymXResponse("400", "Bad Request", sequenceId, nullCheck);
         } else {
            return AESEncryption.validateKeys(uniqueId, "SymXData")
                  && AESEncryption.validateKeys(environmentId, "SymXEnv")
                        ? new SymXResponse("200", "SUCCESS", sequenceId, customerService.getBeneficiaryCustomerDetails(accNo, "Beneficiary"))
                        : new SymXResponse("401", "UNAUTHORIZED", sequenceId,
                              " Issue in valdating UniqueId and EnvironmentId");
         }
      } else {
         return new SymXResponse("403", "License Expired", sequenceId, " Licenses has been expired");
      }
   }

}
