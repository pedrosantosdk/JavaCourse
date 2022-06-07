package com.javacourse.lesson15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the day of the week number (1-7): ");
        int dayWeek = scan.nextInt();

        switch (dayWeek) {
            case 1: System.out.println("Sunday."); break;
            case 2: System.out.println("Monday."); break;
            case 3: System.out.println("Tuesday."); break;
            case 4: System.out.println("Wednesday."); break;
            case 5: System.out.println("Thursday."); break;
            case 6: System.out.println("Friday."); break;
            case 7: System.out.println("Saturday."); break;
            default: System.out.println("Invalid number");
        }

        System.out.println("Enter the day of the week number (1-7): ");
        int businessDay = scan.nextInt();

        switch (businessDay) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Business day."); break;
            case 1:
            case 7: System.out.println("Weekend."); break;
            default: System.out.println("Invalid number");
        }
    }
}
