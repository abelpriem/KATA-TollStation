package org.factoriaf5.models;

public class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public int getTollAmount() {
        return 50;
    }
}