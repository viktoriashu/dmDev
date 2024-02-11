package com.viktoria.cs.lesson3.oop.building;

import java.util.Arrays;
import java.util.Objects;

public class Floor {

    private int floorNumber;
    private Apartment[] apartments;


    @Override
    public String toString() {
        return "\n" + "\n" + "Этаж " + floorNumber +
                " количество квартир на этаже " + Arrays.toString(apartments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Floor floor = (Floor) o;
        return floorNumber == floor.floorNumber && Arrays.equals(apartments, floor.apartments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(floorNumber);
        result = 31 * result + Arrays.hashCode(apartments);
        return result;
    }


    public Floor(int floorNumber, Apartment[] apartments) {
        this.floorNumber = floorNumber;
        this.apartments = apartments;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Apartment[] getApartments() {
        return apartments;
    }
}

