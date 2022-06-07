package com.javacourse.lesson15;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.println("Enter a letter: ");
        String letter = input.next();

        // Read the letter and check if it is a vowel or a consonant.
        if (letter.length() == 1) {
            if (letter.equalsIgnoreCase("A")) {
                System.out.printf("The letter '%s' is a vowel.", letter);
            } else if (letter.equalsIgnoreCase("E")) {
                System.out.printf("The letter '%s' is a vowel.", letter);
            } else if (letter.equalsIgnoreCase("I")) {
                System.out.printf("The letter '%s' is a vowel.", letter);
            } else if (letter.equalsIgnoreCase("O")) {
                System.out.printf("The letter '%s' is a vowel.", letter);
            } else if (letter.equalsIgnoreCase("U")) {
                System.out.printf("The letter '%s' is a vowel.", letter);
            } else {
                System.out.printf("The letter '%s' is a consonant.", letter);
            }
        } else {
            System.out.println("Invalid letter.");
        }
    }
}