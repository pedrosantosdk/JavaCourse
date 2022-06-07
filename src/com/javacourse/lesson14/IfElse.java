package com.javacourse.lesson14;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        // Check if you are of legal age.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scan.nextInt();

        if (age >= 18){
            System.out.println("You are of legal age.");
        } else {
            System.out.println("You are a minor.");
        }

        //  <= 10 - Cheap.
        // 10 > value < 15 - Ask for discount.
        // 15 >= value 17 - You must look elsewhere.
        // >= 17 - Very expensive.
        System.out.println("Enter the item's price:");
        double value = scan.nextDouble();

        if(value <= 10) {
            System.out.println("It's cheap, you can buy it.");
        } else if (value > 10 && value < 15) {
            System.out.println("You can ask for discount.");
        } else if (value >= 15 && value <= 17) {
            System.out.println("You must look elsewhere.");
        } else {
            System.out.println("It's very expensive, go away.");
        }
    }
}
