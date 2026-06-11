package novelvox.pojo.user.stories;

public class DepositDetails {
    private String accountNumber;
    private String type;
    private String relationship;
    private String memoLedgerBalance;
    private String accountingBranch;
    private String status;
    private String responsibilityCode;
    private String opendate;
    private String eBankingRestricted;
    private String treasuryNavigator;

    public DepositDetails() {
    }

    public DepositDetails(String accountNumber, String type, String relationship, String memoLedgerBalance,
            String accountingBranch, String status, String responsibilityCode, String opendate,
            String eBankingRestricted, String treasuryNavigator) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.relationship = relationship;
        this.memoLedgerBalance = memoLedgerBalance;
        this.accountingBranch = accountingBranch;
        this.status = status;
        this.responsibilityCode = responsibilityCode;
        this.opendate = opendate;
        this.eBankingRestricted = eBankingRestricted;
        this.treasuryNavigator = treasuryNavigator;
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

    public String getTreasuryNavigator() {
        return treasuryNavigator;
    }

    public void setTreasuryNavigator(String treasuryNavigator) {
        this.treasuryNavigator = treasuryNavigator;
    }
}
