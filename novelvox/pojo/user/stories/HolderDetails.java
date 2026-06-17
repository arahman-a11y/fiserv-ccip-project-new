package novelvox.pojo.user.stories;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HolderDetails {

    private String holderName;
    private String contactNumber;
    
    @JsonProperty("SSN")
    private String ssn;

    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public HolderDetails() {}

    public HolderDetails(String holderName, String contactNumber, String ssn) {
        this.holderName = holderName;
        this.contactNumber = contactNumber;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "HolderDetails [holderName=" + holderName + ", contactNumber=" + contactNumber + ", ssn=" + ssn
                + "]";
    }

    

    
}
