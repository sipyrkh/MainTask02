package by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic;

public abstract class Aircraft {
    private String aircraftManufacturer;
    private String aircraftModel;
    private int flightRange;
    private int fuelConsumption;

    public Aircraft(int flightRange, int fuelConsumption, String aircraftManufacturer, String aircraftModel) {
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.aircraftManufacturer = aircraftManufacturer;
        this.aircraftModel = aircraftModel;
    }

    public abstract int getSeatingCapacity();

    public abstract int getCargoCapacity();

    public int getFlightRange() {
        return flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getAircraftManufacturer() {
        return aircraftManufacturer;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    @Override
    public String toString() {
        return "Aircraft [aircraftManufacturer=" + aircraftManufacturer
                + ", aircraftModel=" + aircraftModel + ", seatingCapacity="
                + getSeatingCapacity() + ", cargoCapacity=" + getCargoCapacity()
                + ", flightRange=" + flightRange + ", fuelConsumption="
                + fuelConsumption + "]";
    }

}
