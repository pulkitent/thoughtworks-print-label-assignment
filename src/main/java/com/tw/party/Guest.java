package com.tw.party;

import java.util.List;
import java.util.stream.Collectors;

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

    Label addFirstName(Label label) {
        return name.addFirstName(label);
    }

    Label addLastName(Label label, String separator) {
        return name.addLastName(label, separator);
    }

    Label addSalutation(Label label) {
        return gender.addSalutation(label);
    }

    static List<Guest> applyAgeFilter(List<Guest> guests, Integer permittedAge) {
        return guests
                .stream()
                .filter(guest -> guest.age > permittedAge)
                .collect(Collectors.toList());
    }

    static List<Guest> applyCountryFilter(List<Guest> guests, String country) {
        return guests
                .stream()
                .filter(guest -> guest.address
                        .isFrom(country))
                .collect(Collectors.toList());
    }
}


