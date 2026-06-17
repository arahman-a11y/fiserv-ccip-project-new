package novelvox.pojo.user.stories;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loan {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("OpenDate")
    private String opendate;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Relationship")
    private String relationship;

    @JsonProperty("Img")
    private String img;

    @JsonProperty("LoanId")
    private String loanId;

    private LoanDetails details;

    @JsonProperty("collateral")
    private List<Collateral> collaterals;
    private List<TransactionHistory> transactionHistory;
    private List<Alert> alerts;

    public Loan() {}

    public Loan(String accountNumber, String type, String opendate, String status, String relationship,
         String img, LoanDetails details, List<TransactionHistory> transactionHistory, 
         List<Alert> alerts, String loanId, List<Collateral> collaterals) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.opendate = opendate;
        this.status = status;
        this.relationship = relationship;
        this.img = img;
        this.details = details;
        this.transactionHistory = transactionHistory;
        this.alerts = alerts;
        this.loanId = loanId;
        this.collaterals = collaterals;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public LoanDetails getDetails() {
        return details;
    }

    public void setDetails(LoanDetails details) {
        this.details = details;
    }

    public List<TransactionHistory> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<TransactionHistory> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public List<Collateral> getCollaterals() {
        return collaterals;
    }

    public void setCollaterals(List<Collateral> collaterals) {
        this.collaterals = collaterals;
    }

    @Override
    public String toString() {
        return "Loan [accountNumber=" + accountNumber + ", type=" + type + ", opendate=" + opendate + ", status="
                + status + ", relationship=" + relationship + ", img=" + img + ", loanId=" + loanId + ", details="
                + details + ", transactionHistory=" + transactionHistory + ", alerts=" + alerts + ", collaterals=" + collaterals + "]";
    }

}
