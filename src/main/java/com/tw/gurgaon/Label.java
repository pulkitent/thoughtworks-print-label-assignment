package com.tw.gurgaon;

public class Label {
    private final Guest guest;

    public Label(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}