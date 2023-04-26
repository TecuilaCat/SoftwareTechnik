package com.github.tecuilacat.softwaretechnik.pruefung2023;

import java.util.ArrayList;
import java.util.List;

public abstract class Daten {

    private List<Observer> observers = new ArrayList<>();

    protected void visualize() {
        for (Observer obs: observers) {
            obs.visualize(this);
        }
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

}
