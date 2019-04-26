package com.tw.gurgaon;

public class Guest {
    private final Name name;
    private final Gender gender;
    private final Integer age;
    private final Address address;

    public Guest(Name name, Gender gender, Integer age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    Address getAddress() {
        return address;
    }

    Name getName() {
        return name;
    }

    Gender getGender() {
        return gender;
    }
}


