package pl.put.poznan.buildinginfo.logic;

import java.util.List;

public class Building implements Location{
    private int id;
    private String name;

    List<Floor> floors;

    public void addFloor(Floor floor) {
        floors.add(floor);
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
