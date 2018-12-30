package com.Aidan;

/**
 * Created by Aidan on 2017-07-06.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unkownn";
        }
    }

    public String getModel() {
        return this.model;
    }
}
