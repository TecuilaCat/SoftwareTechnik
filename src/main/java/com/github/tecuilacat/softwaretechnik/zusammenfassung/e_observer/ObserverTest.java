package com.github.tecuilacat.softwaretechnik.zusammenfassung.e_observer;

public class ObserverTest {

    public static void main(String[] args) throws Exception {
        //Mehrere Subjekte zu einem Observer
        KonkretesSubjekt subjA = new KonkretesSubjekt("subjA");
        KonkretesSubjekt subjB = new KonkretesSubjekt("subjB");

        Observer obs1 = new KonkreterObserver("obs1");
        subjA.subscribe(obs1);
        subjB.subscribe(obs1);

        subjA.setZustand(5);
        subjB.setZustand(10);


        Thread.sleep(4000);
        //Alternative: Mehrere Observer zu einem Subjekt
        KonkreterObserver konkreterObserver1 = new KonkreterObserver("konkreterObserver1");
        KonkreterObserver konkreterObserver2 = new KonkreterObserver("konkreterObserver2");

        KonkretesSubjekt subjekt = new KonkretesSubjekt("subjekt");
        subjekt.subscribe(konkreterObserver1);
        subjekt.subscribe(konkreterObserver2);

        subjekt.setZustand(100);
        Thread.sleep(2000);
        subjekt.setZustand(200);
        Thread.sleep(2000);
        subjekt.setZustand(300);
        Thread.sleep(2000);
        subjekt.setZustand(400);
    }

}
