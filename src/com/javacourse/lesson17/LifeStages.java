package com.javacourse.lesson17;

import java.util.Scanner;

public class LifeStages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = 0;

        System.out.println("Enter the number of people in the classroom.");
        double count = input.nextInt();

        for(int i = 0; i < count; i++){
            System.out.println("Enter the age: ");
            age += input.nextInt();
        }
        double average = age / count;

        if(average >= 0 && average <25){
            System.out.printf("The average age of the class is %.2f years the class is made up of young people.",average);
        } else if(average >= 26 && average < 60){
            System.out.printf("The average age of the class is %.2f years the class is made up of adult people.", average);
        } else if(average > 60){
            System.out.printf("The average age of the class is %.2f years the class is made up of elderly people.", average);
        } else {
            System.out.println("Error, the number of people cannot be negative.");
        }
    }
}
