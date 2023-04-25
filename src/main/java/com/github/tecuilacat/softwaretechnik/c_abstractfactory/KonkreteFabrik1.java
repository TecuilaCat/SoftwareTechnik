package com.github.tecuilacat.softwaretechnik.c_abstractfactory;

public class KonkreteFabrik1 extends AbstrakteFabrik {
    @Override
    public AbstraktesProduktA erzeugeProduktA() {
        return new ProduktA1();
    }

    @Override
    public AbstraktesProduktB erzeugeProduktB() {
        return new ProduktB1();
    }
}
