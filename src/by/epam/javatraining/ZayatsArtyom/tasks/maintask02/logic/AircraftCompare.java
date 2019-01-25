package by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic;

import java.util.Comparator;

public class AircraftCompare implements Comparator<Aircraft> {

    @Override
    public int compare(Aircraft a1, Aircraft a2) {
        return Integer.valueOf(a1.getFlightRange()).compareTo(a2.getFlightRange());
    }

}
