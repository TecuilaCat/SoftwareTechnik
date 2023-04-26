package com.github.tecuilacat.softwaretechnik.pruefung2023;

public class MeineDatenVisualisiert implements Observer {

    @Override
    public void visualize(Daten daten) {
        if (daten instanceof SensorBroker sensorBroker) {
            System.out.println("Neue Daten: " + sensorBroker.getDrehZahl());
        }
    }

}
