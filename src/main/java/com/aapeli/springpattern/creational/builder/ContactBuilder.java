package com.aapeli.springpattern.creational.builder;

/**
 * @author jamesoladimeji
 * @created 02/12/2021 - 5:28 PM
 * @project IntelliJ IDEA
 */
public class ContactBuilder {
    private String firstName;
    private String lastName;
    private String email;

    public ContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return  this;
    }

    public ContactBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Contact contactBuilder() {
        return new Contact(firstName, lastName, email);
    }
}
