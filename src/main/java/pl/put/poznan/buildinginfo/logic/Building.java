package pl.put.poznan.buildinginfo.logic;

import java.util.ArrayList;
import java.util.List;

public class Building implements Location{
    private int id;
    private String name;

    List<Floor> floors = new ArrayList<>();

    public Building(String name) {
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

    public float getTotalArea() {
        float total = 0F;
        for(Floor f: floors) {
            total += f.getTotalArea();
        }
        return total;
    }

    public float getTotalCube() {
        float total = 0F;
        for(Floor f: floors) {
            total += f.getTotalCube();
        }
        return total;
    }

    public float getTotalHeating() {
        float total = 0F;
        for(Floor f: floors) {
            total += f.getTotalHeating();
        }
        return total;
    }

    public float getTotalLight() {
        float total = 0F;
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
