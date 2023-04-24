package com.github.tecuilacat.softwaretechnik.a_singleton;

import java.util.Objects;

public class Singleton {

    private static Singleton instance;

    private int zustand;

    private Singleton() {
        this.zustand = 0;
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton();
        }
        return instance;
    }

    public void increase() {
        this.zustand++;
    }

    public void decrease() {
        this.zustand--;
    }

    public int getZustand() {
        return zustand;
    }
}
