package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Floor implements Location{
    private int id;
    private String name;
    private List<Room> rooms;

    private float TotalArea;
    private float TotalCube;
    private float TotalLight;
    private float TotalHeating;

    public float getTotalArea(){
        for(Room r : rooms){
            TotalArea += r.getArea();
        }
        return TotalArea;
    }
    public float getTotalCube(){
        for(Room r : rooms){
            TotalCube += r.getCube();
        }
        return TotalCube;
    }
    public float getTotalLight(){
        for(Room r : rooms){
            TotalLight += r.getLight();
        }
        return TotalLight;
    }
    public float getTotalHeating(){
        for(Room r : rooms){
            TotalHeating += r.getHeating();
        }
        return TotalHeating;
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
