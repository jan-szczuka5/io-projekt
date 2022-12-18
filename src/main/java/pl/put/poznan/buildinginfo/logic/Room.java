package pl.put.poznan.buildinginfo.logic;

public class Room implements Location{
    int id;
    String name;

    double area;
    double cube;
    double heating;
    double light;

    public Room(int id, String name, double area, double cube, double heating, double light){
        this.id = id;
        this.name = name;
        this.area = area;
        this.cube = cube;
        this.heating = heating;
        this.light = light;
    }

    public Room findRoomById(int id)
    {
        if (this.getId() == id)  { return this; }
        else { return null; }
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
        return area;
    }

    @Override
    public double getCube() {
        return cube;
    }

    @Override
    public double getHeating() {
        return heating;
    }

    @Override
    public double getLight() {
        return light;
    }
}
