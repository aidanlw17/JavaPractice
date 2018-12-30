package com.Aidan;

class Car {

    private Boolean hasEngine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.hasEngine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void brake() {
        System.out.println("Brakes applied. Car is slowing.");
    }

    public Boolean getHasEngine() {
        return hasEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}

class Odyssey extends Car {

    public Odyssey() {
        super(6, "Odyssey");
    }

    @Override
    public void startEngine() {
        System.out.println("The Odyssey is doing everything it can to start up");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " --> Reaching a top speed of 140" + "\n");
    }

    @Override
    public void brake() {
        System.out.println("Scrreeeech. The " + getName() + " is thrown to an abrupt stop");
    }
}

class Ferrari extends Car {

    public Ferrari() {
        super(12, "Ferrari");
    }

    @Override
    public void startEngine() {
        System.out.println("Purrrrrrr. The " + getName() + " is brought to life");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " --> ZOOOOOM! Reaching crazy top speeds" + "\n");
    }

    @Override
    public void brake() {
        System.out.println("The " + getName() + " is pulled to a quick and reactive stop");
    }
}

class Maybach extends Car {

    public Maybach() {
        super(8, "Maybach mcChill");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started. The driver would like to know where to take you.");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " --> The pedal is pushed to the floor but not much happens. The Maybach Cruuuuises" + "\n");
    }

    @Override
    public void brake() {
        System.out.println("The " + getName() + " rolls to a comfortable stop");
    }
}

public class Main {

    public static void main(String[] args) {
        // We are going back to the car analogy.
        // Create a basic class called Car.
        // It should have a few fields that would be appropriate for a generic Car class:
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and name should be passed as parameters.
        //
        // Create appropriate getters.
        //
        // Create some methods like startEngine, accelerate, and brake.
        //
        // Show a message for each in the base class.
        // Now create three sub classes for your favourite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // Put all java classes in one file (this one).

        Maybach maybach = new Maybach();
        maybach.accelerate();

        Ferrari ferrari = new Ferrari();
        ferrari.accelerate();

        Odyssey odyssey = new Odyssey();
        odyssey.accelerate();
    }
}
