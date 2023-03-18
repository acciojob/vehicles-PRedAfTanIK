package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;

    //just in case
    public Boat() {
        this.name = "Bogus name";
        this.capacity = 100;
    }

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
