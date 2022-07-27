package com.javacourse.lesson20;

import  java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand  = new Random();
        int[][] number = new int[4][4];
        int low = 0;
        int high = 0;
        int min = 0;
        int max = 9;

        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                number[i][j] = rand.nextInt(max-min) + min;
                if (low > number[i][j]){
                    low = number[i][j];
                }
                if (number[i][j] > high){
                    high = number[i][j];
                }
            }
        }

        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The largest number of the two numbers is " + Math.max(low, high));
        System.out.println("The smallest number of the two numbers is " + Math.min(low, high));
    }
}
