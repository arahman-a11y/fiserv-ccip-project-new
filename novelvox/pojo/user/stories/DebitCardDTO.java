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
}