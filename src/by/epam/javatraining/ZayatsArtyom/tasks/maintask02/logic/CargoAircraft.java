package by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic;

public abstract class CargoAircraft extends Aircraft {
    private int cargoCapacity;

    public CargoAircraft(int cargoCapacity,int flightRange, int fuelConsumption,
                         String aircraftManufacturer, String aircraftModel) {
        super(flightRange, fuelConsumption, aircraftManufacturer, aircraftModel);

        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
