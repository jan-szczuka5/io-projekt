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

    public List<Building> loadData(String filePath) throws IOException, JSONException {
        // String filePath = "src\\main\\resources\\data.json";
        String jsonString = new String(Files.readAllBytes(Paths.get(filePath))); //assign your JSON String here
        JSONObject obj = new JSONObject(jsonString);

        List<Building> buildingsList = new ArrayList<>();

        JSONArray buildings = obj.getJSONArray("buildings");
        for (int i = 0; i < buildings.length(); i++) {

            int buildingId = buildings.getJSONObject(i).getInt("id");
            String buildingName = null;
            if (buildings.getJSONObject(i).has("name")) {
                buildingName = buildings.getJSONObject(i).getString("name");
            }

            Building newBuilding = new Building(buildingId, buildingName);

            JSONArray floors = buildings.getJSONObject(i).getJSONArray("floors");
            for (int j = 0; j < floors.length(); j++) {
                int floorId = floors.getJSONObject(j).getInt("id");
                String floorName = null;
                if (floors.getJSONObject(j).has("name")) {
                    floorName = floors.getJSONObject(j).getString("name");
                }
                Floor newFloor = new Floor(floorId, floorName);

                JSONArray rooms = floors.getJSONObject(j).getJSONArray("rooms");
                for (int k = 0; k < rooms.length(); k++) {
                    int roomId = rooms.getJSONObject(k).getInt("id");

                    String roomName = null;
                    if (rooms.getJSONObject(k).has("name")) {
                        roomName = rooms.getJSONObject(k).getString("name");
                    }
                    double area = rooms.getJSONObject(k).getDouble("area");
                    double cube = rooms.getJSONObject(k).getDouble("cube");
                    double heating = rooms.getJSONObject(k).getDouble("heating");
                    double light = rooms.getJSONObject(k).getDouble("light");
                    Room newRoom = new Room(roomId, roomName, area, cube, heating, light);
                    newFloor.addRoom(newRoom);
                }
                newBuilding.addFloor(newFloor);
            }
            buildingsList.add(newBuilding);
        }

        return buildingsList;

        // Printowanie czy działa
//        for (Building b: buildingsList) {
//            System.out.println("Building name: " + b.getName());
//            b.getFloorNames();
//        }
//
//        for (Building b: buildingsList) {
//            System.out.println("Total area of a building: " + b.getTotalArea());
//        }

    }
}
