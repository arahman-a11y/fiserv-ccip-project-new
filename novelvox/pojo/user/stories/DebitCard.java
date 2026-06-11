package novelvox.pojo.user.stories;

public class DebitCard {
    private String cardNumberMasked;
    private String type;
    private String opendate;
    private String status;
    private String relationship;
    private String img;

    private DebitCardDetails details;

    public DebitCard() {
    }

    public DebitCard(String cardNumberMasked, String type, String opendate, String status, String relationship,
            String img, DebitCardDetails details) {
        this.cardNumberMasked = cardNumberMasked;
        this.type = type;
        this.opendate = opendate;
        this.status = status;
        this.relationship = relationship;
        this.img = img;
        this.details = details;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public DebitCardDetails getDetails() {
        return details;
    }

    public void setDetails(DebitCardDetails details) {
        this.details = details;
    }
}
