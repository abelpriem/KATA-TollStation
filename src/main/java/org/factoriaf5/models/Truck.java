package org.factoriaf5.models;

public class Truck extends Vehicle {
    private int numAxles;

    public Truck(String licensePlate, int numAxles) {
        super(licensePlate);
        this.numAxles = numAxles;
    }

    public int getNumAxles() {
        return numAxles;
    }

    @Override
    public int getTollAmount() {
        return 50 * numAxles;
    }
}
