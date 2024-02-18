package com.viktoria.cs.lesson4.task2.spaceObject;


import com.viktoria.cs.lesson4.task2.actions.IgnoreCase;
import com.viktoria.cs.lesson4.task2.actions.WeightCounting;

public abstract class SpaceObject implements WeightCounting, IgnoreCase {


    private static final double SEPTILLION = Math.pow(10, 24);
    public static final int DIAMETER_CONST = 2;

    private final String name;
    private final double weight;

    private final double radius;


    //weight (масса) указана в кг, radius (радиус планеты) указан в км.
    public SpaceObject(String name, double weight, double radius) {
        this.name = name;
        this.weight = weight;
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * DIAMETER_CONST;
    }


    public String getName() {
        return ignoreCase(name);
    }

    public double getWeight() {
        return weight * SEPTILLION;
    }

    public double getRadius() {
        return radius;
    }
}
