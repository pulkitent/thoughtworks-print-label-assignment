package com.tw.party;

import java.util.Objects;

import static com.tw.party.Constant.spaceSeparator;

public class Label {
    private String text;

    Label(String text) {
        this.text = text;
    }

    Label add(String text) {
        this.text += spaceSeparator + text;
        return this;
    }

    @Override
    public String toString() {
        return text;
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