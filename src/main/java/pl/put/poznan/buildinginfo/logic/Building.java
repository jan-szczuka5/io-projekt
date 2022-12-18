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
        for(Floor f: floors) {
            total += f.getArea();
        }
        return total;
    }

    @Override
    public double getCube() {
        double total = 0F;
        for(Floor f:floors) {
            total += f.getCube();
        }
        return total;
    }

    @Override
    public double getHeating() {
        double total = 0F;
        for(Floor f:floors) {
            total += f.getHeating();
        }
        return total;
    }

    @Override
    public double getLight() {
        double total = 0F;
        for(Floor f:floors) {
            total += f.getLight();
        }
        return total;
    }
}
