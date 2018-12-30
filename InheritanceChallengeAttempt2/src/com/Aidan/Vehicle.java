package com.Aidan;

/**
 * Created by Aidan on 2017-07-11.
 */
public class Vehicle {

    private String ownerName;
    private String direction;
    private int size;
    private int mass;
    private int capacity;
    private double velocity;

    public Vehicle(String ownerName, int size, int mass, int capacity) {
        this.ownerName = ownerName;
        this.direction = "0";
        this.size = size;
        this.mass = mass;
        this.capacity = capacity;
        this.velocity = 0;
    }

    public void move(double velocity, String direction) {
        this.velocity = velocity;
        this.direction = direction;
        System.out.println("The vehicle is moving " + this.direction + " at " + this.velocity + " metres per second");
    }

    public void changeDirection(String newDirection) {
        this.direction = newDirection;
        System.out.println("Vehicle.changeDirection() The vehicle is now moving " + newDirection);
    }

    public double increaseSpeed() {
        velocity += 5;
        return velocity;
    }

    public double decreaseSpeed() {
        if(velocity > 0) {
            velocity -= 5;
            return velocity;
        } else {
            System.out.println("Vehicle is not currently moving");
            return velocity;
        }
    }

    public void stop() {
        this.velocity = 0;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getDirection() {
        return direction;
    }

    public int getSize() {
        return size;
    }

    public int getMass() {
        return mass;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getVelocity() {
        return velocity;
    }
}
