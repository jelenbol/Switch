package com.company;

import java.util.Scanner;

public class DayType {
    public static void main(String[] args) {

        Scanner DayNumber = new Scanner(System.in);

        {
            System.out.println("Please enter day number:");
        }

        int day = DayNumber.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day");
                break;

            case 6:
            case 7:
                System.out.println("It is holiday");
                break;

            default:
                System.out.println("Not valid");
                break;

        }


    }
}
