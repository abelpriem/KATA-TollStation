package org.factoriaf5.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testCarTollAmount() {
        Car car = new Car("CAR001");
        assertEquals(100, car.getTollAmount());
    }

    @Test
    public void testCarLicensePlate() {
        Car car = new Car("CAR001");
        assertEquals("CAR001", car.getLicensePlate());
    }
}
