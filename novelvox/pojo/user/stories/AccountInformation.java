package novelvox.pojo.user.stories;

import java.util.List;

public class AccountInformation {

    private List<Deposit> deposits;
    private List<Loan> loans;
    private List<DebitCard> debitCards;
    
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
    public AccountInformation() {
    }
    public AccountInformation(List<Deposit> deposits, List<Loan> loans, List<DebitCard> debitCards) {
        this.deposits = deposits;
        this.loans = loans;
        this.debitCards = debitCards;
    }

    

    

    
}