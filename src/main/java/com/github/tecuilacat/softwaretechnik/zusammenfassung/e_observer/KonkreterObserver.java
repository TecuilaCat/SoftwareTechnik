package com.github.tecuilacat.softwaretechnik.zusammenfassung.e_observer;

public class KonkreterObserver implements Observer {

    private String name;

    public KonkreterObserver(String name) {
        this.name = name;
    }

    @Override
    public void aktualisiere(Subjekt subjekt) {
        if (subjekt instanceof KonkretesSubjekt subj) {
            System.out.println(name + ": Im Subjekt " + subj.getName() +  " hat sich der Zustand zu "+ subj.getZustand() + " geändert!");
        }
    }

}
