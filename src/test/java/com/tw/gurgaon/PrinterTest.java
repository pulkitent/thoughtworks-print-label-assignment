package com.tw.gurgaon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrinterTest {
    @Test
    @DisplayName("Should print original format label for a man")
    void printLabel() {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-C", "Delhi", "India");
        Guest guest = new Guest(name, Gender.MALE, 23, address);
        Printer printer = new Printer();
        Label label = new Label(guest);
        String expectedPrintedLabel = "Mr Pulkit Gupta";

        String printedLabel = printer.print(label, Template.ORIGINAL);

        Assertions.assertEquals(printedLabel, expectedPrintedLabel);
    }

    @Test
    @DisplayName("Should print label in reverse format for a man")
    void printReverseLabel() {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-C", "Delhi", "India");
        Guest guest = new Guest(name, Gender.MALE, 23, address);
        Printer printer = new Printer();
        Label label = new Label(guest);
        String expectedPrintedLabel = "Mr Gupta, Pulkit";

        String printedLabel = printer.print(label, Template.ORIGINALREVERSE);

        Assertions.assertEquals(printedLabel, expectedPrintedLabel);
    }

    @Test
    @DisplayName("Should print label with country for a man")
    void printLabelWithCountry() {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-C", "Delhi", "India");
        Guest guest = new Guest(name, Gender.MALE, 23, address);
        Printer printer = new Printer();
        Label label = new Label(guest);
        String expectedPrintedLabel = "Mr Pulkit Gupta, India";

        String printedLabel = printer.print(label, Template.WITHCOUNTRY);

        Assertions.assertEquals(printedLabel, expectedPrintedLabel);
    }

    @Test
    @DisplayName("Should print label with country in reverse format for a man")
    void printReverseLabelWithCountry() {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-C", "Delhi", "India");
        Guest guest = new Guest(name, Gender.MALE, 23, address);
        Printer printer = new Printer();
        Label label = new Label(guest);
        String expectedPrintedLabel = "Mr Gupta, Pulkit, India";

        String printedLabel = printer.print(label, Template.WITHCOUNTRYREVERSE);

        Assertions.assertEquals(printedLabel, expectedPrintedLabel);
    }
}