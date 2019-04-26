package com.tw.gurgaon;

public enum Template {
    DEFAULT("%s %s %s"),
    DEFAULTREVERSE("%s %s, %s"),
    COUNTRY("%s %s %s, %s"),
    COUNTRYREVERSE("%s %s, %s, %s");

    private final String format;

    Template(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}