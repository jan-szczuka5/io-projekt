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
        double total = 0F;
        for(Room r: rooms) {
            total += r.getArea();
        }
        return total;
    }

    @Override
    public double getCube() {
        double total = 0F;
        for(Room r: rooms) {
            total += r.getCube();
        }
        return total;
    }

    @Override
    public double getHeating() {
        double total = 0F;
        for(Room r: rooms) {
            total += r.getHeating();
        }
        return total;
    }

    @Override
    public double getLight() {
        double total = 0F;
        for(Room r: rooms) {
            total += r.getLight();
        }
        return total;
    }
}
