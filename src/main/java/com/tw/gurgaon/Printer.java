package com.tw.gurgaon;

import static com.tw.gurgaon.Template.*;

public class Printer {
    public String print(Label label, Template template) {
        Guest guest = label.getGuest();
        Name name = guest.getName();
        Address address = guest.getAddress();
        Gender gender = guest.getGender();

        String firstName = name.getFirstName();
        String lastName = name.getLastName();
        String Country = address.getCountry();
        String salutation = gender.getSalutation();
        String printedLabel = "";

        switch (template) {
            case ORIGINAL:
                printedLabel = String.format(ORIGINAL.getFormat(), salutation, firstName, lastName);
                break;
            case ORIGINALREVERSE:
                printedLabel = String.format(ORIGINALREVERSE.getFormat(), salutation, lastName, firstName);
                break;
            case WITHCOUNTRY:
                printedLabel = String.format(WITHCOUNTRY.getFormat(), salutation, firstName, lastName, Country);
                break;
            case WITHCOUNTRYREVERSE:
                printedLabel = String.format(WITHCOUNTRYREVERSE.getFormat(), salutation, lastName, firstName, Country);
                break;
        }
        return printedLabel;
    }
}