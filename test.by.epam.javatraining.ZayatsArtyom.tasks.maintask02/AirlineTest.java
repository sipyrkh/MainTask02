package test.by.epam.javatraining.ZayatsArtyom.tasks.maintask02;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.Airline;
import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic.Aircraft;
import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.planes.planePool.*;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AirlineTest {

    public static final int MIN_FUEL_CUNSUMPTION = 2000;
    public static final int MAX_FUEL_CUNSUMPTION = 3000;
    public static final boolean SHOW_RESULT = false;
    public static final int MIN_PASSENGER_CAPACITY = 1;
    public static final int MAX_PASSENGER_CAPACITY = 3;

    public static final Airline belarusianAirlines = new Airline("BELAVIA");
    public static final Aircraft aircraftAirbusA320a = new AircraftAirbusA320();
    public static final Aircraft aircraftAirbusA320b = new AircraftAirbusA320();
    public static final Aircraft aircraftDouglas = new AircraftDouglasMD11F();
    public static final Aircraft aircraftCessna = new AircraftCessna172();
    public static final Aircraft aircraftBoeing = new AircraftBoeing737();
    public static final Aircraft aircraftIL = new AircrfatIL76();

    @BeforeTest
    public static void initializeObject(){
        belarusianAirlines.addAircraft(aircraftAirbusA320a);
        belarusianAirlines.addAircraft(aircraftAirbusA320b);
        belarusianAirlines.addAircraft(aircraftDouglas);
        belarusianAirlines.addAircraft(aircraftCessna);
        belarusianAirlines.addAircraft(aircraftBoeing);
        belarusianAirlines.addAircraft(aircraftIL);
    }

    @Test
    public static void testCalculateTotalPassengerCapacity(){
        int expectedTotalPassengerCapacity = 679;
        Assert.assertEquals(expectedTotalPassengerCapacity, belarusianAirlines.calculateTotalPassengerCapacity());
    }

    @Test
    public static void testCalculateTotalCargoCapacity(){
        int expectedTotalCargoCapacity = 92900;
        Assert.assertEquals(expectedTotalCargoCapacity, belarusianAirlines.calculateTotalCargoCapacity());
    }

    @Test
    public static void testFilterAircraftsByFuelConsumption(){
        ArrayList<Aircraft> expectedResultList = new ArrayList<>();
        expectedResultList.add(aircraftAirbusA320a);
        expectedResultList.add(aircraftAirbusA320b);
        expectedResultList.add(aircraftBoeing);
        Assert.assertEquals(expectedResultList,
                belarusianAirlines.filterAircraftsByFuelConsumption(MIN_FUEL_CUNSUMPTION,MAX_FUEL_CUNSUMPTION, SHOW_RESULT));
    }

    @Test
    public static void testFilterAircreafsByPassengerCapacity(){
        ArrayList<Aircraft> expectedResultList = new ArrayList<>();
        expectedResultList.add(aircraftCessna);
        Assert.assertEquals(expectedResultList,
                belarusianAirlines.filterAircraftsByPassengerCapacity(MIN_PASSENGER_CAPACITY,MAX_PASSENGER_CAPACITY,SHOW_RESULT));
    }
    }
}
