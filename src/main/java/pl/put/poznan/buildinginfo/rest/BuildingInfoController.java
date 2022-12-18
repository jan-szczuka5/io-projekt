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
    private final BuildingInfo buildingInfo = new BuildingInfo();




    @PostMapping("/getArea/{id}")
    @ResponseBody
    public String GetArea(@RequestBody String json, @PathVariable String id) {
        buildingInfo.loadALlBuildingsFromJson(json);

        logger.debug(id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            return "Wrong id";
        }
        return String.valueOf(location.getArea());
    }

    @PostMapping("/getCube/{id}")
    @ResponseBody
    public String GetCube(@RequestBody String json, @PathVariable String id) {
        buildingInfo.loadALlBuildingsFromJson(json);

        logger.debug(id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            return "Wrong id";
        }
        return String.valueOf(location.getCube());
    }

    @PostMapping("/getLightPerArea/{id}")
    @ResponseBody
    public String GetLightPerArea(@RequestBody String json, @PathVariable String id) {
        buildingInfo.loadALlBuildingsFromJson(json);

        logger.debug(id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            return "Wrong id";
        }
        return String.valueOf(location.getLight()/location.getArea());
    }

}
