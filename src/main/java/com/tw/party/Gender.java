package com.tw.party;

public enum Gender {
    MALE("Mr"), FEMALE("Ms");
    private final String salutation;

    Gender(String salutation) {
        this.salutation = salutation;
    }

    public Label addSalutation(Label label) {
        return label.add(salutation);
    }
}