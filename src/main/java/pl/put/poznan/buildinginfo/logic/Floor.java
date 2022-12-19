package pl.put.poznan.buildinginfo.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * This class handles operations regarding the whole floor
 *
 * @author julia-bit
 * @author jan-szczuka5
 * @author Johnybonny
 * @author hannapieniazek
 * @version 1.0
 */

public class Floor implements Location{
    private int id;
    private String name;

    private List<Room> rooms = new ArrayList<>();

     /**
     * @param id id of the floor
     * @param name name of the floor
     */
    
    public Floor(int id, String name) {
        this.id = id;
        this.name = name;
    }

     /**
     * Adds a room object to the list of rooms on the floor
     *
     * @param room room on the floor
     */
    
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
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
     * Calculates the total area of the floor based on the areas of all the rooms on that floor
     *
     * @return total area of the floor
     */
    
    @Override
    public float getArea() {
        float total = 0F;
        for(Room r: rooms) {
            total += r.getArea();
        }
        return total;
    }

     /**
     * Calculates the total cubic capacity of the floor based on the cubic capacities of all the rooms on that floor
     *
     * @return total cubic capacity of the floor
     */
    
    @Override
    public float getCube() {
        float total = 0F;
        for(Room r: rooms) {
            total += r.getCube();
        }
        return total;
    }

     /**
     * Calculates the total energy used for heating on the floor based on the energy used for heating in all the rooms on that floor
     *
     * @return total energy used for heating on the floor
     */
    
    @Override
    public float getHeating() {
        float total = 0F;
        for(Room r: rooms) {
            total += r.getHeating();
        }
        return total;
    }

     /**
     * Calculates the total lighting power of the floor based on the lighting power of all the rooms on that floor
     *
     * @return total lighting power of the floor
     */
    
    @Override
    public float getLight() {
        float total = 0F;
        for(Room r: rooms) {
            total += r.getLight();
        }
        return total;
    }
}
