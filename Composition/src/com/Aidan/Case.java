package com.Aidan;

/**
 * Created by Aidan on 2017-07-12.
 */
public class Case {

    private String model;
    private String manufacturer;
    private String powerSuppl;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSuppl, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuppl = powerSuppl;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSuppl() {
        return powerSuppl;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
