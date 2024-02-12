package com.viktoria.cs.lesson3.oop;

import com.viktoria.cs.lesson3.oop.building.Apartment;
import com.viktoria.cs.lesson3.oop.building.Building;
import com.viktoria.cs.lesson3.oop.building.Floor;
import com.viktoria.cs.lesson3.oop.building.Room;
import com.viktoria.cs.lesson3.oop.print.PrintAllInformation;
import com.viktoria.cs.lesson3.oop.print.PrintInformation;

public class Runner {
    public static void main(String[] args) {
        Room room1 = new Room(1, true);
        Room room2 = new Room(2, false);

        Apartment apartment1 = new Apartment(1, new Room[]{room1, room2});
        Apartment apartment2 = new Apartment(2, new Room[]{room1, room2});
        Apartment apartment3 = new Apartment(3, new Room[]{room1, room2});

        Floor floor1 = new Floor(1, new Apartment[]{apartment1, apartment2, apartment3});
        Floor floor2 = new Floor(2, new Apartment[]{apartment1, apartment2, apartment3});
        Floor floor3 = new Floor(3, new Apartment[]{apartment1, apartment2});

        Building building = new Building(1, new Floor[]{floor1, floor2, floor3});


        PrintInformation.printInformation(building);
        PrintInformation.printInformation(floor1);
        PrintInformation.printInformation(apartment1);
        PrintInformation.printInformation(room1);

        PrintAllInformation.printAllInformation(building);
    }
}
