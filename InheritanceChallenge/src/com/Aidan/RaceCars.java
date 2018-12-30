package com.Aidan;

import com.sun.java.swing.plaf.windows.resources.windows;

/**
 * Created by Aidan on 2017-07-10.
 */
public class RaceCars extends Car {

    private int topSpeed;
    private int turnRadius;
    private int handling;

    public RaceCars(int wheels, int doors, String engine, int windows, String colour, String model, int size, int weight, int passengerSpaces, String material, int topSpeed, int turnRadius, int handling) {
        super(wheels, doors, engine, windows, colour, model, size, weight, passengerSpaces, material);
        this.topSpeed = topSpeed;
        this.turnRadius = turnRadius;
        this.handling = handling;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getTurnRadius() {
        return turnRadius;
    }

    public int getHandling() {
        return handling;
    }
}
