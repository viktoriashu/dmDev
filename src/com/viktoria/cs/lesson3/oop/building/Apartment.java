package com.viktoria.cs.lesson3.oop.building;

import java.util.Arrays;
import java.util.Objects;

public class Apartment {
    private final int apartmentNumber;
    private final Room[] rooms;


    public Apartment(int apartmentNumber, Room[] rooms) {
        this.apartmentNumber = apartmentNumber;
        this.rooms = rooms;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(apartmentNumber);
        result = 31 * result + Arrays.hashCode(rooms);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return apartmentNumber == apartment.apartmentNumber && Arrays.equals(rooms, apartment.rooms);
    }

    @Override
    public String toString() {
        return "\n" + "Квартира " + apartmentNumber +
                " количество комнат в квартире " + "\n" + Arrays.toString(rooms);
    }
}
