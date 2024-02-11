package com.viktoria.cs.lesson3.oop.building;

import java.util.Objects;

public class Room {
    private int roomNumber;
    private boolean walkThrough;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber && walkThrough == room.walkThrough;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, walkThrough);
    }

    @Override
    public String toString() {
        if (walkThrough == true) {
            return roomNumber + " комната - проходная";
        } else {
            return roomNumber + " комната - непроходная";
        }
    }


    public Room(int roomNumber, boolean walkThrough) {
        this.roomNumber = roomNumber;
        this.walkThrough = walkThrough;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isWalkThrough() {
        return walkThrough;
    }
}
