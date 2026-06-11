package novelvox.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import novelvox.common.PropertyUtil;
import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.pojo.user.stories.Loan;
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

    // @Override
    // public Account getAccountDetails(String accountNumber, String depositId) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAccountDetails'");
    // }

    // @Override
    // public List<Transaction> getTransactions(String accountNumber, String depositId) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getTransactions'");
    // }

    // @Override
    // public List<Loan> getLoans(String accountNumber) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getLoans'");
    // }
    
}
