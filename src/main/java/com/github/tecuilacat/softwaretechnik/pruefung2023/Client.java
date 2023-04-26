package com.github.tecuilacat.softwaretechnik.pruefung2023;

public class Client {

    public static void main(String[] args) {
        SensorBroker sensorBroker = SensorBroker.getInstance();

        sensorBroker.addObserver(new MeineDatenVisualisiert());

        sensorBroker.visualize();
    }

}
