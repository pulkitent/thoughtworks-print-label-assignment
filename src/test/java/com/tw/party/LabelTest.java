package com.tw.party;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LabelTest {
    @Test
    @DisplayName("Should add text to label")
    void shouldAdd() {
        Label label = new Label("");
        Label expectedLabel = new Label(" ABC");

        Assertions.assertEquals(expectedLabel, label.add("ABC"));
    }

    @Test
    @DisplayName("Should return given format string representation of label")
    void shouldReturnString() {
        Label label = new Label("");
        String expectedLabelString = "{ " + "Label text = " + " ABC" + " }";

        Assertions.assertTrue(expectedLabelString.equals(label.add("ABC").toString()));
    }

    @Test
    @DisplayName("Should compare two labels")
    void shouldEquals() {
        Label label = new Label("ABC");
        Label anotherLabel = new Label("ABC");

        Assertions.assertTrue(label.equals(anotherLabel));
    }
}
