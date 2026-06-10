package novelvox.service.impl;

import java.util.List;

import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    
    @Override
    public CustomerDetails searchByPhoneNumber(String phoneNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchByPhoneNumber'");
    }

    @Override
    public CustomerDetails searchBySSN(String ssn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchBySSN'");
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

    @Override
    public List<Account> getAccounts(String accountNumber, String accountType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccounts'");
    }

    @Override
    public Account getAccountDetails(String accountNumber, String depositId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountDetails'");
    }

    @Override
    public List<Transaction> getTransactions(String accountNumber, String depositId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTransactions'");
    }

    @Override
    public List<Loan> getLoans(String accountNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLoans'");
    }

    @Override
    public Loan getLoanDetails(String accountNumber, String loanId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLoanDetails'");
    }
    
}
