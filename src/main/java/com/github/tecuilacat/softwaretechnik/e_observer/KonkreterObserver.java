package com.github.tecuilacat.softwaretechnik.e_observer;

public class KonkreterObserver implements Observer {

    @Override
    public void aktualisiere(Subjekt subjekt) {
        if (subjekt instanceof KonkretesSubjekt subj) {
            System.out.println("Im Subjekt " + subj.getName() +  " hat sich der Zustand zu "+ subj.getZustand() + " geändert!");
        }
    }

}
