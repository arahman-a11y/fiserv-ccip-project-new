package novelvox.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import novelvox.common.AESEncryption;
import novelvox.common.PropertyUtil;
import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

       private static final Logger logger = LogManager.getLogger(CustomerServiceImpl.class);
    
    @Override
    public CustomerDetails searchByPhoneNumber(String phoneNumber) {
        // TODO Auto-generated method stub
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
        // TODO Auto-generated method stub
        logger.info("Searching for customer with SSN: {}", ssn);
        CustomerDetails customer = PropertyUtil.getCustomers().stream()
                .filter(c -> c.getSsn().equals(ssn))
                .findFirst()
                .orElse(null);
        logger.info("Found customer: {}", customer);
        return customer;
    }

    @Override
    public Boolean authenticateCustomer(String customerInfo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authenticateCustomer'");
    }

    @Override
    public Boolean getCustomerInfo(String accountNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerInfo'");
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

    // @Override
    // public Loan getLoanDetails(String accountNumber, String loanId) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getLoanDetails'");
    // }
    
}
