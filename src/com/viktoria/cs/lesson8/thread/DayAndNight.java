package com.viktoria.cs.lesson8.thread;

import com.viktoria.cs.lesson8.model.Mages;
import com.viktoria.cs.lesson8.util.ConstDayAndNight;

public class DayAndNight extends Thread {
    private final Object lock = new Object();


    @Override
    public void run() {
        int i = 1;
        while (!Mages.isEnoughCrystals()) {
            synchronized (lock) {
                try {
                    System.out.printf("\nИдут %s сутки\n", i);
                    i++;
                    lock.notifyAll();
                    lock.wait(ConstDayAndNight.DAY_AND_NIGHT_INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (lock) {
            lock.notifyAll();
        }
    }


    public Object getLock() {
        return lock;
    }
}
