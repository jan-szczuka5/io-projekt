package pl.put.poznan.buildinginfo.app;

import org.json.JSONException;
import pl.put.poznan.buildinginfo.logic.Building;
import pl.put.poznan.buildinginfo.logic.DataLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// Klasa istnieje po to, żeby przetestować działanie dataLoadera
public class Main {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        try {
            List<Building> buildingsList = new ArrayList<>();
            buildingsList = dataLoader.loadData("src\\main\\resources\\data.json");
            System.out.println("Total cube for first building: " + buildingsList.get(1).getTotalArea());
        } catch (IOException e) {
            System.out.println("IO EXCEPTION");
            e.printStackTrace();
        } catch (JSONException e) {
            System.out.println("JSON EXCEPTION");
            e.printStackTrace();
        }
    }
}
