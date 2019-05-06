package com.tw.party;

import java.util.List;
import static com.tw.party.Constant.commaSeparator;

public class CountryLabelGenerator extends LabelGenerator {
    private final String country;

    public CountryLabelGenerator(String country) {
        this.country = country;
    }

    @Override
    public List<Label> generate(List<Guest> guests) {
        List<Guest> countrySpecificGuests = Guest.applyCountryFilter(guests, country);
        List<Label> labels = super.generate(countrySpecificGuests);

        for (Label label : labels) {
            label.add(commaSeparator + country);
        }
        return labels;
    }
}