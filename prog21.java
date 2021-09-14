/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of the month. ");
        int month = in.nextInt();

        String monthNumber;
        switch (month) {
            case 1: monthNumber = "January";
                    break;
            case 2: monthNumber = "February";
                    break;
            case 3: monthNumber = "March";
                break;
            case 4: monthNumber = "April";
                break;
            case 5: monthNumber = "May";
                break;
            case 6: monthNumber = "June";
                break;
            case 7: monthNumber = "July";
                break;
            case 8: monthNumber = "August";
                break;
            case 9: monthNumber = "September";
                break;
            case 10: monthNumber = "October";
                break;
            case 11: monthNumber = "November";
                break;
            case 12: monthNumber = "December";
                break;
            default:
               monthNumber = "not valid.";
               break;
        }

        System.out.println("The name of the month is " + monthNumber);
    }
}
