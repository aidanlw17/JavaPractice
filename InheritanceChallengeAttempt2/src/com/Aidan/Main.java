package com.Aidan;

public class Main {

    public static void main(String[] args) {

        // challenge
        // start with a base class of a vehicle, then create a com.Aidan.Car class that inherits from this base class
        // Finally, create another class, a specific type of car that inherits from the com.Aidan.Car class
        // You should be able to handle steering, changing gears, and moving (speed in other words)
        // You will want to decide where to put the appropriate state and behaviours (fields and methods)
        // As mentioned above, changing gears, increasing/decreasing speed should be included
        // For your specific type of vehicle you will want to add something specific for that type of car

        Odyssey aidansCar = new Odyssey("Touring", true, "ACDD 936", 272000, "Aidan");
        System.out.println(aidansCar.getDirection());
        aidansCar.changeDirection("South");
        aidansCar.accelerate(124);
        System.out.println(aidansCar.getGear());
        aidansCar.decreaseGear();
        aidansCar.decreaseSpeed();
        aidansCar.decreaseSpeed();
        aidansCar.stop();
        System.out.println(aidansCar.getVelocity());
        System.out.println(aidansCar.getGear());
        aidansCar.move(222, "North");

    }
}
