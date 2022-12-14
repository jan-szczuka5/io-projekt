package pl.put.poznan.buildinginfo.logic;

public class Room implements Location{
    int id;
    String name;

    float area;
    float cube;
    float heating;
    float light;

    public Room(String name, int area, int cube){
        this.id = 10;
        this.name = name;
        this.area = (float) area;
        this.cube = (float) cube;
        this.heating = 34.5F;
        this.light = 12.34F;
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
        return area;
    }

    @Override
    public float getCube() {
        return cube;
    }

    @Override
    public float getHeating() {
        return heating;
    }

    @Override
    public float getLight() {
        return light;
    }
}
