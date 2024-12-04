package org.factoriaf5.models;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private int totalCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        int toll = vehicle.getTollAmount();
        totalCollected += toll;
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getTotalCollected() {
        return totalCollected;
    }

    public void printReport() {
        System.out.println("Toll Station: " + name + ", " + city);
        System.out.println("Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.getLicensePlate() + " (Toll: $" + vehicle.getTollAmount() + ")");
        }
        System.out.println("Total Collected: $" + totalCollected);
    }
}
