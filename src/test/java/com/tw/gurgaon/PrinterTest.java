package com.tw.gurgaon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class PrinterTest {
    @Test
    @DisplayName("Should print default format label for a man")
    void printDeafultLabel() {
        Printer printer = this.createPrinterWithTestData();

        List<String> printedLabel = printer.printLabels(Template.DEFAULT, new PrintByDefault());

        Assertions.assertEquals("Mr Pulkit Gupta", printedLabel.get(0));
        Assertions.assertEquals("Mr Gupta, Pulkit", printedLabel.get(1));
    }

    @Test
    @DisplayName("Should print label with country format for a man")
    void printLabelWithCountry() {
        Printer printer = this.createPrinterWithTestData();

        List<String> printedLabel = printer.printLabels(Template.DEFAULT, new PrintByCountry("India"));

        Assertions.assertEquals("Mr Pulkit Gupta, India", printedLabel.get(0));
        Assertions.assertEquals("Mr Gupta, Pulkit, India", printedLabel.get(1));
    }

    @Test
    @DisplayName("Should not print label with unavailable country format for a man")
    void printLabelWithNoCountry() {
        Printer printer = this.createPrinterWithTestData();

        List<String> printedLabel = printer.printLabels(Template.DEFAULT, new PrintByCountry("USA"));

        Assertions.assertEquals(0, printedLabel.size());
    }

    private Printer createPrinterWithTestData() {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-C", "Delhi", "India");
        Guest guest = new Guest(name, Gender.MALE, 23, address);
        Label label = new Label(guest);

        List<Label> labels = new LinkedList<>();
        labels.add(label);

        return new Printer(labels);
    }
}