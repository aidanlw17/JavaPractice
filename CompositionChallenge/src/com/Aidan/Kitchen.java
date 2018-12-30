package com.Aidan;

/**
 * Created by Aidan on 2017-07-12.
 */
public class Kitchen {

    private Sink theSink;
    private Fridge theFridge;
    private Oven theOven;
    private String name;
    private Dimensions wallOne;
    private Dimensions wallTwo;
    private Dimensions wallThree;
    private Dimensions wallFour;

    public Kitchen(Sink theSink, Fridge theFridge, Oven theOven, Dimensions wallOne, Dimensions wallTwo, Dimensions wallThree, Dimensions wallFour) {
        this.theSink = theSink;
        this.theFridge = theFridge;
        this.theOven = theOven;
        this.name = "Aidan's Kitchen";
    }

    public void cleanUp() {
        theSink.clean();
        theFridge.clean();
        theOven.clean();
    }

    public void eat(String typeFood) {
        theFridge.getFood(typeFood);
        System.out.println("Retrieved and eating " + typeFood);
    }

    public Sink getTheSink() {
        return this.theSink;
    }

}
