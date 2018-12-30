package com.Aidan;

/**
 * Created by Aidan on 2017-07-12.
 */
public class Fridge {

    private String material;
    private Boolean hasWaterFilter;
    private int size;

    public Fridge(String material, Boolean hasWaterFilter, int size) {
        this.material = material;
        this.hasWaterFilter = hasWaterFilter;
        this.size = size;
    }

    public void openFridge() {
        System.out.println("Fridge is open");
    }

    public void closeFridge() {
        System.out.println("Fridge is closing in 3 2 1.");
    }

    public void getFood(String food) {
        openFridge();
        System.out.println("What kind of food would you like?");
        System.out.println("Getting you some " + food);
        closeFridge();
    }

    public void clean() {
        System.out.println("Unwanted food has been removed from the fridge");
    }

    public String getMaterial() {
        return material;
    }

    public Boolean getHasWaterFilter() {
        return hasWaterFilter;
    }

    public int getSize() {
        return size;
    }
}
