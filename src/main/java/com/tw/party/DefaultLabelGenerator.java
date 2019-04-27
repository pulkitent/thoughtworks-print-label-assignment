package com.tw.party;

import java.util.List;

public class DefaultLabelGenerator extends LabelGenerator {
    private final static String defaultTemplate = "%s %s %s";
    private final static String defaultReverseTemplate = "%s %s, %s";

    @Override
    public List<Label> generate(List<Guest> guests) {
        List<Label> defaultLabels = super.generate(guests);
        return defaultLabels;
    }
}
