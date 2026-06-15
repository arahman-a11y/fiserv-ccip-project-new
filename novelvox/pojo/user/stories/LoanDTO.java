package novelvox.pojo.user.stories;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanDTO {
    
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("OpenDate")
    private String opendate;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Relationship")
    private String relationship;

    @JsonProperty("Img")
    private String img;

    @JsonProperty("LoanId")
    private String loanId;

    public LoanDTO() {
    }

    public LoanDTO(String accountNumber, String type, String opendate, String status, String relationship,
            String img, String loanId) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.opendate = opendate;
        this.status = status;
        this.relationship = relationship;
        this.img = img;
        this.loanId = loanId;
    }

    public static LoanDTO toLoanDTO(Loan loan) {
        if (loan == null) {
            return null;
        }

        return new LoanDTO(loan.getAccountNumber(), loan.getType(), loan.getOpendate(), loan.getStatus(),
                loan.getRelationship(), loan.getImg(), loan.getLoanId());
    }
}
