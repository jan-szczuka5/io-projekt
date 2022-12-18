package pl.put.poznan.buildinginfo.logic;

/**
 * This class handles operations regarding the room
 *
 * @author hannapieniazek
 * @version 1.0
 */

public class Room implements Location{
    private int id;
    private String name;

    private float area;
    private float cube;
    private float heating;
    private float light;
    
     /**
     * @param id id of the room
     * @param name name of the room
     * @param area area of the room
     * @param cube cubic capacity of the room
     * @param heating energy used for heating in the room
     * @param light lighting power of the room
     */
    
    public Room(int id, String name, float area, float cube, float heating, float light){
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
