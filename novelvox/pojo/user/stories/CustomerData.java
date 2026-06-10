package novelvox.pojo.user.stories;

import java.time.LocalDate;

public class CustomerData {
    
    private String uniqueId;
    private String name;
    private String address;
    private String street;
    private String state;
    private String country;
    private String phoneNumber;
    private String zipCode;
    private String role;
    private String ownership;
    private String ssn;
    private LocalDate dob;
    private String pin;

    // No-arg Constructor
    public CustomerData() {
    }

    // Parameterized Constructor
    public CustomerData(String uniqueId, String name, String address, String street, String state,
                       String country, String phoneNumber, String zipCode, String role,
                       String ownership, String ssn, LocalDate dob, String pin) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.address = address;
        this.street = street;
        this.state = state;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.role = role;
        this.ownership = ownership;
        this.ssn = ssn;
        this.dob = dob;
        this.pin = pin;
    }

    // Getters and Setters
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "CustomerData{" +
                "uniqueId='" + uniqueId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", role='" + role + '\'' +
                ", ownership='" + ownership + '\'' +
                ", ssn='" + ssn + '\'' +
                ", dob=" + dob +
                ", pin='" + pin + '\'' +
                '}';
    }
}
