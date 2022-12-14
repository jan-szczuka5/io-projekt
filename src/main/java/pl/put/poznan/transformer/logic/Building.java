package pl.put.poznan.transformer.logic;

import java.util.List;

public class Building implements Location{
    private int id;

    private String name;
    private List<Floor> floors;

    private float TotalArea;
    private float TotalCube;
    private float TotalLight;
    private float TotalHeating;

    public float getTotalArea(){
        for(Floor f : floors){
            TotalArea += f.getTotalArea();
        }
        return TotalArea;
    }
    public float getTotalCube(){
        for(Floor f : floors){
            TotalCube += f.getTotalCube();
        }
        return TotalCube;
    }
    public float getTotalLight(){
        for(Floor f : floors){
            TotalLight += f.getTotalLight();
        }
        return TotalLight;
    }
    public float getTotalHeating(){
        for(Floor f : floors){
            TotalHeating += f.getTotalHeating();
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
