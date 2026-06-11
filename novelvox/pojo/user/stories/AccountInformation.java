package novelvox.pojo.user.stories;

import lombok.Data;
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

    
}