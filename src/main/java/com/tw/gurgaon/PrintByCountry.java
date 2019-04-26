package com.tw.gurgaon;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static com.tw.gurgaon.Template.*;
import static com.tw.gurgaon.Template.COUNTRYREVERSE;

public class PrintByCountry implements PrintStrategy {
    private final String country;

    public PrintByCountry(String country) {
        this.country = country;
    }

    @Override
    public List<String> print(List<Label> labels) {
        List<String> printedLabels = new LinkedList<>();
        List<Label> labelsFromSpecificCountry = labels.stream()
                .filter(label -> label.getGuest()
                        .getAddress()
                        .getCountry()
                        .equals(this.country))
                .collect(Collectors.toList());

        for (Label label : labelsFromSpecificCountry) {
            Guest guest = label.getGuest();
            Name name = guest.getName();
            Address address = guest.getAddress();
            Gender gender = guest.getGender();

            String firstName = name.getFirstName();
            String lastName = name.getLastName();
            String Country = address.getCountry();
            String salutation = gender.getSalutation();

            printedLabels.add(String.format(COUNTRY.getFormat(), salutation, firstName, lastName, Country));
            printedLabels.add(String.format(COUNTRYREVERSE.getFormat(), salutation, lastName, firstName, Country));
        }
        return printedLabels;
    }
}