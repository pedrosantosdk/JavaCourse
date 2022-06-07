package com.javacourse.lesson15;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day of the week number: ");
        int day = input.nextInt();

        switch(day){
            case 1:
                System.out.println("1- Sunday.");
                break;
            case 2:
                System.out.println("2- Monday.");
                break;
            case 3:
                System.out.println("3- Tuesday.");
                break;
            case 4:
                System.out.println("4- Wednesday.");
                break;
            case 5:
                System.out.println("5- Thursday.");
                break;
            case 6:
                System.out.println("6- Friday.");
                break;
            case 7:
                System.out.println("7- Saturday.");
                break;
            default:
                System.out.println("Invalid number.");
        }
    }
}
