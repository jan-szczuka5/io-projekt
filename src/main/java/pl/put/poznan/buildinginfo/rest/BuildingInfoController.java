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
    private BuildingInfo buildingInfo = new BuildingInfo();


    @GetMapping("/getArea/{id}")
    public String getArea(@PathVariable String id) {
        logger.debug(id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            return "Wrong id";
        }
        return String.valueOf(location.getArea());
    }

    @GetMapping("/getCube/{id}")
    public String getCube(@PathVariable String id) {
        logger.debug(id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            return "Wrong id";
        }
        return String.valueOf(location.getCube());
    }

    @GetMapping("/getLightPerArea/{id}")
    public String getLightPerArea(@PathVariable String id) {
        logger.debug(id);
        Location location = buildingInfo.findSpecificLocationById(Integer.parseInt(id));
        if(location == null) {
            return "Wrong id";
        }
        return String.valueOf(location.getLight()/location.getArea());
    }

    @PostMapping("/loadfromjson")
    @ResponseBody
    public void loadDataFromJson(@RequestBody String json) {
        buildingInfo.loadALlBuildingsFromJson(json);
    }




}
