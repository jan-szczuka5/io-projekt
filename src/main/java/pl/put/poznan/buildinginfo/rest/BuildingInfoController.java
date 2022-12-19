package pl.put.poznan.buildinginfo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.buildinginfo.logic.BuildingInfo;
import pl.put.poznan.buildinginfo.logic.Location;


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

}
