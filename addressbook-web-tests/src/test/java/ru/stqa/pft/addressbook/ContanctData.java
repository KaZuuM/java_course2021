package ru.stqa.pft.addressbook;

public class ContanctData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String mobile;
    private final String workMobile;
    private final String email;
    private final String bDay;
    private final String bMonths;
    private final String bYear;
    private final String group;
    private final String address2;
    private final String phone2;
    private final String notes;

    public ContanctData(String firstName, String middleName, String lastName, String nickName, String title, String company, String address, String mobile, String workMobile, String email, String bDay, String bMonths, String bYear, String group, String address2, String phone2, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.mobile = mobile;
        this.workMobile = workMobile;
        this.email = email;
        this.bDay = bDay;
        this.bMonths = bMonths;
        this.bYear = bYear;
        this.group = group;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWorkMobile() {
        return workMobile;
    }

    public String getEmail() {
        return email;
    }

    public String getbDay() {
        return bDay;
    }

    public String getbMonths() {
        return bMonths;
    }

    public String getbYear() {
        return bYear;
    }

    public String getGroup() {
        return group;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getNotes() {
        return notes;
    }
}
