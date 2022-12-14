package pl.put.poznan.transformer.logic;

public class Room implements Location {

    private float area;
    private float cube;
    private float heating;
    private float light;
    private int id;
    private String name;

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
