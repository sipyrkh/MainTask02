package by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic;

public class LightPassengerAircraft extends Aircraft {
    private int seatingCapacity;

    public LightPassengerAircraft(int seatingCapacity, int flightRange,
                                  int fuelConsumption, String aircraftManufacturer,
                                  String aircraftModel) {
        super(flightRange, fuelConsumption, aircraftManufacturer, aircraftModel);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return 0;
    }
}
