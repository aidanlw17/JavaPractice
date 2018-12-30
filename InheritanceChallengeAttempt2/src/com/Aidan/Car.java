package com.Aidan;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/**
 * Created by Aidan on 2017-07-11.
 */
public class Car extends Vehicle {

    private String brand;
    private String model;
    private String licensePlate;
    private Boolean isManual;
    private int gear;
    private int kilometres;
    private int topSpeed;


    public Car(String brand, String model, String licensePlate, Boolean isManual, int kilometres, int topSpeed, String ownerName, int size, int mass, int capacity) {
        super(ownerName, size, mass, capacity);
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.isManual = isManual;
        this.kilometres = kilometres;
        this.topSpeed = topSpeed;
        this.gear = 1;
    }

    public int increaseGear() {
        if(isManual) {
            gear += 1;
            System.out.println("New gear is " + gear);
            return gear;
        } else {
            System.out.println("com.Aidan.Car is automatic, unable to force gear shift. Gear is still " + gear);
            return gear;
        }
    }

    public int decreaseGear() {
        if(isManual) {
            gear -= 1;
            System.out.println("New gear is " + gear);
            return gear;
        } else {
            System.out.println("com.Aidan.Car is automatic, unable to force gear shift. Gear is still " + gear);
            return gear;
        }
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public double increaseSpeed() {
        increaseGear();
        double newSpeed = super.increaseSpeed();
        System.out.println("The car is now moving at " + newSpeed + " and is in gear " + gear);
        return newSpeed;
    }

    @Override
    public double decreaseSpeed() {
        decreaseGear();
        double newSpeed = super.decreaseSpeed();
        System.out.println("The car is now moving at " + newSpeed + " and is in gear " + gear);
        return newSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Boolean getManual() {
        return isManual;
    }

    public int getGear() {
        return  gear;
    }

    public int getKilometres() {
        return kilometres;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
