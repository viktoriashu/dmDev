package com.viktoria.cs.lesson4.task2.utils;

import com.viktoria.cs.lesson4.task2.spaceObject.SpaceObject;

public final class SpaceUtils {

    private static final double GRAVITY_CONST = (6.67 * Math.pow(10, -11));

    public static void entersTheStar(SpaceObject spaceObject) {
        if (spaceObject instanceof com.viktoria.cs.lesson4.task2.spaceObject.Star) {
            System.out.println(spaceObject.getName() + " является звездой.");
        } else {
            System.out.println(spaceObject.getName() + " не является звездой.");
        }
    }

    public static double gravityCalculation(SpaceObject spaceObject1, SpaceObject spaceObject2, double
            distance) {
        double gravityForce = (GRAVITY_CONST * spaceObject1.getWeight() * spaceObject2.getWeight()) /
                Math.pow(distance, 2);
        return gravityForce;
    }
}
