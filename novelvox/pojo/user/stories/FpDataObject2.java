package novelvox.pojo.user.stories;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FpDataObject2 {

    private String phoneNumber;
    private List<CustomerDetails> memberInformation;
    private AccountInformation accountInformation;
    private List<Deposit> deposits;
    private List<Loan> loans;
    @JsonProperty("debit_cards")
    private List<DebitCard> debitCards;

    public FpDataObject2() {
    }

    public FpDataObject2(String phoneNumber, List<CustomerDetails> memberInformation,
            AccountInformation accountInformation) {
        this.phoneNumber = phoneNumber;
        this.memberInformation = memberInformation;
        this.accountInformation = accountInformation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<CustomerDetails> getMemberInformation() {
        return memberInformation;
    }

    public void setMemberInformation(List<CustomerDetails> memberInformation) {
        this.memberInformation = memberInformation;
    }

    public AccountInformation getAccountInformation() {
        if (accountInformation == null
                && (deposits != null || loans != null || debitCards != null)) {
            accountInformation = new AccountInformation(deposits, loans, debitCards);
        }
        return accountInformation;
    }

    public void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation;
    }

    @Override
    public String toString() {
        return "FpDataObject2 [phoneNumber=" + phoneNumber + ", memberInformation=" + memberInformation
                + ", accountInformation=" + accountInformation + "]";
    }

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
