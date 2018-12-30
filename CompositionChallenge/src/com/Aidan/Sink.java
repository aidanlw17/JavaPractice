package com.Aidan;

/**
 * Created by Aidan on 2017-07-12.
 */
public class Sink {

    private int numberTubs;
    private String typeOfMetal;
    private int waterTemp;
    private int waterPressure;
    private int dishes;

    public Sink(String typeOfMetal, int waterTemp, int waterPressure, int dishes) {
        this.numberTubs = 2;
        this.typeOfMetal = typeOfMetal;
        this.waterTemp = waterTemp;
        this.waterPressure = waterPressure;
        this.dishes = dishes;
    }

    public void turnOnSink(int waterTemp) {
        System.out.println("Water is flowing at " + waterTemp + " degrees");
    }

    public void changeTemp(int tempChange) {
        waterTemp += tempChange;
        System.out.println("New temperature is " + waterTemp);
    }

    public void clean() {
        System.out.println("The sink has been cleaned with dish soap");
    }

    public int getNumberTubs() {
        return numberTubs;
    }

    public String getTypeOfMetal() {
        return typeOfMetal;
    }

    public int getWaterTemp() {
        return waterTemp;
    }

    public int getWaterPressure() {
        return waterPressure;
    }

    public int dishes() {
        return dishes;
    }

}
