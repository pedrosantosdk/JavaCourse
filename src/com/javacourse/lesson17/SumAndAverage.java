package com.javacourse.lesson17;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double average;
        int value;
        int sum = 0;
        String number;

        // Ask the user for five numbers and print the sum and the average.
        for (int i = 1; i <= 5; i++){

            number = JOptionPane.showInputDialog("Enter the number:");

            value = Integer.parseInt(number);

            sum += value;
        }

        average = sum / 5.0;
        JOptionPane.showMessageDialog(null, "The sum of the five numbers is: " + sum);
        JOptionPane.showMessageDialog(null, "The average of the five numbers is: " + average);

    }
}


