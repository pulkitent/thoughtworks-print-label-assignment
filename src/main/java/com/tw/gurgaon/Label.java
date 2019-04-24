package com.tw.gurgaon;

public class Label {

    private final String firstName;
    private final String lastName;
    private final Salutation salutation;

    private final static String space = " ";

    public Label(String firstName, String lastName, Salutation salutation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
    }

    public String print() {
        return String.valueOf(salutation) + space + firstName + space + lastName;
    }

    public String printReverse() {
        return String.valueOf(salutation) + space + lastName + space + firstName;
    }
}
