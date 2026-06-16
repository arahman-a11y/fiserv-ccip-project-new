package novelvox.pojo.user.stories;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SafeDepositBox {
    private String accountNo;

    @JsonProperty("SDBId")
    private String sdbId;
    
    private String providerName;
    private String boxDtlStatus;
    private String boxDtlStatusDt;
    private String boxDesc;
    private String boxSizeCode;
    private String boxRentTypeCode;
    private String boxRentAmt;
    private String boxDiscountCode;
    private String billingMethod;
    private String billingFrequency;
    private String nextBillingDt;
    private String openDate;
    private String ownershipName;
    private String responsibleBranch;
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getSdbId() {
        return sdbId;
    }
    public void setSdbId(String sdbId) {
        this.sdbId = sdbId;
    }
    public String getProviderName() {
        return providerName;
    }
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public String getBoxDtlStatus() {
        return boxDtlStatus;
    }
    public void setBoxDtlStatus(String boxDtlStatus) {
        this.boxDtlStatus = boxDtlStatus;
    }
    public String getBoxDtlStatusDt() {
        return boxDtlStatusDt;
    }
    public void setBoxDtlStatusDt(String boxDtlStatusDt) {
        this.boxDtlStatusDt = boxDtlStatusDt;
    }
    public String getBoxDesc() {
        return boxDesc;
    }
    public void setBoxDesc(String boxDesc) {
        this.boxDesc = boxDesc;
    }
    public String getBoxSizeCode() {
        return boxSizeCode;
    }
    public void setBoxSizeCode(String boxSizeCode) {
        this.boxSizeCode = boxSizeCode;
    }
    public String getBoxRentTypeCode() {
        return boxRentTypeCode;
    }
    public void setBoxRentTypeCode(String boxRentTypeCode) {
        this.boxRentTypeCode = boxRentTypeCode;
    }
    public String getBoxRentAmt() {
        return boxRentAmt;
    }
    public void setBoxRentAmt(String boxRentAmt) {
        this.boxRentAmt = boxRentAmt;
    }
    public String getBoxDiscountCode() {
        return boxDiscountCode;
    }
    public void setBoxDiscountCode(String boxDiscountCode) {
        this.boxDiscountCode = boxDiscountCode;
    }
    public String getBillingMethod() {
        return billingMethod;
    }
    public void setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
    }
    public String getBillingFrequency() {
        return billingFrequency;
    }
    public void setBillingFrequency(String billingFrequency) {
        this.billingFrequency = billingFrequency;
    }
    public String getNextBillingDt() {
        return nextBillingDt;
    }
    public void setNextBillingDt(String nextBillingDt) {
        this.nextBillingDt = nextBillingDt;
    }
    public String getOpenDate() {
        return openDate;
    }
    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }
    public String getOwnershipName() {
        return ownershipName;
    }
    public void setOwnershipName(String ownershipName) {
        this.ownershipName = ownershipName;
    }
    public String getResponsibleBranch() {
        return responsibleBranch;
    }
    public void setResponsibleBranch(String responsibleBranch) {
        this.responsibleBranch = responsibleBranch;
    }

    public SafeDepositBox() {}

    public SafeDepositBox(String accountNo, String sdbId, String providerName, String boxDtlStatus,
            String boxDtlStatusDt, String boxDesc, String boxSizeCode, String boxRentTypeCode, String boxRentAmt,
            String boxDiscountCode, String billingMethod, String billingFrequency, String nextBillingDt,
            String openDate, String ownershipName, String responsibleBranch) {
        this.accountNo = accountNo;
        this.sdbId = sdbId;
        this.providerName = providerName;
        this.boxDtlStatus = boxDtlStatus;
        this.boxDtlStatusDt = boxDtlStatusDt;
        this.boxDesc = boxDesc;
        this.boxSizeCode = boxSizeCode;
        this.boxRentTypeCode = boxRentTypeCode;
        this.boxRentAmt = boxRentAmt;
        this.boxDiscountCode = boxDiscountCode;
        this.billingMethod = billingMethod;
        this.billingFrequency = billingFrequency;
        this.nextBillingDt = nextBillingDt;
        this.openDate = openDate;
        this.ownershipName = ownershipName;
        this.responsibleBranch = responsibleBranch;
    }
    @Override
    public String toString() {
        return "SafeDepositBox [accountNo=" + accountNo + ", sdbId=" + sdbId + ", providerName=" + providerName
                + ", boxDtlStatus=" + boxDtlStatus + ", boxDtlStatusDt=" + boxDtlStatusDt + ", boxDesc=" + boxDesc
                + ", boxSizeCode=" + boxSizeCode + ", boxRentTypeCode=" + boxRentTypeCode + ", boxRentAmt=" + boxRentAmt
                + ", boxDiscountCode=" + boxDiscountCode + ", billingMethod=" + billingMethod + ", billingFrequency="
                + billingFrequency + ", nextBillingDt=" + nextBillingDt + ", openDate=" + openDate + ", ownershipName="
                + ownershipName + ", responsibleBranch=" + responsibleBranch + "]";
    }

    

    
}
