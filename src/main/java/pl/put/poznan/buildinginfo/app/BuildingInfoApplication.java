package pl.put.poznan.buildinginfo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.buildinginfo.rest"})

/**
 * This class is responsible for running the application
 *
 * @author julia-bit
 * @author jan-szczuka5
 * @author Johnybonny
 * @author hannapieniazek
 * @version 1.0
 */

public class BuildingInfoApplication
{
    
     /**
     * This is the main function, which runs the application
     *
     * @param args
     */
    
    public static void main (String[] args)
    {
        SpringApplication.run(BuildingInfoApplication.class, args);
    }

}
