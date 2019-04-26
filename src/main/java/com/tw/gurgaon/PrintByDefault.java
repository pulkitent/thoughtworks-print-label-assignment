package com.tw.gurgaon;

import java.util.LinkedList;
import java.util.List;

import static com.tw.gurgaon.Template.*;

public class PrintByDefault implements PrintStrategy {
    @Override
    public List<String> print(List<Label> labels) {
        List<String> printedLabels = new LinkedList<>();
        for (Label label : labels) {
            Guest guest = label.getGuest();
            Name name = guest.getName();
            Address address = guest.getAddress();
            Gender gender = guest.getGender();

            String firstName = name.getFirstName();
            String lastName = name.getLastName();
            String Country = address.getCountry();
            String salutation = gender.getSalutation();

            printedLabels.add(String.format(DEFAULT.getFormat(), salutation, firstName, lastName, Country));
            printedLabels.add(String.format(DEFAULTREVERSE.getFormat(), salutation, lastName, firstName, Country));
        }
        return printedLabels;
    }
}
