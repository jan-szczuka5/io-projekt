package pl.put.poznan.transformer.logic;

import java.util.List;

public class Building implements Location{
    private int id;

    private String name;
    private List<Floor> floors;



    public Building(String name){
        this.id = 1;
        this.name = name;
    }
    public void addFloor(Floor floor) {
        floors.add(floor);
    }
    public float getTotalArea(){
        float TotalArea = 0F;
        for(Floor f : floors){
            TotalArea += f.getTotalArea();
        }
        return TotalArea;
    }
    public float getTotalCube(){
        float TotalCube = 0F;
        for(Floor f : floors){
            TotalCube += f.getTotalCube();
        }
        return TotalCube;
    }
    public float getTotalLight(){
        float TotalLight = 0F;
        for(Floor f : floors){
            TotalLight += f.getTotalLight();
        }
        return TotalLight;
    }
    public float getTotalHeating(){
        float TotalHeating = 0F;
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
