package pl.put.poznan.buildinginfo.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FloorTest {

    Floor floor;

    @BeforeEach
    public void SetUp(){
        floor = new Floor(205, "second floor");
    }


    @Test
    public void testAddRoom() {
        // Create a mock list of rooms
        List<Room> mockRooms = mock(ArrayList.class);

        // Create a mock room
        Room mockRoom = mock(Room.class);

        // Create a Floor object with the mock list of rooms
        floor.setRooms(mockRooms);

        // Call the addRoom method
        floor.addRoom(mockRoom);

        // Verify that the add method on the mock list of rooms was called with the mock room
        verify(mockRooms).add(mockRoom);
    }


    @Test
    public void getRooms() {
        Room room1 = new Room(10, "Toaleta", 10.5f, 11.5f, 12.5f, 13.5f);
        Room room2 = new Room(11, "Spiżarnia", 8.5f, 9.5f, 100.7f, 13f);
        floor.addRoom(room1);
        floor.addRoom(room2);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        assertEquals(floor.getRooms(), rooms);
    }


    @Test
    public void getId() {
        assertEquals(floor.getId(), 205);
    }


    @Test
    public void getName() {
        assertEquals(floor.getName(), "second floor");
    }


    @Test
    public void getArea1RoomMock() {
        Room mock1 = mock(Room.class);
        when(mock1.getArea()).thenReturn(101.9f);

        floor.addRoom(mock1);

        floor.getArea();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getArea();

        assertEquals(floor.getArea(), 101.9f);
    }


    @Test
    public void getArea2RoomsMock() {
        Room mock1 = mock(Room.class);
        when(mock1.getArea()).thenReturn(10.9f);

        Room mock2 = mock(Room.class);
        when(mock2.getArea()).thenReturn(11.6f);

        floor.addRoom(mock1);
        floor.addRoom(mock2);

        floor.getArea();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getArea();

        InOrder inOrder2 = inOrder(mock2);
        inOrder2.verify(mock2).getArea();


        assertEquals(floor.getArea(), 22.5f);
    }


    @Test
    public void getCube1RoomMock() {
        Room mock1 = mock(Room.class);
        when(mock1.getCube()).thenReturn(8.8f);

        floor.addRoom(mock1);

        floor.getCube();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getCube();

        assertEquals(floor.getCube(), 8.8f);
    }


    @Test
    public void getCube2RoomsMock() {
        Room mock1 = mock(Room.class);
        when(mock1.getCube()).thenReturn(9.9f);

        Room mock2 = mock(Room.class);
        when(mock2.getCube()).thenReturn(1.8f);

        floor.addRoom(mock1);
        floor.addRoom(mock2);

        floor.getCube();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getCube();

        InOrder inOrder2 = inOrder(mock2);
        inOrder2.verify(mock2).getCube();


        assertEquals(floor.getCube(), 11.7f);
    }


    @Test
    public void getHeating1RoomMock() {
        Room mock1 = mock(Room.class);
        when(mock1.getHeating()).thenReturn(0.3f);


        floor.addRoom(mock1);

        floor.getHeating();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getHeating();

        assertEquals(floor.getHeating(), 0.3f);
    }


    @Test
    public void getHeating2RoomsMock() {
        Room mock1 = mock(Room.class);
        when(mock1.getHeating()).thenReturn(0f);

        Room mock2 = mock(Room.class);
        when(mock2.getHeating()).thenReturn(5.8f);

        floor.addRoom(mock1);
        floor.addRoom(mock2);

        floor.getHeating();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getHeating();

        InOrder inOrder2 = inOrder(mock2);
        inOrder2.verify(mock2).getHeating();


        assertEquals(floor.getHeating(), 5.8f);
    }


    @Test
    public void getLight1RoomMock() {
        Room mock1 = mock(Room.class);
        when(mock1.getLight()).thenReturn(10.9f);

        floor.addRoom(mock1);

        floor.getLight();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getLight();

        assertEquals(floor.getLight(), 10.9f);
    }


    @Test
    public void getLight2RoomsMock() {
        Room mock1 = mock(Room.class);
        when(mock1.getLight()).thenReturn(10f);

        Room mock2 = mock(Room.class);
        when(mock2.getLight()).thenReturn(20.1f);

        floor.addRoom(mock1);
        floor.addRoom(mock2);

        floor.getLight();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getLight();

        InOrder inOrder2 = inOrder(mock2);
        inOrder2.verify(mock2).getLight();


        assertEquals(floor.getLight(), 30.1f);
    }

}