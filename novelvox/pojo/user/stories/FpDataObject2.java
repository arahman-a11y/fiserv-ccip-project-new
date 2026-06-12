package novelvox.pojo.user.stories;


import java.util.List;

public class FpDataObject2 {

    private String phoneNumber;
    private List<CustomerDetails> memberInformation;
    private AccountInformation accountInformation;

    public FpDataObject2() {
    }

    public FpDataObject2(String phoneNumber, List<CustomerDetails> memberInformation,
            AccountInformation accountInformation) {
        this.phoneNumber = phoneNumber;
        this.memberInformation = memberInformation;
        this.accountInformation = accountInformation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<CustomerDetails> getMemberInformation() {
        return memberInformation;
    }

    public void setMemberInformation(List<CustomerDetails> memberInformation) {
        this.memberInformation = memberInformation;
    }

    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation;
    }

    @Override
    public String toString() {
        return "FpDataObject2 [phoneNumber=" + phoneNumber + ", memberInformation=" + memberInformation
                + ", accountInformation=" + accountInformation + "]";
    }
}
