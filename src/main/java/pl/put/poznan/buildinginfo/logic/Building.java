package pl.put.poznan.buildinginfo.logic;

import java.util.ArrayList;
import java.util.List;

public class Building implements Location{
    private int id;
    private String name;

    List<Floor> floors = new ArrayList<>();

    public Building(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    // Funkcja służąca głównie do sprawdzenia czy działa loader
    public void getFloorNames() {
        for (Floor f: floors) {
            System.out.println("\tFloor name: " + f.getName());
            f.getRoomNames();
        }
    }

    public double getTotalArea() {
        double total = 0F;
        for(Floor f: floors) {
            total += f.getTotalArea();
        }
        return total;
    }

    public double getTotalCube() {
        double total = 0F;
        for(Floor f: floors) {
            total += f.getTotalCube();
        }
        return total;
    }

    public double getTotalHeating() {
        double total = 0F;
        for(Floor f: floors) {
            total += f.getTotalHeating();
        }
        return total;
    }

    public double getTotalLight() {
        double total = 0F;
        for(Floor f: floors) {
            total += f.getTotalLight();
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
