package com.tw.party;

import java.util.Objects;

public class Label {
    private String text;

    private static final String separator = " ";

    Label(String text) {
        this.text = text;
    }

    Label add(String text) {
        this.text += separator + text;
        return this;
    }

    @Override
    public String toString() {
        return "{ " + "Label text = " + text + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Label label = (Label) o;
        return Objects.equals(text, label.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}