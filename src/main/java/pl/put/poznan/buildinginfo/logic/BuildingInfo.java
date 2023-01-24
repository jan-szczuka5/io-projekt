package pl.put.poznan.buildinginfo.logic;


import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.put.poznan.buildinginfo.rest.BuildingInfoController;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the main class of application 
 *
 * @author julia-bit
 * @author jan-szczuka5
 * @author Johnybonny
 * @author hannapieniazek
 * @version 1.0
 */

public class BuildingInfo
{
    private List<Building> allBuildings;
    private static final Logger logger = LoggerFactory.getLogger(BuildingInfo.class);

    /**
     * This function finds the location by its id
     *
     * @param id location id
     * @return null
     */
    
    public Location findSpecificLocationById(int id)
    {
        logger.debug("Search for location started");
        for(Building b: allBuildings) {
            logger.debug("Searching in buildings list");
            if(b.getId() == id) {
                logger.debug("Id belongs to building");
                return b;
            }
            for(Floor f: b.getFloors()) {
                logger.debug("Searching in floors list");
                if(f.getId() == id) {
                    logger.debug("Id belongs to floor");
                    return f;
                }
                for(Room r: f.getRooms()) {
                    logger.debug("Searching in rooms list");
                    if(r.getId() == id) {
                        logger.debug("Id belongs to room");
                        return r;
                    }
                }
            }
        }
        return null;
    }
    
     /**
     * This function loads all buildings from JSON string 
     *
     * @param jsonString JSON data string 
     */

    public void loadALlBuildingsFromJson(String jsonString)
    {
        logger.debug("Loading data");
        DataLoader dataLoader = new DataLoader();
        try {
            allBuildings = dataLoader.loadDataFromJson(jsonString);
        } catch (JSONException e) {
            logger.debug("JSONException caught");
            e.printStackTrace();
        }
    }

     /**
     * This function finds the rooms where the level of heating is exceeded 
     *
     * @param b building 
     * @param level maximum quantity of energy which can be used for heating
     * @return list of rooms in the building b where the level of heating is exceeded
     */
    
    public List<Room> findHeatingAboveLevel(Building b, float level)
    {
        List<Room> rooms = new ArrayList<>();
        logger.debug("Search for heating above level started");
        for(Floor f: b.getFloors()) {
            logger.debug("Searching in floors list");
            for(Room r: f.getRooms()) {
                logger.debug("Searching in rooms list");
                if(r.getHeating() > level) {
                    logger.debug("Found heating above level");
                    rooms.add(r);
                }
            }
        }
        return rooms;
    }

}
