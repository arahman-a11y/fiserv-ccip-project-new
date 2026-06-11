package novelvox.pojo.user.stories;

import java.util.List;

public class Deposit {

    private String depositId;
    private String accountNumber;
    private String type;
    private String opendate;
    private String status;
    private String relationship;
    private String memoLedgerBalance;
    private String img;

    private DepositDetails details;
    private List<TransactionHistory> transactionHistory;
    private List<Alert> alerts;

    public Deposit() {
    }

    public Deposit(String accountNumber, String type, String opendate, String status, String relationship,
            String memoLedgerBalance, String img, DepositDetails details, String depositId,
            List<TransactionHistory> transactionHistory, List<Alert> alerts) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.opendate = opendate;
        this.status = status;
        this.relationship = relationship;
        this.memoLedgerBalance = memoLedgerBalance;
        this.img = img;
        this.details = details;
        this.depositId = depositId;
        this.transactionHistory = transactionHistory;
        this.alerts = alerts;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
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

    public String getMemoLedgerBalance() {
        return memoLedgerBalance;
    }

    public void setMemoLedgerBalance(String memoLedgerBalance) {
        this.memoLedgerBalance = memoLedgerBalance;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public DepositDetails getDetails() {
        return details;
    }

    public void setDetails(DepositDetails details) {
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

    @Override
    public String toString() {
        return "Deposit [depositId=" + depositId + ", accountNumber=" + accountNumber + ", type=" + type + ", opendate="
                + opendate + ", status=" + status + ", relationship=" + relationship + ", memoLedgerBalance="
                + memoLedgerBalance + ", img=" + img + ", details=" + details + ", transactionHistory="
                + transactionHistory + ", alerts=" + alerts + "]";
    }

    
}
