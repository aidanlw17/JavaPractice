package com.Aidan;

import com.Aidan.Car;

/**
 * Created by Aidan on 2017-07-12.
 */
public class Odyssey extends Car {

    private String modelLevel;
    private Boolean isChrome;

    public Odyssey(String modelLevel, Boolean isChrome, String licensePlate, int kilometres, String ownerName) {
        super("Honda", "com.Aidan.Odyssey", licensePlate, false, kilometres, 210, ownerName, 8, 8000, 8);
        this.modelLevel = modelLevel;
        this.isChrome = isChrome;
    }

    public void accelerate(double rate) {

        double newVelocity = getVelocity() + rate;

        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVelocity > 0) {
            move(newVelocity, getDirection());
        }

    }


    @Override
    public void stop() {
        changeGear(1);
        super.stop();
    }

    public String getModelLevel() {
        return modelLevel;
    }

    public Boolean getChrome() {
        return isChrome;
    }
}
