package pl.put.poznan.transformer.logic;

public class Room implements Location {

    private float area;
    private float cube;
    private float heating;
    private float light;
    private int id;
    private String name;
    public Room(String name, int area, int cube){
        this.id = 10;
        this.name = name;
        this.area = (float) area;
        this.cube = (float) cube;
        this.heating = 34.5F;
        this.light = 12.34F;
    }
    public float getArea() {
        return area;
    }
    public float getCube() {
        return cube;
    }
    public float getHeating() {
        return heating;
    }
    public float getLight() {
        return light;
    }



    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
