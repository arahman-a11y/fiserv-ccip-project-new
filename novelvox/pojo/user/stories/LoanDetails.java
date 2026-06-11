package novelvox.pojo.user.stories;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanDetails {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Rate")
    private String rate;

    @JsonProperty("PrincipalBalance")
    private String principalBalance;

    @Override
    public String toString() {
        return "LoanDetails [accountNumber=" + accountNumber + ", type=" + type + ", rate=" + rate
                + ", principalBalance=" + principalBalance + ", currentPaymentDuedate=" + currentPaymentDuedate
                + ", currentPaymentDueAmount=" + currentPaymentDueAmount + ", accountingBranch=" + accountingBranch
                + ", status=" + status + ", responsibilityCode=" + responsibilityCode + ", opendate=" + opendate
                + ", eBankingRestricted=" + eBankingRestricted + "]";
    }

    @JsonProperty("CurrentPaymentDuedate")
    private String currentPaymentDuedate;

    @JsonProperty("CurrentPaymentDueAmount")
    private String currentPaymentDueAmount;
    
    @JsonProperty("AccountingBranch")
    private String accountingBranch;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("ResponsibilityCode")
    private String responsibilityCode;

    @JsonProperty("OpenDate")
    private String opendate;

    @JsonProperty("EBankingRestricted")
    private String eBankingRestricted;

    public LoanDetails() {
    }

    public LoanDetails(String accountNumber, String type, String rate, String principalBalance,
            String currentPaymentDuedate, String currentPaymentDueAmount, String accountingBranch, String status,
            String responsibilityCode, String opendate, String eBankingRestricted) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.rate = rate;
        this.principalBalance = principalBalance;
        this.currentPaymentDuedate = currentPaymentDuedate;
        this.currentPaymentDueAmount = currentPaymentDueAmount;
        this.accountingBranch = accountingBranch;
        this.status = status;
        this.responsibilityCode = responsibilityCode;
        this.opendate = opendate;
        this.eBankingRestricted = eBankingRestricted;
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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPrincipalBalance() {
        return principalBalance;
    }

    public void setPrincipalBalance(String principalBalance) {
        this.principalBalance = principalBalance;
    }

    public String getCurrentPaymentDuedate() {
        return currentPaymentDuedate;
    }

    public void setCurrentPaymentDuedate(String currentPaymentDuedate) {
        this.currentPaymentDuedate = currentPaymentDuedate;
    }

    public String getCurrentPaymentDueAmount() {
        return currentPaymentDueAmount;
    }

    public void setCurrentPaymentDueAmount(String currentPaymentDueAmount) {
        this.currentPaymentDueAmount = currentPaymentDueAmount;
    }

    public String getAccountingBranch() {
        return accountingBranch;
    }

    public void setAccountingBranch(String accountingBranch) {
        this.accountingBranch = accountingBranch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponsibilityCode() {
        return responsibilityCode;
    }

    public void setResponsibilityCode(String responsibilityCode) {
        this.responsibilityCode = responsibilityCode;
    }

    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    public String getEBankingRestricted() {
        return eBankingRestricted;
    }

    public void setEBankingRestricted(String eBankingRestricted) {
        this.eBankingRestricted = eBankingRestricted;
    }

    
}
