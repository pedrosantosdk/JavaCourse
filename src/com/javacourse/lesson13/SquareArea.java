package com.javacourse.lesson13;

import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {
        // Ask for length of the side.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        double side = scan.nextDouble();

        // calculate the square area.
        double area = side * side;

        // Fold the area.
        double fold = area * 2;
        System.out.printf("Twice the area of %.2f is %.2f.", side ,fold);
    }
}