package pl.put.poznan.buildinginfo.app;

import org.json.JSONException;
import pl.put.poznan.buildinginfo.logic.DataLoader;

import java.io.IOException;


// Klasa istnieje po to, żeby przetestować działanie dataLoadera
public class Main {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        try {
            dataLoader.loadData();
        } catch (IOException e) {
            System.out.println("IO EXCEPTION");
            e.printStackTrace();
        } catch (JSONException e) {
            System.out.println("JSON EXCEPTION");
            e.printStackTrace();
        }
    }
}
