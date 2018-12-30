package com.Aidan;

public class Main {

    public static void main(String[] args) {
//	    int value = 3;
//	    if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 6;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was one");
                break;

            case 2:
                System.out.println("Value was two");
                break;

            case 3:case 4:case 5:
                System.out.println("Was 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not one or two or three or four or five");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // add a default which displays a message saying not found

        char charVariable = 'A';

	    switch (charVariable) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println(charVariable + " was the character");
                break;

            default:
                System.out.println("A proper message was not found");
                break;
        }

        String month = "JuNe";
	    switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
