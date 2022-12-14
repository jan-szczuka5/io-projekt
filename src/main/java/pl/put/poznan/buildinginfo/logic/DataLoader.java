package pl.put.poznan.buildinginfo.logic;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    public void loadData() throws IOException, JSONException {
        String filePath = "src\\main\\resources\\data.json";
        String jsonString = new String(Files.readAllBytes(Paths.get(filePath))); //assign your JSON String here
        JSONObject obj = new JSONObject(jsonString);

        List<Building> buildingsList = new ArrayList<>();

        JSONArray buildings = obj.getJSONArray("buildings");
        for (int i = 0; i < buildings.length(); i++) {
            String buildingName = buildings.getJSONObject(i).getString("name");
            Building newBuilding = new Building(buildingName);
            JSONArray floors = buildings.getJSONObject(i).getJSONArray("floors");
            for (int j = 0; j < floors.length(); j++) {
                String floorName = floors.getJSONObject(j).getString("name");
                Floor newFloor = new Floor(floorName);

                JSONArray rooms = floors.getJSONObject(j).getJSONArray("rooms");
                for (int k = 0; k < rooms.length(); k++) {

                    String roomName = rooms.getJSONObject(k).getString("name");
                    int area = rooms.getJSONObject(k).getInt("area");
                    int cube = rooms.getJSONObject(k).getInt("cube");
                    Room newRoom = new Room(roomName, area, cube);
                    newFloor.addRoom(newRoom);
                }
                newBuilding.addFloor(newFloor);
            }
            buildingsList.add(newBuilding);
        }

        // Printowanie czy działa
        for (Building b: buildingsList) {
            System.out.println("Building name: " + b.getName());
            b.getFloorNames();
        }
    }
}
