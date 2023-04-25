package com.github.tecuilacat.softwaretechnik.d_composite;

public class Klient {

    public static void main(String[] args) {

        Kompositum parent = new Kompositum(100);
        parent.addChild(new Blatt(10));
        parent.addChild(new Blatt(20));
        parent.addChild(new Blatt(30));
        parent.addChild(new Blatt(40));

        System.out.println("Summe der Werte des Knotens: " + parent.calculateValues()); //Sollte 200 ergeben, wenn korrekt programmiert
    }

}
