package com.github.tecuilacat.softwaretechnik.zusammenfassung.d_composite;

public abstract class Komponente {

    protected int value;

    public Komponente(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public abstract int calculateValues();

}
