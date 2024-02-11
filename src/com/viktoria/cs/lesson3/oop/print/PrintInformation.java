package com.viktoria.cs.lesson3.oop.print;

import com.viktoria.cs.lesson3.oop.building.Apartment;
import com.viktoria.cs.lesson3.oop.building.Building;
import com.viktoria.cs.lesson3.oop.building.Floor;
import com.viktoria.cs.lesson3.oop.building.Room;

public class PrintInformation {

    static public void printInformation(Building building) {
        System.out.println("Дом " + building.getBuildingNumber() +
                " количество этажей в доме " + building.getFloors().length + ".");
    }

    static public void printInformation(Floor floor) {
        System.out.println("Этаж " + floor.getFloorNumber() +
                " количество квартир на этаже " + floor.getApartments().length + ".");
    }

    static public void printInformation(Apartment apartment) {
        System.out.println("Квартира " + apartment.getApartmentNumber() +
                " количество комнат в квартире " + apartment.getRooms().length + ".");
    }

    static public void printInformation(Room room) {
        if (room.isWalkThrough() == true) {
            System.out.println(room.getRoomNumber() + " комната - проходная");
        } else {
            System.out.println(room.getRoomNumber() + " комната - непроходная");
        }
    }
}
