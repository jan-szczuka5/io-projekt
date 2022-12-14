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

    void loadData() throws IOException, JSONException {
        // String filePath = "C:\\Users\\Dell\\Desktop\\Studia\\V Semestr\\Inżynieria Oprogramowania\\Projekt\\io-projekt\\src\\main\\resources";
        String filePath = "./resources/data.json";
        String jsonString = new String(Files.readAllBytes(Paths.get(filePath))); //assign your JSON String here
        JSONObject obj = new JSONObject(jsonString);

        List<Building> buildingsList = new ArrayList<>();

        JSONArray buildings = obj.getJSONArray("buildings");
        for (int i = 0; i < buildings.length(); i++) {
            String buildingName = buildings.getJSONObject(i).getString("name");
            Building newBuilding = new Building();
            JSONArray floors = buildings.getJSONObject(i).getJSONArray("floors");
            for (int j = 0; j < floors.length(); j++) {
                String floorName = floors.getJSONObject(j).getString("name");
                Floor newFloor = new Floor(floorName);

                JSONArray rooms = floors.getJSONObject(j).getJSONArray("rooms");
                for (int k = 0; k < rooms.length(); k++) {

                    String roomName = floors.getJSONObject(j).getString("name");
                    int area = floors.getJSONObject(j).getInt("area");
                    int cube = floors.getJSONObject(j).getInt("cube");
                    Room newRoom = new Room(roomName, area, cube);
                    newFloor.addRoom(newRoom);
                }
                newBuilding.addFloor(newFloor);
            }
            buildingsList.add(newBuilding);
        }
        // Printowanie czy działa
    }
}
