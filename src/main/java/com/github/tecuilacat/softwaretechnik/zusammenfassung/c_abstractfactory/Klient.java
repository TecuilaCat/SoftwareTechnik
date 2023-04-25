package com.github.tecuilacat.softwaretechnik.zusammenfassung.c_abstractfactory;

public class Klient {

    public static void main(String[] args) {
        ProduktA1 produktA1 = (ProduktA1) new KonkreteFabrik1().erzeugeProduktA();
        ProduktA2 produktA2 = (ProduktA2) new KonkreteFabrik2().erzeugeProduktA();
        ProduktB1 produktB1 = (ProduktB1) new KonkreteFabrik1().erzeugeProduktB();
        ProduktB2 produktB2 = (ProduktB2) new KonkreteFabrik2().erzeugeProduktB();
    }

}
