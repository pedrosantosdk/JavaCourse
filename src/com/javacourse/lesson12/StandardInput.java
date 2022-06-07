package com.javacourse.lesson12;

import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        // Create a Scanner object.
        Scanner scan = new Scanner(System.in);

		/*System.out.println("Enter your full name:");
		String fullName = scan.nextLine();
		System.out.println("Your full name is: " + fullName);

		System.out.println("Enter your first name: ");
		String firstName = scan.next();
		System.out.println("Your first name is: " + firstName);

		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		System.out.println("Your age is: " + age);

		System.out.println("Enter your height: ");
		double height = scan.nextDouble();
		System.out.println("Your height is: " + height);*/

        // Get user input.
        System.out.println("Enter your first name, age, number of children, height and if you have a pet:");
        String firstName = scan.next();
        int age = scan.nextInt();
        byte numberChildren = scan.nextByte();
        float height = scan.nextFloat();
        boolean pet = scan.nextBoolean();

        //Prints the collected data.
        System.out.println("You entered the following values:: ");
        System.out.println("Name:  " + firstName);
        System.out.println("Age: "+ age);
        System.out.println("Number of children: " + numberChildren);
        System.out.println("Height: "+ height);
        System.out.println("Have pet: " + pet);
    }
}
