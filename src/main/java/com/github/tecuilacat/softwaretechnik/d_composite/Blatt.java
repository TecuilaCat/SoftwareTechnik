package com.github.tecuilacat.softwaretechnik.d_composite;

public class Blatt extends Komponente {

    public Blatt(int value) {
        super(value);
    }

    @Override
    public int calculateValues() {
        return super.value;
    }
}
