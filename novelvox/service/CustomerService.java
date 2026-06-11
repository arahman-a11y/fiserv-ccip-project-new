package novelvox.service;

import java.util.List;

import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.pojo.user.stories.LoanDetails;
import novelvox.pojo.user.stories.TransactionHistory;



public interface CustomerService {

    public CustomerDetails searchByPhoneNumber(String phoneNumber);

    public CustomerDetails searchBySSN(String ssn);

    public Boolean authenticateCustomer(String customerInfo);

    public CustomerDetails getCustomerInfoByAccountNumber(String accountNumber);

    // public List<Account> getAccounts(String accountNumber, String accountType);

    // public Account getAccountDetails(String accountNumber, String depositId);

    // public List<Transaction> getTransactions(String accountNumber, String depositId);

    // public List<Loan> getLoans(String accountNumber);

    public LoanDetails getLoanDetails(String accountNumber, String loanId);

    public List<TransactionHistory> getLoanTransactions(String accountNumber, String loanId);


}
