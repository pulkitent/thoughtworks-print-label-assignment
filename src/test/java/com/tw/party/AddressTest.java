package com.tw.party;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

 class AddressTest {
    @Test
    @DisplayName("Should add country to a label")
    void shouldAddCountry() {
        Address address = new Address("Delhi", "Delhi", "USA");
        Label label = new Label("");
        Label expectedLabel = new Label(" ,USA");

        label = address.addCountry(label);

        Assertions.assertEquals(expectedLabel, label);
    }

    @Test
    @DisplayName("Should compare address country")
    void checkIsFrom() {
        Address address = new Address("Delhi", "Delhi", "USA");

        Boolean result = address.isFrom("USA");

        Assertions.assertTrue(result);
    }


}
