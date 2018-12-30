package com.Aidan;

/**
 * Created by Aidan on 2017-07-10.
 */
public class Vehicle {

    private int size;
    private int weight;
    private int passengerSpaces;
    private String material;

    public Vehicle(int size, int weight, int passengerSpaces, String material) {
        this.size = size;
        this.weight = weight;
        this.passengerSpaces = passengerSpaces;
        this.material = material;
    }

    public void move(int speed) {

    }

    public void stop(int speed) {

    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getPassengerSpaces() {
        return passengerSpaces;
    }

    public String getMaterial() {
        return material;
    }
}
