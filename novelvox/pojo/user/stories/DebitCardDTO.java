package novelvox.pojo.user.stories;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DebitCardDTO {

    @JsonProperty("CardNumberMasked")
    private String cardNumberMasked;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Opendate")
    private String openDate;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Relationship")
    private String relationship;

    public DebitCardDTO() {
    }

     public DebitCardDTO(String cardNumberMasked, String type, String openDate, String status, String relationship) {
        this.cardNumberMasked = cardNumberMasked;
        this.type = type;
        this.openDate = openDate;
        this.status = status;
        this.relationship = relationship;
    }

    public String getCardNumberMasked() {
        return cardNumberMasked;
    }

    public void setCardNumberMasked(String cardNumberMasked) {
        this.cardNumberMasked = cardNumberMasked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
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

    public static DebitCardDTO toDebitCardDTO(DebitCard debitCard) {
        if (debitCard == null) {
            return null;
        }

        return new DebitCardDTO(debitCard.getCardNumberMasked(), debitCard.getType(), debitCard.getOpendate(),
                debitCard.getStatus(), debitCard.getRelationship());
    }
}