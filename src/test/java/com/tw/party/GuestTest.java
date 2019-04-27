package com.tw.party;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class GuestTest {
    @Test
    @DisplayName("Should add country to a label")
    void shouldAddCountry() {
        Guest guest = createTestDataGuest();
        Label label = new Label("");
        Label expectedLabel = new Label(" ,USA");

        label = guest.addCountry(label);

        Assertions.assertEquals(expectedLabel, label);
    }

    @Test
    @DisplayName("Should add first name to a label")
    void shouldAddFirstName() {
        Guest guest = createTestDataGuest();
        Label label = new Label("");
        Label expectedLabel = new Label(" Pulkit");

        label = guest.addFirstName(label);

        Assertions.assertEquals(expectedLabel, label);
    }

    @Test
    @DisplayName("Should add last name to a label")
    void shouldAddLastName() {
        Guest guest = createTestDataGuest();
        Label label = new Label("");
        Label expectedLabel = new Label(" Gupta" + ",");

        label = guest.addLastName(label, ",");

        Assertions.assertEquals(expectedLabel, label);
    }

    @Test
    @DisplayName("Should add salutation to a label")
    void shouldAddSalutation() {
        Guest guest = createTestDataGuest();
        Label label = new Label("");
        Label expectedLabel = new Label(" Mr");

        label = guest.addSalutation(label);

        Assertions.assertEquals(expectedLabel, label);
    }

    @Test
    @DisplayName("Should add salutation to a label")
    void shouldFilterGuestByCountry() {
        Integer expectedGuestLength = 0;
        List<Guest> guests = new LinkedList();
        guests.add(createTestDataGuest());

        Integer resultGuestLength = Guest.applyCountryFilter(guests, "India").size();

        Assertions.assertEquals(expectedGuestLength, resultGuestLength);
    }

    private Guest createTestDataGuest() {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-c", "Delhi", "USA");
        Guest guest = new Guest(name, Gender.MALE, 40, address);

        return guest;
    }
}
