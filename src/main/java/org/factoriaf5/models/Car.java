package org.factoriaf5.models;

public class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public int getTollAmount() {
        return 100;
    }
}
