package pl.put.poznan.buildinginfo.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    Room room;

    @BeforeEach
    void SetUp(){
        room = new Room(23, "living room", 23.2f, 43.1f, 67.2f, 19.3f);
    }
    
    @Test
    void testGetId() {
        assertEquals(room.getId(),23);
    }

    @Test
    void testGetName() {
        assertEquals(room.getName(), "living room");
    }

    @Test
    void testGetArea() {
        assertEquals(room.getArea(), 23.2f);
    }

    @Test
    void testGetCube() {
        assertEquals(room.getCube(), 43.1f);
    }

    @Test
    void testGetHeating() {
        assertEquals(room.getHeating(), 67.2f);
    }

    @Test
    void testGetLight() {
        assertEquals(room.getLight(), 19.3f);
    }
}