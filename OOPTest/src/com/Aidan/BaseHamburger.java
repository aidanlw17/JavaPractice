package com.Aidan;

import com.sun.xml.internal.rngom.parse.host.Base;

import java.util.Scanner;

/**
 * Created by Aidan on 2017-07-16.
 */
public class BaseHamburger {

    private String breadRoll;
    private String meat;
    private Boolean onions;
    private Boolean pickles;
    private Boolean lettuce;
    private Boolean tomato;
    private double baseCost;

    public BaseHamburger(String breadRoll, String meat, double baseCost) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.baseCost = baseCost;
    }



    public double calculatePrice(double baseCost, int numAdditionals) {

        
        return baseCost + (numAdditionals * 0.50);
    }

}
