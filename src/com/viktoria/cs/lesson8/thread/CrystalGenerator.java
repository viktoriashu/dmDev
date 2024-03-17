package com.viktoria.cs.lesson8.thread;

import com.viktoria.cs.lesson8.model.Crystal;
import com.viktoria.cs.lesson8.model.CrystalColor;
import com.viktoria.cs.lesson8.model.Mages;
import com.viktoria.cs.lesson8.util.ConstCrystal;
import com.viktoria.cs.lesson8.util.UtilRandom;

public class CrystalGenerator extends Thread {
    private final DayAndNight dayAndNight;
    private final Crystal crystal;


    public CrystalGenerator(DayAndNight dayAndNight, Crystal crystal) {
        this.dayAndNight = dayAndNight;
        this.crystal = crystal;
    }


    @Override
    public void run() {
        try {
            while (!Mages.isEnoughCrystals()) {
                try {
                    throwNewCrystals();
                    waitNextDayAndNight();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }


    private void throwNewCrystals() {
        int countCrystalGenerator = UtilRandom.getRange(ConstCrystal.MIN_CRYSTALS_COUNT,
                ConstCrystal.MAX_CRYSTALS_COUNT + 1);
        synchronized (crystal.getLock()) {
            for (int j = 0; j < countCrystalGenerator; j++) {
                CrystalColor crystalColor = CrystalColor.values()[UtilRandom.getNext(CrystalColor.values().length)];
                crystal.add(crystalColor);
            }
            System.out.println("\nВыросло кристаллов: " + countCrystalGenerator);
        }
    }


    private void waitNextDayAndNight() throws InterruptedException {
        synchronized (dayAndNight.getLock()) {
            dayAndNight.getLock().wait();
        }
    }
}
