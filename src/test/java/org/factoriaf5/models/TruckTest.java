package org.factoriaf5.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TruckTest {
    @Test
    public void testTruckTollAmountSingleAxle() {
        Truck truck = new Truck("TRK001", 1);
        assertEquals(50, truck.getTollAmount());
    }

    @Test
    public void testTruckTollAmountMultipleAxles() {
        Truck truck = new Truck("TRK002", 4);
        assertEquals(200, truck.getTollAmount());
    }

    @Test
    public void testTruckLicensePlate() {
        Truck truck = new Truck("TRK003", 3);
        assertEquals("TRK003", truck.getLicensePlate());
    }

    @Test
    public void testTruckNumberOfAxles() {
        Truck truck = new Truck("TRK004", 2);
        assertEquals(2, truck.getNumAxles());
    }
}