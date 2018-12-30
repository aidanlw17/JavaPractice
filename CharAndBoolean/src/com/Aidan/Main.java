package com.Aidan;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
	    char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);
        // use unicode-table.com to find unicode characters

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol
        // 2. Create a variable of type char and assign it the unicode value for that symbol
        // 3. Display it on screen

        char regSymbol = '\u00AE';
        System.out.println("The registered symbol is " + regSymbol);
    }
}
