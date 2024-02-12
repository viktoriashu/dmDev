package com.viktoria.cs.lesson3.oop.building;

import java.util.Objects;

public class Room {
    private final int roomNumber;
    private final boolean walkThrough;


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

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, walkThrough);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber && walkThrough == room.walkThrough;
    }

    @Override
    public String toString() {
            return walkThrough ? roomNumber + " комната - проходная" : roomNumber + " комната - непроходная";
    }
}
