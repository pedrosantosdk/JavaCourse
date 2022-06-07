package com.javacourse.lesson15;

import java.util.Scanner;

public class GenderVerification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Enter the first letter of your gender: ");
        System.out.println("(M)ale, (F)emale, (O)ther.");
        String gender;
        gender = scan.next();

        // Checks the genre letter and prints:
        switch(gender){
            case "M":
            case "m": System.out.println("M - Male."); break;
            case "F":
            case "f": System.out.println("F - Female."); break;
            case "O":
            case "o": System.out.println("Other.");
            default: System.out.println("Invalid gender.");
        }
    }
}
