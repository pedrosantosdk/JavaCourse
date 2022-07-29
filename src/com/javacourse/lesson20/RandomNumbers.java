package com.javacourse.lesson20;

import  java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand  = new Random();
        int[][] number = new int[4][4];
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int min = 0;
        int max = 9;
        int rowHigh = 0;
        int columnHigh = 0;
        int rowLow = 0;
        int columnLow = 0;

        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                number[i][j] = rand.nextInt(max-min) + min;
                if (low > number[i][j]){
                    low = number[i][j];
                    rowLow = i;
                    columnLow = j;
                }
                if (number[i][j] > high){
                    high = number[i][j];
                    rowHigh = i;
                    columnHigh = j;
                }
            }
        }

        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The higher number is " + Math.max(low, high) + " in row "  + rowHigh + " column " + columnHigh);
        System.out.println("The lower number is " + Math.min(low, high) +  " in row "  + rowLow  + " column " + columnLow);

    }
}
