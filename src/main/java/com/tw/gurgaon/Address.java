package com.tw.gurgaon;

public class Address {
    private final String city;
    private final String state;
    private final String Country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        Country = country;
    }

    String getCountry() {
        return Country;
    }
}
