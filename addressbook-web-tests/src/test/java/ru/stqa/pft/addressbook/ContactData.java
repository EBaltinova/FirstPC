package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String number_home;
    private final String email;

    public ContactData(String firstname, String lastname, String number_home, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.number_home = number_home;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNumber_home() {
        return number_home;
    }

    public String getEmail() {
        return email;
    }
}
