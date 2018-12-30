package com.Aidan;

/**
 * Created by Aidan on 2017-07-10.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private String engine;
    private int windows;
    private String colour;
    private String model;

    public Car(int wheels, int doors, String engine, int windows, String colour, String model, int size,
                   int weight, int passengerSpaces, String material) {
        super(size, weight, passengerSpaces, material);
    }


    public void accelerate(int speed) {
        super.move(speed);
    }

    public void decelerate(int speed) {
        super.move(speed - 5);
    }

    public void shiftGearsUp() {
        accelerate(10);
    }

    public void shiftGearsDown() {
        decelerate(5);
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public int getWindows() {
        return windows;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }
}
