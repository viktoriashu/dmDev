package com.viktoria.cs.lesson4.task2.actions;

import com.viktoria.cs.lesson4.task2.spaceObject.SpaceObject;

public interface WeightCounting {
    default void weightCounting(SpaceObject spaceObject1, SpaceObject spaceObject2) {
        if (spaceObject1.getWeight() > spaceObject2.getWeight()) {
            System.out.println("Масса " + spaceObject1.getName() + " равная " + spaceObject1.getWeight() +
                    " больше массы" + spaceObject2.getName() + " равной " + spaceObject2.getWeight() + ".");
        } else if (spaceObject1.getWeight() < spaceObject2.getWeight()) {
            System.out.println("Масса " + spaceObject2.getName() + " равная " + spaceObject2.getWeight() +
                    " больше массы " + spaceObject1.getName() + " равной " + spaceObject1.getWeight() + ".");
        } else System.out.println("Массы " + spaceObject1.getName() + " и " + spaceObject2.getName() + " равны.");
    }
}
