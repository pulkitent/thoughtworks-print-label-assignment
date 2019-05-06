package com.tw.party;

import java.util.List;

import static com.tw.party.Constant.commaSeparator;

public class AgeLabelGenerator extends LabelGenerator {
    private final Integer age;

    public AgeLabelGenerator(Integer age) {
        this.age = age;
    }

    @Override
    public List<Label> generate(List<Guest> guests) {
        List<Guest> countrySpecificGuests = Guest.applyAgeFilter(guests, age);
        List<Label> labels = super.generate(countrySpecificGuests);

        for (Label label : labels) {
            label.add(commaSeparator + age.toString());
        }
        return labels;
    }
}