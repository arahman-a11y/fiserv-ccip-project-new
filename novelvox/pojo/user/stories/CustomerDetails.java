package novelvox.pojo.user.stories;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerDetails {

    @JsonProperty(
        "UniqueID")
    private String uniqueID;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty(
        "PhoneNumber")
    private List<String> phoneNumber;
    @JsonProperty(
        "AccountNumber")
    private String accountNumber;
    @JsonProperty(
        "Name")
    private String name;
    @JsonProperty(
        "Email")
    private String email;
    @JsonProperty(
        "HomePhone")
    private String homePhone;
    @JsonProperty(
        "CustomerSince")
    private String customerSince;
    @JsonProperty(
        "Value")
    private String value;
    @JsonProperty(
        "DOB")
    private String dob;
    @JsonProperty(
        "CellPhone")
    private String cellPhone;
    @JsonProperty(
        "Address")
    private String address;
    @JsonProperty(
        "IDType")
    private String idType;
    @JsonProperty(
        "Issuedate")
    private String issuedate;
    @JsonProperty(
        "SSN")
    private String ssn;
    @JsonProperty(
        "MaskedSSN")
    private String maskedSSN;
    @JsonProperty(
        "BusinessPhone")
    private String businessPhone;
    @JsonProperty(
        "IssuedBy")
    private String issuedBy;
    @JsonProperty(
        "Expiration")
    private String expiration;
    @JsonProperty(
        "FullName")
    private String fullName;
    @JsonProperty(
        "MemberNumber")
    private String memberNumber;
    @JsonProperty(
        "CIFNo")
    private String cifNo;
    @JsonProperty(
        "InterestRate")
    private String interestRate;
    @JsonProperty(
        "OrgNumber")
    private String orgNumber;
    @JsonProperty(
        "PersonNumber")
    private String personNumber;
    @JsonProperty(
        "BeneficiaryName")
    private String beneficiaryName;
    @JsonProperty(
        "Mobile")
    private String mobile;
    @JsonProperty(
        "PassKey")
    private String passKey;
    @JsonProperty(
        "Phrase")
    private String phrase;
    @JsonProperty(
        "Role")
    private String role;
    @JsonProperty(
        "Ownership")
    private String ownership;
    @JsonProperty(
        "CardNumber")
    private String cardNumber;
    @JsonProperty(
        "Street")
    private String street;
    @JsonProperty(
        "City")
    private String city;
    @JsonProperty(
        "State")
    private String state;
    @JsonProperty(
        "Zip")
    private String zip;
    @JsonProperty(
        "Switch")
    private String switchValue;
    @JsonProperty(
        "AccountsRelated")
    private String accountsRelated;
    @JsonProperty(
        "View")
    private String view;
    @JsonProperty(
        "MothersMaidenName")
    private String mothersMaidenName;
    @JsonProperty(
        "RiskIndicator")
    private String riskIndicator;
    @JsonProperty(
        "NamePriority")
    private String namePriority;
    @JsonProperty(
        "Test")
    private String test;

    @JsonProperty(
        "RandomQuestion")
    private List<RandomQuestion> randomQuestion;

    public CustomerDetails() {
    }

    public CustomerDetails(String uniqueID, List<String> phoneNumber, String accountNumber, String name, 
            String email, String homePhone, String customerSince, String value, String dob, String cellPhone, 
            String address, String idType, String issuedate, String ssn, String maskedSSN, String businessPhone, 
            String issuedBy, String expiration, String fullName, String memberNumber, String cifNo, 
            String interestRate, String orgNumber, String personNumber, String beneficiaryName, String mobile, 
            String passKey, String phrase, String role, String ownership, String cardNumber, String street, 
            String city, String state, String zip, String switchValue, String accountsRelated, String view, 
            String mothersMaidenName, String riskIndicator, String namePriority, String test, 
            List<RandomQuestion> randomQuestion) {
        this.uniqueID = uniqueID;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.name = name;
        this.email = email;
        this.homePhone = homePhone;
        this.customerSince = customerSince;
        this.value = value;
        this.dob = dob;
        this.cellPhone = cellPhone;
        this.address = address;
        this.idType = idType;
        this.issuedate = issuedate;
        this.ssn = ssn;
        this.maskedSSN = maskedSSN;
        this.businessPhone = businessPhone;
        this.issuedBy = issuedBy;
        this.expiration = expiration;
        this.fullName = fullName;
        this.memberNumber = memberNumber;
        this.cifNo = cifNo;
        this.interestRate = interestRate;
        this.orgNumber = orgNumber;
        this.personNumber = personNumber;
        this.beneficiaryName = beneficiaryName;
        this.mobile = mobile;
        this.passKey = passKey;
        this.phrase = phrase;
        this.role = role;
        this.ownership = ownership;
        this.cardNumber = cardNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.switchValue = switchValue;
        this.accountsRelated = accountsRelated;
        this.view = view;
        this.mothersMaidenName = mothersMaidenName;
        this.riskIndicator = riskIndicator;
        this.namePriority = namePriority;
        this.test = test;
        this.randomQuestion = randomQuestion;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(String customerSince) {
        this.customerSince = customerSince;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMaskedSSN() {
        return maskedSSN;
    }

    public void setMaskedSSN(String maskedSSN) {
        this.maskedSSN = maskedSSN;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getCifNo() {
        return cifNo;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassKey() {
        return passKey;
    }

    public void setPassKey(String passKey) {
        this.passKey = passKey;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSwitchValue() {
        return switchValue;
    }

    public void setSwitchValue(String switchValue) {
        this.switchValue = switchValue;
    }

    public String getAccountsRelated() {
        return accountsRelated;
    }

    public void setAccountsRelated(String accountsRelated) {
        this.accountsRelated = accountsRelated;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public String getRiskIndicator() {
        return riskIndicator;
    }

    public void setRiskIndicator(String riskIndicator) {
        this.riskIndicator = riskIndicator;
    }

    public String getNamePriority() {
        return namePriority;
    }

    public void setNamePriority(String namePriority) {
        this.namePriority = namePriority;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public List<RandomQuestion> getRandomQuestion() {
        return randomQuestion;
    }

    public void setRandomQuestion(List<RandomQuestion> randomQuestion) {
        this.randomQuestion = randomQuestion;
    }

    @Override
    public String toString() {
        return "CustomerDetails [uniqueID=" + uniqueID + ", phoneNumber=" + phoneNumber + ", accountNumber="
                + accountNumber + ", name=" + name + ", email=" + email + ", homePhone=" + homePhone
                + ", customerSince=" + customerSince + ", value=" + value + ", dob=" + dob + ", cellPhone="
                + cellPhone + ", address=" + address + ", idType=" + idType + ", issuedate=" + issuedate + ", ssn="
                + ssn + ", maskedSSN=" + maskedSSN + ", businessPhone=" + businessPhone + ", issuedBy=" + issuedBy
                + ", expiration=" + expiration + ", fullName=" + fullName + ", memberNumber=" + memberNumber
                + ", cifNo=" + cifNo + ", interestRate=" + interestRate + ", orgNumber=" + orgNumber
                + ", personNumber=" + personNumber + ", beneficiaryName=" + beneficiaryName + ", mobile=" + mobile
                + ", passKey=" + passKey + ", phrase=" + phrase + ", role=" + role + ", ownership=" + ownership
                + ", cardNumber=" + cardNumber + ", street=" + street + ", city=" + city + ", state=" + state
                + ", zip=" + zip + ", switchValue=" + switchValue + ", accountsRelated=" + accountsRelated
                + ", view=" + view + ", mothersMaidenName=" + mothersMaidenName + ", riskIndicator=" + riskIndicator
                + ", namePriority=" + namePriority + ", test=" + test + ", randomQuestion=" + randomQuestion + "]";
    }
}

