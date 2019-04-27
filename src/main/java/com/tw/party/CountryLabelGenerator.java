package com.tw.party;

import java.util.List;

public class CountryLabelGenerator extends LabelGenerator {
    private final static String countryTemplate = "%s %s %s, %s";
    private final static String reverseCountryTemplate = "%s %s, %s, %s";

    private final String country;

    public CountryLabelGenerator(String country) {
        this.country = country;
    }

    @Override
    public List<Label> generate(List<Guest> guests) {
        List<Guest> countrySpecificGuests = Guest.applyCountryFilter(guests, country);
        return super.generate(countrySpecificGuests);
    }
}