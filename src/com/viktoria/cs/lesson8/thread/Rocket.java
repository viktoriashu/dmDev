package com.viktoria.cs.lesson8.thread;

import com.viktoria.cs.lesson8.model.Crystal;
import com.viktoria.cs.lesson8.model.CrystalColor;
import com.viktoria.cs.lesson8.model.Mages;
import com.viktoria.cs.lesson8.util.ConstCrystal;
import com.viktoria.cs.lesson8.util.UtilRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rocket extends Thread {
    private final DayAndNight dayAndNight;
    private final Crystal crystal;
    private final Mages mages;


    public Rocket(DayAndNight dayAndNight, Crystal crystal, Mages mages) {
        this.dayAndNight = dayAndNight;
        this.crystal = crystal;
        this.mages = mages;
    }


    @Override
    public void run() {
        while (!Mages.isEnoughCrystals()) {
            try {
                List<CrystalColor> crystalColors = crystalsCollect();
                mages.addCrystals(crystalColors);
                waitNextDayAndNight();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    private List<CrystalColor> crystalsCollect() {
        int crystalsCount = UtilRandom.getRange(ConstCrystal.MIN_CRYSTALS_COUNT,
                ConstCrystal.MAX_CRYSTALS_COUNT + 1);
        List<CrystalColor> crystalsCollect = new ArrayList<>();
        synchronized (crystal.getLock()) {
            if (crystal.size() <= crystalsCount) {
                crystalsCollect.addAll(crystal.removeAll());
            } else if (crystal.isNotEmpty()) {
                for (int j = 0; j < crystalsCount; j++) {
                    CrystalColor removedCrystal = crystal.remove(UtilRandom.getNext(crystal.size()));
                    crystalsCollect.add(removedCrystal);
                }
            }
            crystalsCollect.stream()
                    .collect(Collectors.toMap(Function.identity(), crystal -> 1, Integer::sum));
            System.out.printf("\n%s добыли кристаллы: %s\n", mages.getName(), crystalsCollect);
            System.out.printf("%s имеют кристаллов: %s", mages.getName(), mages);
        }
        return crystalsCollect;
    }


    private void waitNextDayAndNight() throws InterruptedException {
        synchronized (dayAndNight.getLock()) {
            dayAndNight.getLock().wait();
        }
    }
}
