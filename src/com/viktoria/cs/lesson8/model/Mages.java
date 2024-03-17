package com.viktoria.cs.lesson8.model;

import com.viktoria.cs.lesson8.util.ConstCrystal;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Mages {
    private final Map<CrystalColor, Integer> crystals = new EnumMap<>(CrystalColor.class);
    private final String name;
    private static boolean isEnoughCrystals;


    public Mages(String name) {
        this.name = name;
    }


    public void addCrystals(List<CrystalColor> list) {
        list.forEach(crystal -> crystals.merge(crystal, 1, Integer::sum));
        enoughCrystals();
    }


    private void enoughCrystals() {
        List<Integer> list = new ArrayList<>();
        for (Integer c : crystals.values()) {
            if (c >= ConstCrystal.WIN_CRYSTALS_COUNT) {
                list.add(c);
            }
        }
        if (list.size() == 2) {
            isEnoughCrystals = true;
        }
    }


    public static boolean isEnoughCrystals() {
        return isEnoughCrystals;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "" + crystals;
    }
}
