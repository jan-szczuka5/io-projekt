package pl.put.poznan.buildinginfo.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * This class handles operations regarding the whole building
 *
 * @author julia-bit
 * @author jan-szczuka5
 * @author Johnybonny
 * @author hannapieniazek
 * @version 1.0
 */

public class Building implements Location{
    private int id;
    private String name;

    private List<Floor> floors = new ArrayList<>();

     /**
     * @param id id of the building
     * @param name name of the building
     */
    
    public Building(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Adds a floor object to the list of floors in the building
     *
     * @param floors floor in the building
     */

    public void setFloors(List<Floor> floors){
        this.floors = floors;
    }
    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public List<Floor> getFloors() {
        return floors;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

     /**
     * Calculates the total area of the building based on the areas of all the floors in that building
     *
     * @return total area of the building
     */
    
    @Override
    public float getArea() {
        float total = 0F;
        for(Floor f: floors) {
            total += f.getArea();
        }
        return total;
    }

     /**
     * Calculates the total cubic capacity of the building based on the cubic capacities of all the floors in that building
     *
     * @return total cubic capacity of the building
     */
    
    @Override
    public float getCube() {
        float total = 0F;
        for(Floor f:floors) {
            total += f.getCube();
        }
        return total;
    }

    /**
     * Calculates the total energy used for heating in the building based on the energy used for heating on all the floors in that building
     *
     * @return total energy used for heating in the building
     */
    
    @Override
    public float getHeating() {
        float total = 0F;
        for(Floor f:floors) {
            total += f.getHeating();
        }
        return total;
    }

    /**
     * Calculates the total lighting power of the building based on the lighting power of all the floors in that building
     *
     * @return total lighting power of the building
     */
    
    @Override
    public float getLight() {
        float total = 0F;
        for(Floor f:floors) {
            total += f.getLight();
        }
        return total;
    }
}
