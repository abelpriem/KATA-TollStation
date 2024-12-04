package org.factoriaf5.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    public void testCarLicensePlate() {
        Vehicle car = new Car("CAR123");
        assertEquals("CAR123", car.getLicensePlate());
    }

    @Test
    public void testMotorcycleLicensePlate() {
        Vehicle motorcycle = new Motorcycle("BIKE456");
        assertEquals("BIKE456", motorcycle.getLicensePlate());
    }

    @Test
    public void testTruckLicensePlate() {
        Vehicle truck = new Truck("TRUCK789", 4);
        assertEquals("TRUCK789", truck.getLicensePlate());
    }
}
