package novelvox.pojo.user.stories;

public class DocDistributionOption {

    private String roi;
    private String recurringDate;
    private String portfolioValue;

    public String getRoi() {
        return roi;
    }
    public void setRoi(String roi) {
        this.roi = roi;
    }
    public String getRecurringDate() {
        return recurringDate;
    }
    public void setRecurringDate(String recurringDate) {
        this.recurringDate = recurringDate;
    }
    public String getPortfolioValue() {
        return portfolioValue;
    }
    public void setPortfolioValue(String portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public DocDistributionOption() {}

    public DocDistributionOption(String roi, String recurringDate, String portfolioValue) {
        this.roi = roi;
        this.recurringDate = recurringDate;
        this.portfolioValue = portfolioValue;
    }

    @Override
    public String toString() {
        return "DocDistributionOption [roi=" + roi + ", recurringDate=" + recurringDate + ", portfolioValue="
                + portfolioValue + "]";
    }

}
