package com.viktoria.cs.lesson3.oop.building;

import java.util.Arrays;
import java.util.Objects;

public class Building {

    private final int buildingNumber;

    private final Floor[] floors;


    public Building(int buildingNumber, Floor[] floors) {
        this.buildingNumber = buildingNumber;
        this.floors = floors;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(buildingNumber);
        result = 31 * result + Arrays.hashCode(floors);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return buildingNumber == building.buildingNumber && Arrays.equals(floors, building.floors);
    }

    @Override
    public String toString() {
        return "Дом " + buildingNumber + " количество этажей в доме: " + Arrays.toString(floors);
    }
}
