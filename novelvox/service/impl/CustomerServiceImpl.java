package novelvox.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import novelvox.common.PropertyUtil;
import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.pojo.user.stories.DebitCard;
import novelvox.pojo.user.stories.DebitCardDetails;
import novelvox.pojo.user.stories.DebitCardDTO;
import novelvox.pojo.user.stories.Deposit;
import novelvox.pojo.user.stories.DepositDTO;
import novelvox.pojo.user.stories.DepositDetails;
import novelvox.pojo.user.stories.FpDataObject2;
import novelvox.pojo.user.stories.Loan;
import novelvox.pojo.user.stories.LoanDTO;
import novelvox.pojo.user.stories.LoanDetails;
import novelvox.pojo.user.stories.TransactionHistory;
import novelvox.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

       private static final Logger logger = LogManager.getLogger(CustomerServiceImpl.class);
    
    @Override
    public CustomerDetails searchByPhoneNumber(String phoneNumber) {

        logger.info("Searching for customer with phone number: {}", phoneNumber);
        CustomerDetails customer = PropertyUtil.getCustomers().stream()
                .filter(c -> c.getPhoneNumber().contains(phoneNumber))
                .findFirst()
                .orElse(null);
        logger.info("Found customer: {}", customer);
        return customer;
    }

    @Override
    public CustomerDetails searchBySSN(String ssn) {

        logger.info("Searching for customer with SSN: {}", ssn);
        CustomerDetails customer = PropertyUtil.getCustomers().stream()
                .filter(c -> c.getSsn().equals(ssn))
                .findFirst()
                .orElse(null);
        logger.info("Found customer: {}", customer);
        return customer;
    }

    private boolean isDateOfBirth(String input) {
    try {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate.parse(input, formatter);
        return true;
    } catch (Exception e) {
        return false;
    }
}

    @Override
    public Boolean authenticateCustomer(String customerInfo) {
        boolean response = false;

        System.out.println("Authenticating customer with info: "+ customerInfo);
        String normalizedInput = customerInfo.replaceAll("\\D", "");
        System.out.println("Customer info length: " + normalizedInput.length());
         int size = normalizedInput.length();
         System.out.println("Normalized customer info: " + normalizedInput);
        if(isDateOfBirth(customerInfo)) {
            System.out.println("Found customer input AS DOB");
           response = PropertyUtil.getCustomers()
                            .stream()
                            .anyMatch(c -> c.getSsn() != null
                                    && c.getDob().equals(customerInfo));
        } else if(size == 9) {
            System.out.println("Found customer input AS SSN");

                response = PropertyUtil.getCustomers()
                            .stream()
                            .anyMatch(c -> c.getSsn() != null
                                    && c.getSsn().replaceAll("\\D", "")
                                            .equals(normalizedInput));
        } else{
            System.out.println("Customer input  possibly in PASS KEY(PIN).");
           response = PropertyUtil.getCustomers()
                            .stream()
                            .anyMatch(c -> c.getPassKey()!= null
                                    && c.getPassKey().equals(customerInfo));
        }
        System.out.println("Authentication response: " + response);
        return response;
    }

    @Override
    public CustomerDetails getCustomerInfoByAccountNumber(String accountNumber) {

        System.out.println("Searching for customer with accountNumber: " + accountNumber);
        CustomerDetails customer = PropertyUtil.getCustomers().stream()
                .filter(c -> c.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
        System.out.println("Found customer: " + customer);
        return customer;    
    }

    @Override
    public LoanDetails getLoanDetails(String accountNumber, String loanId) {
        return PropertyUtil.getLoansRecords().stream()
                .filter(ld -> loanId.equals(ld.getLoanId())
                        && accountNumber.equals(ld.getDetails().getAccountNumber()))
                .map(Loan::getDetails)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<TransactionHistory> getLoanTransactions(String accountNumber, String loanId) {

        return PropertyUtil.getLoansRecords().stream()
                .filter(ld -> loanId.equals(ld.getLoanId())
                        && accountNumber.equals(ld.getDetails().getAccountNumber()))
                .findFirst()
                .map(Loan::getTransactionHistory)
                .orElse(Collections.emptyList());
    }
    // @Override
    // public List<Account> getAccounts(String accountNumber, String accountType) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAccounts'");
    // }
    @Override
    public List<DepositDTO> getDeposits(String phoneNumber) {
        FpDataObject2 fpDataObject2 = PropertyUtil.getFpDataObject2();
        
        System.out.println("getDeposits FPDataObject2: " + fpDataObject2);
        if (fpDataObject2 == null || fpDataObject2.getPhoneNumber() == null
                || !fpDataObject2.getPhoneNumber().equals(phoneNumber)) {
            return Collections.emptyList();
        }

        return getDepositsFromFpDataObject2(fpDataObject2).stream()
                .map(DepositDTO::toDepositDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<LoanDTO> getLoans(String phoneNumber) {
        FpDataObject2 fpDataObject2 = PropertyUtil.getFpDataObject2();
        if (fpDataObject2 == null || fpDataObject2.getPhoneNumber() == null
                || !fpDataObject2.getPhoneNumber().equals(phoneNumber)) {
            return Collections.emptyList();
        }

        return getLoansFromFpDataObject2(fpDataObject2).stream()
                .map(LoanDTO::toLoanDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<DebitCardDTO> getCards(String phoneNumber) {
        FpDataObject2 fpDataObject2 = PropertyUtil.getFpDataObject2();
        if (fpDataObject2 == null || fpDataObject2.getPhoneNumber() == null
                || !fpDataObject2.getPhoneNumber().equals(phoneNumber)) {
            return Collections.emptyList();
        }

        return getCardsFromFpDataObject2(fpDataObject2).stream()
                .map(DebitCardDTO::toDebitCardDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DepositDetails getDepositDetails(String accountNumber, String depositId) {
        FpDataObject2 fpDataObject2 = PropertyUtil.getFpDataObject2();
          System.out.println("getDepositDetails FPDataObject2: " + fpDataObject2);
        return getDepositsFromFpDataObject2(fpDataObject2).stream()
                .filter(deposit -> isMatchingDeposit(deposit, accountNumber, depositId))
                .peek(deposit -> System.out.println("getDepositDetails Matching Deposit: " + deposit))
                .map(Deposit::getDetails)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<TransactionHistory> getDepositTransactionHistory(String accountNumber, String depositId) {
        FpDataObject2 fpDataObject2 = PropertyUtil.getFpDataObject2();
          System.out.println("getDepositTransactionHistory FPDataObject2: " + fpDataObject2);

        return getDepositsFromFpDataObject2(fpDataObject2).stream()
                .filter(deposit -> isMatchingDeposit(deposit, accountNumber, depositId))
                .peek(deposit -> System.out.println("getDepositTransactionHistory Matching Deposit: " + deposit))
                .map(Deposit::getTransactionHistory)
                .findFirst()
                .orElse(Collections.emptyList());
    }

    private boolean isMatchingDeposit(Deposit deposit, String accountNumber, String depositId) {
        if (deposit == null || deposit.getDepositId() == null || !deposit.getDepositId().equals(depositId)) {
            return false;
        }

        DepositDetails details = deposit.getDetails();
        return details != null
                && details.getAccountNumber() != null
                && details.getAccountNumber().equals(accountNumber);
    }

    private List<Deposit> getDepositsFromFpDataObject2(FpDataObject2 fpDataObject2) {
        if (fpDataObject2 == null || fpDataObject2.getAccountInformation() == null
                || fpDataObject2.getAccountInformation().getDeposits() == null) {
            return Collections.emptyList();
        }
        System.out.println("getDepositsFromFpDataObject2 Deposits: " + fpDataObject2.getAccountInformation().getDeposits());
        return fpDataObject2.getAccountInformation().getDeposits();
    }

      private  List<DebitCard> getDebitCardRecords(String phnNo) {
         try {
             FpDataObject2 fpDataObject2 = PropertyUtil.getFpDataObject2();
             logger.info("Debit card records loaded successfully");
             if (fpDataObject2.getPhoneNumber() != null && fpDataObject2.getPhoneNumber().equals(phnNo)) {
                 return fpDataObject2.getAccountInformation().getDebitCards();
             } else {
                 logger.warn("Phone number mismatch: expected {}, found {}", phnNo, fpDataObject2.getPhoneNumber());
                 return Collections.emptyList();
             }
         } catch (Exception e) {
             throw new RuntimeException("Failed to parse debit card records", e);
         }
    }

    @Override
    public DebitCardDetails getDebitCardsByCardNumber(String phnNo, String cardNumber) {

        List<DebitCard> cards = getDebitCardRecords(phnNo);

        if (cards.isEmpty() || cardNumber == null || cardNumber.length() != 4) {
            return null;
        }

      return cards.stream()
        .filter(card -> card.getCardNumberMasked() != null
                && card.getCardNumberMasked().endsWith(cardNumber))
        .findFirst().map( card -> card.getDetails())
        .orElse(null);  
    }

    @Override
    public List<TransactionHistory> getDebitCardTransactions(String phnNo, String cardNumber) {
        List<DebitCard> cards = getDebitCardRecords(phnNo);

        if (cards.isEmpty() || cardNumber == null || cardNumber.length() != 4) {
            return Collections.emptyList();
        }

      return cards.stream()
        .filter(card -> card.getCardNumberMasked() != null
                && card.getCardNumberMasked().endsWith(cardNumber))
        .findFirst().map( card -> card.getTransactions())
        .orElse(Collections.emptyList());      
    }

    private List<Loan> getLoansFromFpDataObject2(FpDataObject2 fpDataObject2) {
        if (fpDataObject2 == null || fpDataObject2.getAccountInformation() == null
                || fpDataObject2.getAccountInformation().getLoans() == null) {
            return Collections.emptyList();
        }
        return fpDataObject2.getAccountInformation().getLoans();
    }

    private List<DebitCard> getCardsFromFpDataObject2(FpDataObject2 fpDataObject2) {
        if (fpDataObject2 == null || fpDataObject2.getAccountInformation() == null
                || fpDataObject2.getAccountInformation().getDebitCards() == null) {
            return Collections.emptyList();
        }
        return fpDataObject2.getAccountInformation().getDebitCards();
    }

    
    
}
