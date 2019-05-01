package com.tw.party;

import static com.tw.party.Constant.commaSeparator;

public class Address {
    private final String city;
    private final String state;
    private final String Country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        Country = country;
    }

    Label addCountry(Label label) {
        return label.add(commaSeparator + Country);
    }

    boolean isFrom(String country) {
        return Country
                .toLowerCase()
                .equals(country
                        .toLowerCase());
    }
}
