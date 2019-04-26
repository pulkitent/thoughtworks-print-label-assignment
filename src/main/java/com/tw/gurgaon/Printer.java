package com.tw.gurgaon;

import java.util.List;

public class Printer {

    private final List<Label> labels;

    public Printer(List<Label> labels) {
        this.labels = labels;
    }

    public List<String> printLabels(Template template, PrintStrategy printStrategy) {
        List<String> printedLables = printStrategy.print(labels);
        return printedLables;
    }
}