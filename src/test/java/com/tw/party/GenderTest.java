package com.tw.party;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

 class GenderTest {
    @Test
    @DisplayName("Should compare address country")
    void checkIsFrom() {
        Gender gender = Gender.MALE;
        Label label = new Label("");
        Label expectedLabel = new Label(" Mr");

        label = gender.addSalutation(label);

        Assertions.assertEquals(expectedLabel,label);
    }
}
