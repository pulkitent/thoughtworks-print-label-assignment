package com.tw.party;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Label addFirstName(Label label) {
        return label.add(firstName);
    }

    Label addLastName(Label label, String separator) {
        return label.add(lastName + separator);
    }
}