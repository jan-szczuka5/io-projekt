package pl.put.poznan.buildinginfo.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BuildingTest {

    Building building;

    @BeforeEach
    public void SetUp() {
        building = new Building(23, "A");
    }

    @Test
    public void testAddFloor() {
        // Create a mock list of floors
        List<Floor> mockFloors = mock(ArrayList.class);

        // Create a mock floor
        Floor mockFloor = mock(Floor.class);

        // Create a Building object with the mock list of floors
        building.setFloors(mockFloors);

        // Call the addFloor method
        building.addFloor(mockFloor);

        // Verify that the add method on the mock list of floors was called with the mock floor
        verify(mockFloors).add(mockFloor);
    }

    @Test
    public void getId() {
        assertEquals(building.getId(), 23);
    }


    @Test
    public void getName() {
        assertEquals(building.getName(), "A");
    }

    @Test
    public void getAreaMock() {
        Floor mock1 = mock(Floor.class);
        when(mock1.getArea()).thenReturn(10.9f);

        Floor mock2 = mock(Floor.class);
        when(mock2.getArea()).thenReturn(11.6f);

        building.addFloor(mock1);
        building.addFloor(mock2);

        building.getArea();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getArea();

        InOrder inOrder2 = inOrder(mock2);
        inOrder2.verify(mock2).getArea();


        assertEquals(building.getArea(), 22.5f);
    }

    @Test
    public void getCube2RoomsMock() {
        Floor mock1 = mock(Floor.class);
        when(mock1.getCube()).thenReturn(9.9f);

        Floor mock2 = mock(Floor.class);
        when(mock2.getCube()).thenReturn(1.8f);

        building.addFloor(mock1);
        building.addFloor(mock2);

        building.getCube();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getCube();

        InOrder inOrder2 = inOrder(mock2);
        inOrder2.verify(mock2).getCube();


        assertEquals(building.getCube(), 11.7f);
    }

    @Test
    public void getHeating() {
        Floor mock1 = mock(Floor.class);
        when(mock1.getHeating()).thenReturn(0f);

        Floor mock2 = mock(Floor.class);
        when(mock2.getHeating()).thenReturn(5.8f);

        building.addFloor(mock1);
        building.addFloor(mock2);

        building.getHeating();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getHeating();

        InOrder inOrder2 = inOrder(mock2);
        inOrder2.verify(mock2).getHeating();


        assertEquals(building.getHeating(), 5.8f);
    }

    @Test
    public void getLight() {
        Floor mock1 = mock(Floor.class);
        when(mock1.getLight()).thenReturn(0.2f);

        Floor mock2 = mock(Floor.class);
        when(mock2.getLight()).thenReturn(0.4f);

        building.addFloor(mock1);
        building.addFloor(mock2);

        building.getLight();

        InOrder inOrder = inOrder(mock1);
        inOrder.verify(mock1).getLight();

        InOrder inOrder2 = inOrder(mock2);
        inOrder2.verify(mock2).getLight();


        assertEquals(building.getLight(), 0.6f);
    }

}
