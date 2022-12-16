package pl.put.poznan.buildinginfo.logic;

/**
 * This class handles operations regarding the room
 *
 * @author hannapieniazek
 * @version 1.0
 */

public class Room implements Location{
    int id;
    String name;

    double area;
    double cube;
    double heating;
    double light;
    
     /**
     * @param id id of the room
     * @param name name of the room
     * @param area area of the room
     * @param cube cubic capacity of the room
     * @param heating energy used for heating in the room
     * @param light lighting power of the room
     */
    
    public Room(int id, String name, double area, double cube, double heating, double light){
        this.id = id;
        this.name = name;
        this.area = area;
        this.cube = cube;
        this.heating = heating;
        this.light = light;
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
