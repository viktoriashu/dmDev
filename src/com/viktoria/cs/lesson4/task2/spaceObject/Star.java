package com.viktoria.cs.lesson4.task2.spaceObject;


import com.viktoria.cs.lesson4.task2.actions.PrintInformation;

public class Star extends SpaceObject implements PrintInformation {
    public Star(String name, double weight, double radius) {
        super(name, weight, radius);
    }

    @Override
    public void PrintInformation(SpaceObject spaceObject) {
        System.out.println("Солнце звезда класса «жёлтый карлик». 98% массы Солнца приходится на водород" +
                " и гелий, но в нём также содержатся все известные химические элементы. Солнце ярче, чем 85% звёзд " +
                "в галактике, а температура его поверхности превышает 5 700°C.");
    }

    @Override
    public String toString() {
        return "Star {" + "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                ", radius=" + super.getRadius() +
                '}';
    }
}
