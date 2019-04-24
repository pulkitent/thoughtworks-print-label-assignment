package com.tw.gurgaon;

class Label {

    private final String firstName;
    private final String lastName;
    private final Salutation salutation;

    private final static String space = " ";

    Label(String firstName, String lastName, Salutation salutation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
    }

    String print() {
        return String.valueOf(salutation) + space + firstName + space + lastName;
    }

    String printReverse() {
        return String.valueOf(salutation) + space + lastName + space + firstName;
    }
}
