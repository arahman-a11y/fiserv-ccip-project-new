package novelvox.pojo.user.stories;

public class Portfolio {

    private String openDt;
    private String accountNo;
    private String originatingBranch;
    private String responsibleBranch;
    private String nickname;
    private String portId;
    private HolderDetails holderdetails;
    private DocDistributionOption docDistributionOption;
    
    public String getOpenDt() {
        return openDt;
    }
    public void setOpenDt(String openDt) {
        this.openDt = openDt;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getOriginatingBranch() {
        return originatingBranch;
    }
    public void setOriginatingBranch(String originatingBranch) {
        this.originatingBranch = originatingBranch;
    }
    public String getResponsibleBranch() {
        return responsibleBranch;
    }
    public void setResponsibleBranch(String responsibleBranch) {
        this.responsibleBranch = responsibleBranch;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getPortId() {
        return portId;
    }
    public void setPortId(String portId) {
        this.portId = portId;
    }
    public HolderDetails getHolderdetails() {
        return holderdetails;
    }
    public void setHolderdetails(HolderDetails holderdetails) {
        this.holderdetails = holderdetails;
    }
    public DocDistributionOption getDocDistributionOption() {
        return docDistributionOption;
    }
    public void setDocDistributionOption(DocDistributionOption docDistributionOption) {
        this.docDistributionOption = docDistributionOption;
    }

    public Portfolio() {}

    public Portfolio(String openDt, String accountNo, String originatingBranch, String responsibleBranch,
            String nickname, String portId, HolderDetails holderdetails, DocDistributionOption docDistributionOption) {
        this.openDt = openDt;
        this.accountNo = accountNo;
        this.originatingBranch = originatingBranch;
        this.responsibleBranch = responsibleBranch;
        this.nickname = nickname;
        this.portId = portId;
        this.holderdetails = holderdetails;
        this.docDistributionOption = docDistributionOption;
    }

    
}
