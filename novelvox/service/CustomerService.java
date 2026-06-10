package novelvox.service;

import java.util.List;

import novelvox.pojo.user.stories.CustomerData;

public interface CustomerService {

    public CustomerData searchByPhoneNumber(String phoneNumber);

    public CustomerData searchBySSN(String ssn);

    public Boolean authenticateCustomer(String customerInfo);

    public Boolean getCustomerInfo(String accountNumber);

    public List<Account> getAccounts(String accountNumber, String accountType);

    public Account getAccountDetails(String accountNumber, String depositId);

    public List<Transaction> getTransactions(String accountNumber, String depositId);

    public List<Loan> getLoans(String accountNumber);

    public Loan getLoanDetails(String accountNumber, String loanId);

}
