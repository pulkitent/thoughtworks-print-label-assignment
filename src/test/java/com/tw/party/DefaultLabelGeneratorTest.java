package com.tw.party;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class DefaultLabelGeneratorTest {
    @Test
    @DisplayName("Should generate 6 labels i.e. Default and Reverse for each guest")
        //Positive Test
    void generateLabels() {
        List<Guest> guests = this.createTestDataWithThreeGuest();
        LabelGenerator labelGenerator = new DefaultLabelGenerator();
        Integer expectedNumberOfLabels = 6;

        List<Label> generatedLabels = labelGenerator.generate(guests);

        Assertions.assertEquals(expectedNumberOfLabels, generatedLabels.size());
    }

    @Test
    @DisplayName("Should not generate any labels for guests")
    void noLabelGeneration() {
        String countryIndia = "USA";
        List<Guest> guests = this.createTestDataWithThreeGuest();
        CountryLabelGenerator labelGenerator = new CountryLabelGenerator(countryIndia);
        Integer expectedNumberOfLabels = 0;

        List<Label> generatedLabels = labelGenerator.generate(guests);

        Assertions.assertEquals(expectedNumberOfLabels, generatedLabels.size());
    }

    private List<Guest> createTestDataWithThreeGuest() {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-c", "Delhi", "India");
        Guest guest = new Guest(name, Gender.MALE, 40, address);

        Name anotherName = new Name("Rahul", "Gupta");
        Address anotherAddress = new Address("12-c", "ABC", "Bangladesh");
        Guest anotherGuest = new Guest(anotherName, Gender.MALE, 41, anotherAddress);

        Name otherName = new Name("Shivam", "Gupta");
        Address otherAddress = new Address("14-c", "XYZ", "China");
        Guest otherGuest = new Guest(otherName, Gender.MALE, 42, otherAddress);

        List<Guest> guests = new LinkedList<>();
        guests.add(guest);
        guests.add(anotherGuest);
        guests.add(otherGuest);

        return guests;
    }
}
