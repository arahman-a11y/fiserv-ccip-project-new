package novelvox.service;

import java.util.List;

import novelvox.pojo.user.stories.AccountInformation;
import novelvox.pojo.user.stories.Collateral;
import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.pojo.user.stories.DebitCardDetails;
import novelvox.pojo.user.stories.DebitCardDTO;
import novelvox.pojo.user.stories.DepositDTO;
import novelvox.pojo.user.stories.DepositDetails;
import novelvox.pojo.user.stories.LoanDTO;
import novelvox.pojo.user.stories.LoanDetails;
import novelvox.pojo.user.stories.Portfolio;
import novelvox.pojo.user.stories.SafeDepositBox;
import novelvox.pojo.user.stories.TransactionHistory;



public interface CustomerService {

    public CustomerDetails searchByPhoneNumber(String phoneNumber);

    public CustomerDetails searchBySSN(String ssn);

    public Boolean authenticateCustomer(String customerInfo);

    public CustomerDetails getCustomerInfoByAccountNumber(String accountNumber);

    public List<DepositDTO> getDeposits(String phoneNumber);

    public DepositDetails getDepositDetails(String accountNumber, String depositId);

    public List<TransactionHistory> getDepositTransactionHistory(String accountNumber, String depositId);

    public List<LoanDTO> getLoans(String phoneNumber);

    public List<DebitCardDTO> getCards(String phoneNumber);

    public LoanDetails getLoanDetails(String accountNumber, String loanId);

    public List<TransactionHistory> getLoanTransactions(String accountNumber, String loanId);

    public DebitCardDetails getDebitCardsByCardNumber(String phnNo, String cardNumber);

    public List<TransactionHistory> getDebitCardTransactions(String phnNo, String cardNumber);

    public Portfolio getPortfolio(String accNo, String phnNo);

    public Collateral getCollateralDetails(String accNo, String loanId);

    public CustomerDetails getBeneficiaryCustomerDetails(String accNo, String role);

    public SafeDepositBox getSafetyDepositBoxDetails(String phnNo, String type);

}
