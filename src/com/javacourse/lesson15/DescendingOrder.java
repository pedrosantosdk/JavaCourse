package com.javacourse.lesson15;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scan.nextInt();

        // Check the numbers, and sort them in descending order.
        if(num1 > num2 && num1 >num3 && num2 > num3){
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else if(num1 > num2 && num1 > num3 && num3 > num2){
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        } else if(num2 > num1 && num2 > num3 && num3 > num1){
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        } else if(num2 > num1 && num2 > num3 && num1 > num3){
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        } else if(num3 > num1 && num3 > num2 && num2>num1){
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        } else {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
