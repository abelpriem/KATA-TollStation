package org.factoriaf5.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TollStationTest {
    @Test
    public void testAddVehicleAndTotalCollected() {
        TollStation station = new TollStation("Main Gate", "Springfield");

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ789");
        Vehicle truck = new Truck("TRK456", 3);

        station.addVehicle(car);
        station.addVehicle(motorcycle);
        station.addVehicle(truck);

        assertEquals(350, station.getTotalCollected());
        assertEquals(3, station.getVehicles().size());
    }

    @Test
    public void testVehicleTollAmounts() {
        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ789");
        Vehicle truck = new Truck("TRK456", 4);

        assertEquals(100, car.getTollAmount());
        assertEquals(50, motorcycle.getTollAmount());
        assertEquals(200, truck.getTollAmount());
    }

    @Test
    public void testPrintReport() {
        TollStation station = new TollStation("City Gate", "Metropolis");

        Vehicle car = new Car("CAR123");
        Vehicle truck = new Truck("TRK789", 2);

        station.addVehicle(car);
        station.addVehicle(truck);

        station.printReport();
        assertEquals(200, station.getTotalCollected());
    }
}