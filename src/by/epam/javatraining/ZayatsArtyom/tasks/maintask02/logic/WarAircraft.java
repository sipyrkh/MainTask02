package by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic;

public class WarAircraft extends Aircraft {
    private int seatingCapacity;
    private int cargoCapacity;

    public WarAircraft(int seatingCapacity, int cargoCapacity,
                                       int flightRange, int fuelConsumption, String aircraftManufacturer,
                                       String aircraftModel) {
        super(flightRange, fuelConsumption, aircraftManufacturer, aircraftModel);
        this.seatingCapacity = seatingCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
