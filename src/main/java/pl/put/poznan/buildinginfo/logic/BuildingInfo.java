package pl.put.poznan.buildinginfo.logic;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BuildingInfo
{
    private final String[] functionName;
    private List<Building> allBuildings;

    public String getAllBuildings()
    {

        return allBuildings.get(0).getName();

    }

    public BuildingInfo(String[] functionName)
    {
        this.functionName = functionName;
    }

    public void loadALlBuildings()
    {
        DataLoader dataLoader = new DataLoader();
        try {
            allBuildings = dataLoader.loadData("src\\main\\resources\\data.json");
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }


    }


}
