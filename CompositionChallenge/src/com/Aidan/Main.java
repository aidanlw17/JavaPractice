package com.Aidan;

public class Main {

    public static void main(String[] args) {

        // Create a single room of a house using composition
        // Think about the things that should be included in the room.
        // Maybe physical parts of the room but furniture as well
        // Add at least one method to access an object via a getter and
        // then that object's public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video

        Sink theSink = new Sink("Stainless steel", 36, 100, 32);

        Fridge theFridge = new Fridge("Stainless steel", true, 200);

        Oven theOven = new Oven("Stainless steel", 450, "Electric");

        Kitchen aidansKitchen = new Kitchen(theSink, theFridge, theOven, new Dimensions(10,20,22),
                new Dimensions(10,18,22), new Dimensions(10,20,22),
                new Dimensions(10,18,22));

        aidansKitchen.cleanUp();
        theSink.changeTemp(100);
        aidansKitchen.getTheSink().changeTemp(122);

    }
}
