package com.tw.gurgaon;

public class Name {
    private final String firstName;
    private final String lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
