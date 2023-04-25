package com.github.tecuilacat.softwaretechnik.zusammenfassung.c_abstractfactory;

public class KonkreteFabrik2 extends AbstrakteFabrik {
    @Override
    public AbstraktesProduktA erzeugeProduktA() {
        return new ProduktA2();
    }

    @Override
    public AbstraktesProduktB erzeugeProduktB() {
        return new ProduktB2();
    }
}
