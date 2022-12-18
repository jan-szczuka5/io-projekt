package pl.put.poznan.buildinginfo.logic;


import org.json.JSONException;
import java.util.List;

public class BuildingInfo
{
    private List<Building> allBuildings;


    public Location findSpecificLocationById(int id)
    {
        for(Building b: allBuildings) {
            if(b.getId() == id) {
                return b;
            }
            for(Floor f: b.floors) {
                if(f.getId() == id) {
                    return f;
                }
                for(Room r: f.rooms) {
                    if(r.getId() == id) {
                        return r;
                    }
                }
            }
        }
        return null;
    }

    public void loadALlBuildingsFromJson(String jsonString)
    {
        DataLoader dataLoader = new DataLoader();
        try {
            allBuildings = dataLoader.loadDataFromJson(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
