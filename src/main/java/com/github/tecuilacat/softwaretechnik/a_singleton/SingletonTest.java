package com.github.tecuilacat.softwaretechnik.a_singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        printInfo(s1, s2);

        s1.increase();

        printInfo(s1, s2);

        s2.increase();

        printInfo(s1, s2);
    }

    private static void printInfo(Singleton s1, Singleton s2) {
        System.out.println("S1: " + s1.getZustand());
        System.out.println("S2: " + s2.getZustand());
        System.out.println(" ");
    }

}
