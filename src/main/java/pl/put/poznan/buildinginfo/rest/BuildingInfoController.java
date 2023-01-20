package pl.put.poznan.buildinginfo.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.buildinginfo.logic.Building;
import pl.put.poznan.buildinginfo.logic.BuildingInfo;
import pl.put.poznan.buildinginfo.logic.Location;
import pl.put.poznan.buildinginfo.logic.Room;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/buildinginfo", produces = "application/json")
public class BuildingInfoController
{
    private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

    @PostMapping("/getArea/{id}")
    @ResponseBody
    public String GetArea(@RequestBody String json, @PathVariable String id) {
        logger.info("Loading json file");
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.loadALlBuildingsFromJson(json);

        logger.info("Calculating area for: " + id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            logger.info("Wrong id");
            return "Wrong id";
        }
        String result = String.valueOf(location.getArea());
        logger.info("Area calculated successfully: " + result);
        return result;
    }

    @PostMapping("/getCube/{id}")
    @ResponseBody
    public String GetCube(@RequestBody String json, @PathVariable String id) {
        logger.info("Loading json file");
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.loadALlBuildingsFromJson(json);

        logger.info("Calculating cube for: " + id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            logger.info("Wrong id");
            return "Wrong id";
        }
        String result = String.valueOf(location.getCube());
        logger.info("Cube calculated successfully: " + result);
        return result;
    }

    @PostMapping("/getLightPerArea/{id}")
    @ResponseBody
    public String GetLightPerArea(@RequestBody String json, @PathVariable String id) {
        logger.info("Loading json file");
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.loadALlBuildingsFromJson(json);

        logger.info("Calculating light per area for: " + id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            logger.info("Wrong id");
            return "Wrong id";
        }
        String result = String.valueOf(location.getLight()/location.getArea());
        logger.info("Light per area calculated successfully: " + result);
        return result;
    }

    @PostMapping("/getHeatingPerCube/{id}")
    @ResponseBody
    public String GetHeatingPerCube(@RequestBody String json, @PathVariable String id) {
        logger.info("Loading json file");
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.loadALlBuildingsFromJson(json);

        logger.info("Calculating heating per cube for: " + id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            logger.info("Wrong id");
            return "Wrong id";
        }
        String result = String.valueOf(location.getHeating()/location.getCube());
        logger.info("Heating per cube calculated successfully: " + result);
        return result;
    }

    @PostMapping("/getHeatingAboveLevel/{id}/{level}")
    @ResponseBody
    public String GetHeatingAboveLevel(@RequestBody String json, @PathVariable String id, @PathVariable String level) {
        logger.info("Loading json file");
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.loadALlBuildingsFromJson(json);

        logger.info("Checking the id");
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            logger.info("There is no such location");
            return "Wrong id";
        } else {
            if (!(location instanceof Building)){
                logger.info("Id doesn't belong to building");
                return "Wrong id";
            }
        }

        logger.info("Finding heating above level for: " + id);
        Building building = (Building) location;
        List<Room> results = buildingInfo.findHeatingAboveLevel(building, Float.parseFloat(level));
        if(results == null){
            return null;
        }

        logger.info("Heating above level found");
        ObjectMapper mapper = new ObjectMapper();
        String roomsJson = "[";
        try {
            for(Room r: results){
                roomsJson += mapper.writeValueAsString(r) + ",";
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        if(roomsJson.length() == 1){
            roomsJson = "[]";
        } else{
            roomsJson = roomsJson.substring(0, roomsJson.length() - 1);
            roomsJson += "]";
        }

        // Not finished
        return roomsJson;
    }

}
