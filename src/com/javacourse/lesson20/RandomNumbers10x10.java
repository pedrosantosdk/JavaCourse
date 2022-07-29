package com.javacourse.lesson20;

import java.util.Random;

public class RandomNumbers10x10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] number = new int[10][10];
        int max = 9;
        int min = 0;
        int column7 = 7;
        int highestRow5 = Integer.MIN_VALUE;
        int lowerRow5 = Integer.MAX_VALUE;
        int highestColumn7 = Integer.MIN_VALUE;
        int lowerColumn7 = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                number[i][j] = rand.nextInt(max-min) + min;
            }
        }

        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < number[5].length; i++){
            if (highestRow5 < number[5][i]){
                highestRow5 = number[5][i];
            }
            if (lowerRow5 > number[5][i]) {
                lowerRow5 = number[5][i];
            }
        }

        for (int i = 0; i < number.length; i++){
            if (highestColumn7 < number[i][7]){
                highestColumn7 = number[i][7];
            }
            if (lowerColumn7 > number[i][7]){
              lowerColumn7 = number[i][7];
            }
        }


        System.out.println();
        System.out.println(highestRow5);
        System.out.println(lowerRow5);
        System.out.println();
        System.out.println(highestColumn7);
        System.out.println(lowerColumn7);

    }
}
