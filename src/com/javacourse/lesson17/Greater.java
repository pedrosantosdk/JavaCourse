package com.javacourse.lesson17;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Greater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int greaterN = 0;
        int value;
        String number;

        // Shows the greater number among those entered.
        for (int i = 1; i <= 5; i++){
            number = JOptionPane.showInputDialog("Enter the number:");

            value = Integer.parseInt(number);

            if(value > greaterN){
                greaterN = value;
            }
            JOptionPane.showMessageDialog(null, "The greater number entered was: " + greaterN);
        }
    }
}
