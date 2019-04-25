package com.tw.gurgaon;

public enum Template {
    ORIGINAL("%s %s %s"),
    ORIGINALREVERSE("%s %s, %s"),
    WITHCOUNTRY("%s %s %s, %s"),
    WITHCOUNTRYREVERSE("%s %s, %s, %s");
    
    private final String format;

    Template(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}