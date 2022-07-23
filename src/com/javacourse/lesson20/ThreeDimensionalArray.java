package com.javacourse.lesson20;

public class ThreeDimensionalArray {
    public static void main(String[] args) {

        int[][][] threeDimensionalArray = new int[3][3][3];

        // 3d Array
        for (int i = 0; i < threeDimensionalArray.length; i++){
            for (int j = 0; j < threeDimensionalArray[i].length; j++){
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++){
                    System.out.println("i = " + i + " j = " + j + " k = " + k);
                    threeDimensionalArray[i][j][k] = i + j + k;
                }
            }
        }

        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < threeDimensionalArray.length; i++){
            for (int j = 0; j < threeDimensionalArray[i].length; j++){
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++){
                   sum += threeDimensionalArray[i][j][k];
                   if (threeDimensionalArray[i][j][k] % 2 == 0){
                       evenSum += threeDimensionalArray[i][j][k];
                   } else {
                       oddSum += threeDimensionalArray[i][j][k];
                   }
                }
            }
        }

        System.out.println("Total sum = " + sum);
        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);

    }
}
