package novelvox.pojo.user.stories;

public class DebitCardDetails {

    private String cardNumberMasked;
    private String cardType;
    private String relationship;
    private String status;
    private String onLineLimit;
    private String pointofSaleLimit;
    private String accountingBranch;
    private String responsibilityCode;

    public DebitCardDetails() {
    }

    public DebitCardDetails(String cardNumberMasked, String cardType, String relationship, String status,
            String onLineLimit, String pointofSaleLimit, String accountingBranch, String responsibilityCode) {
        this.cardNumberMasked = cardNumberMasked;
        this.cardType = cardType;
        this.relationship = relationship;
        this.status = status;
        this.onLineLimit = onLineLimit;
        this.pointofSaleLimit = pointofSaleLimit;
        this.accountingBranch = accountingBranch;
        this.responsibilityCode = responsibilityCode;
    }

    public String getCardNumberMasked() {
        return cardNumberMasked;
    }

    public void setCardNumberMasked(String cardNumberMasked) {
        this.cardNumberMasked = cardNumberMasked;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOnLineLimit() {
        return onLineLimit;
    }

    public void setOnLineLimit(String onLineLimit) {
        this.onLineLimit = onLineLimit;
    }

    public String getPointofSaleLimit() {
        return pointofSaleLimit;
    }

    public void setPointofSaleLimit(String pointofSaleLimit) {
        this.pointofSaleLimit = pointofSaleLimit;
    }

    public String getAccountingBranch() {
        return accountingBranch;
    }

    public void setAccountingBranch(String accountingBranch) {
        this.accountingBranch = accountingBranch;
    }

    public String getResponsibilityCode() {
        return responsibilityCode;
    }

    public void setResponsibilityCode(String responsibilityCode) {
        this.responsibilityCode = responsibilityCode;
    }
}
