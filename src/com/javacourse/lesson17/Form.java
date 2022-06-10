package com.javacourse.lesson17;

import java.util.Scanner;

public class Form {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean validInfo = false;
        String name, gender;
        int age;
        double salary;

        // Collects information from the form, if any information is invalid the program will report and ask to try again.
        System.out.println("Fill the form:");
        do {
            System.out.println("Name:");
            name = input.next();
            if (name.matches("[a-zA-Z]+") && name.length() >= 3) {
                validInfo = true;
            } else {
                System.out.println("ERROR\n" +
                        "The name must have only letters and more than 3 characters.");
            }
        } while(!validInfo);

        validInfo = false;
        do {
            System.out.println("Age:");
            age = input.nextInt();
            if (age > 0 && age < 100) {
                validInfo = true;
            } else {
                System.out.println("ERROR\n" +
                        "The age must be between 0 and 100.");            }
        } while (!validInfo);

        validInfo = false;
        do {
                System.out.println("Salary");
                salary = input.nextDouble();
                if(salary > 0){
                    validInfo = true;
                } else {
                    System.out.println("ERROR\n" +
                            "Salary must be greater than zero.");
                }
            } while(!validInfo);

        validInfo = false;
        do {
                System.out.println("Gender");
                gender = input.next();
                if(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")){
                    validInfo = true;
                } else {
                    System.out.println("ERROR\n" +
                            "The gender must be male or female.");
                }
            } while (!validInfo);


        // Shows the information collected and confirms that the completion was successful.
        System.out.println("The following information was collected:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Salary: $%.2f\n" ,salary);
        System.out.println("Gender: " + gender);
        System.out.println("Your response has been recorded.");

    }
}
