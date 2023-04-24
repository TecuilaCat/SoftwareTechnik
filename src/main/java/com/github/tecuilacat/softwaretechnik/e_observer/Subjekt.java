package com.github.tecuilacat.softwaretechnik.e_observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subjekt {

    private List<Observer> observers;

    public Subjekt() {
        this.observers = new ArrayList<>();
    }

    public void inform() {
        for (Observer obs: this.observers) {
            obs.aktualisiere(this);
        }
    }

    public void subscribe(Observer obs) {
        this.observers.add(obs);
    }

    public void detatch(Observer obs) {
        this.observers.remove(obs);
    }

}
