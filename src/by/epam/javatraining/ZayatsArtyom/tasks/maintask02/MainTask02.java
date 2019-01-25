package by.epam.javatraining.ZayatsArtyom.tasks.maintask02;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.logic.Aircraft;
import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.planes.planePool.*;
import by.epam.javatraining.ZayatsArtyom.tasks.maintask02.view.Printer;

import org.apache.log4j.Logger;

/*
    Created by Zayats Artyom
    22.01.2019
 */

/*
    Определить иерархию самолетов. Создать авиакомпании.
    Посчитать общую вместимость и грузоподъемность. Провести сортировку
    самолетов компании по дальности полета и другим существенным характеристикам.
    Найти самолет в компании, соответствующий заданному диапазону параметров,
    а также по экстремальным значениям (самый пассажировместимый самолёт или
    наоборот, самолёт с максимальной/минимальной грузоподъёмностью и т.д.).
 */
public class MainTask02 {
    public final static Logger LOGGER = Logger.getLogger(MainTask02.class);
    public static void main(String[] args) {
        LOGGER.info("Program was started successfully!");
        Aircraft aircraftAirbusA320a = new AircraftAirbusA320();
        Aircraft aircraftAirbusA320b = new AircraftAirbusA320();
        Aircraft aircraftDouglas = new AircraftDouglasMD11F();
        Aircraft aircraftCessna = new AircraftCessna172();
        Aircraft aircraftBoeing = new AircraftBoeing737();
        Aircraft aircraftIL = new AircrfatIL76();
        if(aircraftAirbusA320a == null || aircraftAirbusA320b == null || aircraftBoeing == null || aircraftCessna == null
                || aircraftDouglas == null || aircraftIL == null){
            LOGGER.error("Object is null");
        }else {
            Airline belarusianAirlines = new Airline("BELAVIA");
            belarusianAirlines.addAircraft(aircraftAirbusA320a);
            belarusianAirlines.addAircraft(aircraftAirbusA320b);
            belarusianAirlines.addAircraft(aircraftDouglas);
            belarusianAirlines.addAircraft(aircraftCessna);
            belarusianAirlines.addAircraft(aircraftBoeing);
            belarusianAirlines.addAircraft(aircraftIL);

            belarusianAirlines.showAirlineAircrafts();

            Printer.print("Aircrafts sorted by flight range: ");
            LOGGER.info("Aircrafts sorted by flight range: ");

            //Sorted aircrafts by flight range

            belarusianAirlines.sortPlanesByFlightRange();
            belarusianAirlines.showAirlineAircrafts();


            //Filtered aircrafts by fuel consumption > 200 && < 3000

            Printer.print("Fuel consumption > 2000 < 3000 : " +
                    belarusianAirlines.filterAircraftsByFuelConsumption(2000, 3000, true));
            LOGGER.info("Fuel consumption > 2000 < 3000 : " +
                    belarusianAirlines.filterAircraftsByFuelConsumption(2000, 3000, true));


            //Filtered aircrafts by seating passengers capacity

            Printer.print("Passenger capacity > 1 < 3 :" +
                    belarusianAirlines.filterAircraftsByPassengerCapacity(1, 3, true));
            LOGGER.info("Passenger capacity > 1 < 3 :" +
                    belarusianAirlines.filterAircraftsByPassengerCapacity(1, 3, true));

            //Calculating total cargo passengers capacity

            Printer.print("Total passenger capacity = " + belarusianAirlines.calculateTotalPassengerCapacity());
            Printer.print("Total cargo capacity = " + belarusianAirlines.calculateTotalCargoCapacity());
            LOGGER.info("Total passenger capacity = " + belarusianAirlines.calculateTotalPassengerCapacity());
            LOGGER.info("Total cargo capacity = " + belarusianAirlines.calculateTotalCargoCapacity());
            LOGGER.info("Program was ended successfully!");
        }
    }
}
