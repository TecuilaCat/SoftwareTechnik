package com.github.tecuilacat.softwaretechnik.zusammenfassung.d_composite;

import java.util.ArrayList;
import java.util.List;

public class Kompositum extends Komponente {

    private List<Komponente> children = new ArrayList<>();

    public Kompositum(int value) {
        super(value);
    }

    public void addChild(Komponente child) {
        this.children.add(child);
    }

    public List<Komponente> getChildren() {
        return this.children;
    }

    public void removeChild(Komponente child) {
        this.children.remove(child);
    }


    @Override
    public int calculateValues() {
        int res = super.value;
        for (Komponente child: this.children) {
            res += child.calculateValues();
        }
        return res;
    }
}
