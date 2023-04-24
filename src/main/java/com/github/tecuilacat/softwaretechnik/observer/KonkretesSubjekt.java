package com.github.tecuilacat.softwaretechnik.observer;

public class KonkretesSubjekt extends Subjekt {

    private int zustand;

    public KonkretesSubjekt() {
        super();
        this.zustand = 0;
    }

    public void setZustand(int zustand) {
        this.zustand = zustand;
        super.inform();
    }

    public int getZustand() {
        return zustand;
    }
}
