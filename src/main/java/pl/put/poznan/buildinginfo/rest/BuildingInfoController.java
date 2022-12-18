package pl.put.poznan.buildinginfo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.buildinginfo.logic.BuildingInfo;
import java.util.Arrays;

@RestController
@RequestMapping(value = "/buildinginfo", produces = "application/json")
public class BuildingInfoController
{
    private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);


    @GetMapping("/load")
    public String loadData() {
        // perform the transformation, you should run your logic here, below is just a silly example
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.loadALlBuildings();
        return buildingInfo.getAllBuildings();
    }

    @GetMapping("/loadfromjson/{json}")
    public String loadDataFromJson(@PathVariable String json) {
        logger.debug(json);
        // perform the transformation, you should run your logic here, below is just a silly example
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.loadALlBuildingsFromJson(json);
        return buildingInfo.getAllBuildings();
    }

    @GetMapping("/loadandread/{number}")
    public String loadAndRead(@PathVariable String number) {
        logger.debug(number);
        // perform the transformation, you should run your logic here, below is just a silly example
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.loadALlBuildings();
        return buildingInfo.getOneBuilding(Integer.parseInt(number));
    }




}
