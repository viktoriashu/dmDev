package com.viktoria.cs.lesson4.task2;


import com.viktoria.cs.lesson4.task2.spaceObject.Planet;
import com.viktoria.cs.lesson4.task2.spaceObject.Satellite;
import com.viktoria.cs.lesson4.task2.spaceObject.Star;
import com.viktoria.cs.lesson4.task2.utils.SpaceUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpaceRunner {
    public static void main(String[] args) {
        Planet mars = new Planet("maRs", 0.63345, 3389.5);
        Planet venus = new Planet("Venus", 4.867, 6051.8);
        Planet neptune = new Planet("Neptune", 102.4, 24622);
        Star sun = new Star("Sun", 1989000, 696340);
        Satellite phobos = new Satellite("Phobos", (1.072 * Math.pow(10, -8)), 11.267);


        System.out.println(mars);
        System.out.println(venus);
        System.out.println(sun);
        System.out.println(phobos);

        mars.weightCounting(mars, sun);

        mars.sortPhysicalProperties(mars);
        neptune.sortPhysicalProperties(neptune);

        System.out.println(sun.getDiameter());

        SpaceUtils.entersTheStar(sun);
        SpaceUtils.entersTheStar(mars);
        System.out.println(SpaceUtils.gravityCalculation(venus, sun, 1.08 * Math.pow(10, 11)));

        phobos.satelliteRefersToAPlanet(phobos);
        mars.satelliteRefersToAPlanet(mars);
        venus.satelliteRefersToAPlanet(venus);

        sun.PrintInformation(sun);
        mars.PrintInformation(mars);

        List<Planet> planets = new ArrayList<>();
        planets.add(mars);
        planets.add(venus);
        planets.add(neptune);

        Collections.sort(planets);
        System.out.println(planets);
    }
}
