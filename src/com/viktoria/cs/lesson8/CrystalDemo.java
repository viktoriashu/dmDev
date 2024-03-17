package com.viktoria.cs.lesson8;

import com.viktoria.cs.lesson8.model.Crystal;
import com.viktoria.cs.lesson8.model.Mages;
import com.viktoria.cs.lesson8.thread.CrystalGenerator;
import com.viktoria.cs.lesson8.thread.DayAndNight;
import com.viktoria.cs.lesson8.thread.Rocket;
import com.viktoria.cs.lesson8.util.UtilThread;

public class CrystalDemo {
    public static void main(String[] args) throws InterruptedException {
        DayAndNight dayAndNight = new DayAndNight();
        Crystal crystal = new Crystal();
        CrystalGenerator crystalGenerator = new CrystalGenerator(dayAndNight, crystal);
        Rocket rocketMagesFire = new Rocket(dayAndNight, crystal, new Mages("Маги огня"));
        Rocket rocketMagesWater = new Rocket(dayAndNight, crystal, new Mages("Маги воды"));

        UtilThread.startThreads(dayAndNight, crystalGenerator, rocketMagesFire, rocketMagesWater);
        UtilThread.joinThreads(dayAndNight, crystalGenerator, rocketMagesFire, rocketMagesWater);
    }
}
