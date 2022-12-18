package pl.put.poznan.buildinginfo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.buildinginfo.app"})
public class BuildingInfoApplication
{
    public static void main (String[] args)
    {
        SpringApplication.run(BuildingInfoApplication.class, args);
    }

}
