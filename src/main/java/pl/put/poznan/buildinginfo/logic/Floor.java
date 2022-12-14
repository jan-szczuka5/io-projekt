package pl.put.poznan.buildinginfo.logic;

import java.util.ArrayList;
import java.util.List;

public class Floor implements Location{
    private int id;
    private String name;

    List<Room> rooms = new ArrayList<>();

    public Floor(String name) {
        this.id = 5;
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

    public float getTotalArea() {
        float total = 0F;
        for(Room r: rooms) {
            total += r.getArea();
        }
        return total;
    }

    public float getTotalCube() {
        float total = 0F;
        for(Room r: rooms) {
            total += r.getCube();
        }
        return total;
    }

    public float getTotalHeating() {
        float total = 0F;
        for(Room r: rooms) {
            total += r.getHeating();
        }
        return total;
    }

    public float getTotalLight() {
        float total = 0F;
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
    public float getArea() {
        return 0;
    }

    @Override
    public float getCube() {
        return 0;
    }

    @Override
    public float getHeating() {
        return 0;
    }

    @Override
    public float getLight() {
        return 0;
    }
}
