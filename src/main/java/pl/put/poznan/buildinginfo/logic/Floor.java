package pl.put.poznan.buildinginfo.logic;

import java.util.ArrayList;
import java.util.List;

public class Floor implements Location{
    private int id;
    private String name;

    List<Room> rooms = new ArrayList<>();

    public Floor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Funkcja służąca głównie do sprawdzenia czy działa loader
    public void getRoomNames() {
        for (Room r: rooms) {
            System.out.println("\t\tRoom name: " + r.getName());
        }
    }

    public double getTotalArea() {
        double total = 0F;
        for(Room r: rooms) {
            total += r.getArea();
        }
        return total;
    }

    public double getTotalCube() {
        double total = 0F;
        for(Room r: rooms) {
            total += r.getCube();
        }
        return total;
    }

    public double getTotalHeating() {
        double total = 0F;
        for(Room r: rooms) {
            total += r.getHeating();
        }
        return total;
    }

    public double getTotalLight() {
        double total = 0F;
        for(Room r: rooms) {
            total += r.getLight();
        }
        return total;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCube() {
        return 0;
    }

    @Override
    public double getHeating() {
        return 0;
    }

    @Override
    public double getLight() {
        return 0;
    }
}
