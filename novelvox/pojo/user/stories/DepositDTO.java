package novelvox.pojo.user.stories;

public class DepositDTO {

    private String depositId;
    private String accountNumber;
    private String type;
    private String opendate;
    private String status;
    private String relationship;
    private String memoLedgerBalance;

    public DepositDTO() {
    }

    public DepositDTO(String depositId, String accountNumber, String type, String opendate, String status,
            String relationship, String memoLedgerBalance) {
        this.depositId = depositId;
        this.accountNumber = accountNumber;
        this.type = type;
        this.opendate = opendate;
        this.status = status;
        this.relationship = relationship;
        this.memoLedgerBalance = memoLedgerBalance;
    }

    public static DepositDTO toDepositDTO(Deposit deposit) {
        if (deposit == null) {
            return null;
        }

        DepositDTO depositDTO = new DepositDTO();
        depositDTO.setDepositId(deposit.getDepositId());
        depositDTO.setAccountNumber(deposit.getAccountNumber());
        depositDTO.setType(deposit.getType());
        depositDTO.setOpendate(deposit.getOpendate());
        depositDTO.setStatus(deposit.getStatus());
        depositDTO.setRelationship(deposit.getRelationship());
        depositDTO.setMemoLedgerBalance(deposit.getMemoLedgerBalance());
        return depositDTO;
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
}
