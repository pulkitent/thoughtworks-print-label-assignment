package com.tw.gurgaon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.tw.gurgaon.Salutation.*;

class LabelTest {

    @Test
    @DisplayName("Should print label for a male")
    void printLabelForAMan() {
        String firstName = "Pulkit";
        String lastName = "Gupta";
        Label label = new Label(firstName, lastName, Mr);
        String printedLabel = "Mr Pulkit Gupta";

        Assertions.assertEquals(printedLabel, label.print());
    }

    @Test
    @DisplayName("Should print label for a female")
    void printLabelForAWoman() {
        String firstName = "ABC";
        String lastName = "XYZ";
        Label label = new Label(firstName, lastName, Mrs);
        String printedLabel = "Mrs ABC XYZ";

        Assertions.assertEquals(printedLabel, label.print());
    }

    @Test
    @DisplayName("Should print reverse label for a male")
    void printReverseLabelForAMan() {
        String firstName = "Pulkit";
        String lastName = "Gupta";
        Label label = new Label(firstName, lastName, Mr);
        String printedLabel = "Mr Gupta Pulkit";

        Assertions.assertEquals(printedLabel, label.printReverse());
    }

    @Test
    @DisplayName("Should print reverse label for a male")
    void printReverseLabelForAWoman() {
        String firstName = "ABC";
        String lastName = "XYZ";
        Label label = new Label(firstName, lastName, Mrs);
        String printedLabel = "Mrs XYZ ABC";

        Assertions.assertEquals(printedLabel, label.printReverse());
    }

}