package com.Aidan;

/**
 * Created by Aidan on 2017-07-13.
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private Boolean duplexPrinter;

    public Printer(int tonerLevel, Boolean duplexPrinter) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int numberPages) {
        if(this.duplexPrinter) {
            this.pagesPrinted += numberPages / 2;
            System.out.println("Number of pages printed by duplex is " + this.pagesPrinted);
        } else {
            this.pagesPrinted += numberPages;
            System.out.println("Number of pages printed is " + this.pagesPrinted);
        }
        return this.pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Boolean getDuplexPrinter() {
        return duplexPrinter;
    }

}
