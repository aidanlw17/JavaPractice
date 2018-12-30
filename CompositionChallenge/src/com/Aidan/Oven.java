package com.Aidan;

/**
 * Created by Aidan on 2017-07-12.
 */
public class Oven {

    private String material;
    private int temperature;
    private String stoveType;

    public Oven(String material, int temperature, String stoveType) {
        this.material = material;
        this.temperature = temperature;
        this.stoveType = stoveType;
    }

    public void useBurner(int burnerTemp) {
        System.out.println("Burner turned on to " + burnerTemp);
    }

    public void useOven(int ovenTemp, int time) {
        System.out.println("Oven cooking at " + ovenTemp + " temp. Will alert at " + time + " minutes.");
    }

    public void clean() {
        System.out.println("Oven grease has been removed from the oven");
    }

    public String getMaterial() {
        return material;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getStoveType() {
        return stoveType;
    }
}
