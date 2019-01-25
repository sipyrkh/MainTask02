package by.epam.javatraining.ZayatsArtyom.tasks.maintask02;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic.Aircraft;
import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic.AircraftCompare;
import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.view.Printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airline {
    private String airlineName;
    private List<Aircraft> aircrafts = new ArrayList<>();

    public Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public int calculateTotalPassengerCapacity() {
        int totalPassengerCapacity = 0;
        for (int i = 0; i < aircrafts.size(); ++i) {
            totalPassengerCapacity += aircrafts.get(i).getSeatingCapacity();
        }
        return totalPassengerCapacity;
    }

    public int calculateTotalCargoCapacity(){
        int totalCargoCapacity = 0;
        for (int i = 0; i < aircrafts.size(); ++i){
            totalCargoCapacity += aircrafts.get(i).getCargoCapacity();
        }
        return totalCargoCapacity;
    }

    public void sortPlanesByFlightRange() {
        Collections.sort(this.aircrafts, new AircraftCompare());
    }

    public ArrayList<Aircraft> filterAircraftsByFuelConsumption(int min, int max, boolean showResult) {
        ArrayList<Aircraft> resultList = new ArrayList<Aircraft>();
        for (int i = 0; i < this.aircrafts.size(); ++i) {
            int planeConsumption = aircrafts.get(i).getFuelConsumption();
            if (planeConsumption >= min && planeConsumption <= max) {
                resultList.add(aircrafts.get(i));
            }
        }

        if (showResult == true) {
            showAircraftList(resultList);
        }

        return resultList;
    }

    public ArrayList<Aircraft> filterAircraftsByPassengerCapacity(int min, int max, boolean showResult) {
        ArrayList<Aircraft> resultSet = new ArrayList<>();
        for(int i = 0; i < this.aircrafts.size(); ++i){
            if(this.aircrafts.get(i).getSeatingCapacity() >= min &&
                    this.aircrafts.get(i).getSeatingCapacity() <= max){
                resultSet.add(this.aircrafts.get(i));
            }
        }

        if (showResult == true) {
            showAircraftList(resultSet);
        }
        return resultSet;
    }

    public void showAirlineAircrafts() {
        showAircraftList(this.aircrafts);
    }

    private void showAircraftList(List<Aircraft> al) {
        Printer.print("======= " + this.getAirlineName() + " ======");
        for (int i = 0; i < al.size(); ++i) {
            Printer.print(al.get(i) + "");
            MainTask02.LOGGER.info(al.get(i));
        }
    }
}
