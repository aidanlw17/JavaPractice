package com.Aidan;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8. Has to be literal - fixed number
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        //Challenge:
        // 1. Create a byte variable and set it to any valid byte number
        // 2. Create a short variable and set it to any valid short number
        // 3. Create an int variable and set it to any valid int number
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte challengeByte = 98;
        short challengeShort = 6273;
        int challengeInt = -499382;

        long challengeLong = (50000L + 10L * (challengeByte + challengeShort + challengeInt));
        System.out.println("The solution to the challenge = " + challengeLong);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);


















    }
}
