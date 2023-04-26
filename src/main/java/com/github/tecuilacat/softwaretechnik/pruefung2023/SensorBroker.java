package com.github.tecuilacat.softwaretechnik.pruefung2023;

import java.util.Objects;

public class SensorBroker extends Daten {

    private static SensorBroker instance;

    private int drehZahl = 0;

    public static SensorBroker getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SensorBroker();
        }
        return instance;
    }

    private SensorBroker() {
        warteAufDaten();
    }

    /**
     * Eigentlich ein Thread, er dann in einer Endlosschleife auf den Wert wartet -> den Wert setzt -> den observer triggert -> wieder auf neue Daten wartet
     */
    public void warteAufDaten() {
        drehZahl = 100;
        super.visualize();
    }

    public int getDrehZahl() {
        return drehZahl;
    }
}
