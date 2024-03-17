package com.viktoria.cs.lesson8.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Crystal {
    private final Object lock = new Object();
    private final List<CrystalColor> crystal = new LinkedList<>();


    public Crystal() {
    }


    public void add(CrystalColor crystalColor) {
        crystal.add(crystalColor);
    }


    public CrystalColor remove(int index) {
        return crystal.remove(index);
    }


    public List<CrystalColor> removeAll() {
        List<CrystalColor> crystalColor = new ArrayList<>(crystal);
        crystal.clear();
        return crystalColor;
    }


    public int size() {
        return crystal.size();
    }


    public boolean isNotEmpty() {
        return !crystal.isEmpty();
    }


    public Object getLock() {
        return lock;
    }
}
