package org.factoriaf5.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MotorcycleTest {
    @Test
    public void testMotorcycleTollAmount() {
        Motorcycle motorcycle = new Motorcycle("MOTO123");
        assertEquals(50, motorcycle.getTollAmount());
    }

    @Test
    public void testMotorcycleLicensePlate() {
        Motorcycle motorcycle = new Motorcycle("MOTO123");
        assertEquals("MOTO123", motorcycle.getLicensePlate());
    }
}
