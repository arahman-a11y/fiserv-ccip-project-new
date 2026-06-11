package novelvox.pojo.user.stories;

import java.util.List;

public class Loan {
    private String accountNumber;
    private String type;
    private String opendate;
    private String status;
    private String relationship;
    private String img;

    private LoanDetails details;
    private List<TransactionHistory> transactionHistory;
    private List<Alert> alerts;

    public Loan() {
    }

    public Loan(String accountNumber, String type, String opendate, String status, String relationship, String img,
            LoanDetails details, List<TransactionHistory> transactionHistory, List<Alert> alerts) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.opendate = opendate;
        this.status = status;
        this.relationship = relationship;
        this.img = img;
        this.details = details;
        this.transactionHistory = transactionHistory;
        this.alerts = alerts;
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
}
