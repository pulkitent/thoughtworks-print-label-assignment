package com.tw.party;

import java.util.LinkedList;
import java.util.List;

public class LabelGenerator {
    public List<Label> generate(List<Guest> guests) {
        List<Label> labels = new LinkedList<>();
        for (Guest guest : guests) {
            Label label = createDefaultLabel(guest);
            Label reverseLabel = createReverseLabel(guest);

            labels.add(label);
            labels.add(reverseLabel);
        }
        return labels;
    }

    private Label createDefaultLabel(Guest guest) {
        Label label = new Label("");
        label = guest.addSalutation(label);
        label = guest.addFirstName(label);
        label = guest.addLastName(label,"");
        label = guest.addCountry(label);

        return label;
    }

    private Label createReverseLabel(Guest guest) {
        Label label = new Label("");
        label = guest.addSalutation(label);
        label = guest.addLastName(label,",");
        label = guest.addFirstName(label);
        label = guest.addCountry(label);

        return label;
    }
}