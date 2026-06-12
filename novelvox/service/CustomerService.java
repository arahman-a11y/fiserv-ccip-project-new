package novelvox.service;

import java.util.List;

import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.pojo.user.stories.Deposit;
import novelvox.pojo.user.stories.DepositDetails;
import novelvox.pojo.user.stories.LoanDetails;
import novelvox.pojo.user.stories.TransactionHistory;



public interface CustomerService {

    public CustomerDetails searchByPhoneNumber(String phoneNumber);

    public CustomerDetails searchBySSN(String ssn);

    public Boolean authenticateCustomer(String customerInfo);

    public CustomerDetails getCustomerInfoByAccountNumber(String accountNumber);

    public List<Deposit> getDeposits(String phoneNumber);

    public DepositDetails getDepositDetails(String accountNumber, String depositId);

    public List<TransactionHistory> getDepositTransactionHistory(String accountNumber, String depositId);

    public LoanDetails getLoanDetails(String accountNumber, String loanId);

    public List<TransactionHistory> getLoanTransactions(String accountNumber, String loanId);


}
