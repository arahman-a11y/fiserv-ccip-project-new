package novelvox.pojo.user.stories;

public class Collateral {
    private String collateralId;
    private String collateralIdentType;
    private String collateralIdentValue;
    private String collateralDesc;
    private String pledgedAmt;
    private String collateralDetailStatus;
    private String collateralDetailStatusDt;

    public String getCollateralId() {
        return collateralId;
    }
    public void setCollateralId(String collateralId) {
        this.collateralId = collateralId;
    }
    public String getCollateralIdentType() {
        return collateralIdentType;
    }
    public void setCollateralIdentType(String collateralIdentType) {
        this.collateralIdentType = collateralIdentType;
    }
    public String getCollateralIdentValue() {
        return collateralIdentValue;
    }
    public void setCollateralIdentValue(String collateralIdentValue) {
        this.collateralIdentValue = collateralIdentValue;
    }
    public String getCollateralDesc() {
        return collateralDesc;
    }
    public void setCollateralDesc(String collateralDesc) {
        this.collateralDesc = collateralDesc;
    }
    public String getPledgedAmt() {
        return pledgedAmt;
    }
    public void setPledgedAmt(String pledgedAmt) {
        this.pledgedAmt = pledgedAmt;
    }
    public String getCollateralDetailStatus() {
        return collateralDetailStatus;
    }
    public void setCollateralDetailStatus(String collateralDetailStatus) {
        this.collateralDetailStatus = collateralDetailStatus;
    }
    public String getCollateralDetailStatusDt() {
        return collateralDetailStatusDt;
    }
    public void setCollateralDetailStatusDt(String collateralDetailStatusDt) {
        this.collateralDetailStatusDt = collateralDetailStatusDt;
    }

    public Collateral(String collateralId, String collateralIdentType, String collateralIdentValue,
            String collateralDesc, String pledgedAmt, String collateralDetailStatus, String collateralDetailStatusDt) {
        this.collateralId = collateralId;
        this.collateralIdentType = collateralIdentType;
        this.collateralIdentValue = collateralIdentValue;
        this.collateralDesc = collateralDesc;
        this.pledgedAmt = pledgedAmt;
        this.collateralDetailStatus = collateralDetailStatus;
        this.collateralDetailStatusDt = collateralDetailStatusDt;
    }

    public Collateral() {}

}
