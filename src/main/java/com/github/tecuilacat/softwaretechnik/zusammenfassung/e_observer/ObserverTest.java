package com.github.tecuilacat.softwaretechnik.zusammenfassung.e_observer;

public class ObserverTest {

    public static void main(String[] args) {
        KonkretesSubjekt subjA = new KonkretesSubjekt("A");
        KonkretesSubjekt subjB = new KonkretesSubjekt("B");

        Observer obs1 = new KonkreterObserver();
        subjA.subscribe(obs1);
        subjB.subscribe(obs1);

        subjA.setZustand(5);
        subjB.setZustand(10);
    }

}
