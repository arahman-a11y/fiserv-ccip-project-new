package novelvox.pojo.user.stories;

import java.util.List;

public class AccountInformation {

    private List<Deposit> deposits;
    private List<Loan> loans;
    private List<DebitCard> debitCards;
    private SafeDepositBox safeDepositBox;
    private Portfolio portfolio;
    
    public List<Deposit> getDeposits() {
        return deposits;
    }
    public void setDeposits(List<Deposit> deposits) {
        this.deposits = deposits;
    }
    public List<Loan> getLoans() {
        return loans;
    }
    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
    public List<DebitCard> getDebitCards() {
        return debitCards;
    }
    public void setDebitCards(List<DebitCard> debitCards) {
        this.debitCards = debitCards;
    }
    
    public SafeDepositBox getSafeDepositBox() {
        return safeDepositBox;
    }
    public void setSafeDepositBox(SafeDepositBox safeDepositBox) {
        this.safeDepositBox = safeDepositBox;
    }
    public Portfolio getPortfolio() {
        return portfolio;
    }
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public AccountInformation() {}

    public AccountInformation(List<Deposit> deposits, List<Loan> loans, List<DebitCard> debitCards,
            SafeDepositBox safeDepositBox, Portfolio portfolio) {
        this.deposits = deposits;
        this.loans = loans;
        this.debitCards = debitCards;
        this.safeDepositBox = safeDepositBox;
        this.portfolio = portfolio;
    }

    
}