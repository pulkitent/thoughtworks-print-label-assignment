package com.tw.party;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameTest {
    @Test
    @DisplayName("Should add first name to label")
    void shouldAddFirstName() {
        Name name = new Name("Pulkit", "Gupta");
        Label label = new Label("");
        Label expectedLabel = new Label(" Pulkit");

        Assertions.assertEquals(expectedLabel, name.addFirstName(label));
    }

    @Test
    @DisplayName("Should add last name to label")
    void shouldAddLastName() {
        Name name = new Name("Pulkit", "Gupta");
        Label label = new Label("");
        Label expectedLabel = new Label(" Gupta" + ",");

        Assertions.assertEquals(expectedLabel, name.addLastName(label, ","));
    }
}