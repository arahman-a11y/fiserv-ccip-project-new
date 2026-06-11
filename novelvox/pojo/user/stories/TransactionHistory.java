package novelvox.pojo.user.stories;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionHistory {
    private String date;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("DebitAmount")
    private String debitAmount;

    @JsonProperty("CreditAmount")
    private String creditAmount;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public TransactionHistory(String date, String description, String debitAmount, String creditAmount) {
        this.date = date;
        this.description = description;
        this.debitAmount = debitAmount;
        this.creditAmount = creditAmount;
    }

    
}
