package com.github.tecuilacat.softwaretechnik.zusammenfassung.e_observer;

public class KonkretesSubjekt extends Subjekt {

    private String name;
    private int zustand;

    public KonkretesSubjekt(String name) {
        super();
        this.zustand = 0;
        this.name = name;
    }

    public void setZustand(int zustand) {
        this.zustand = zustand;
        super.inform();
    }

    public int getZustand() {
        return zustand;
    }

    public String getName() {
        return name;
    }

}
