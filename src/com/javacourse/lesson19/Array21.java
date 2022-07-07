package com.javacourse.lesson19;

public class Array21 {
    public static void main(String[] args) {

        int[] arrayA = new int[10];
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arrayA.length; i++){
            arrayA[i] = (int)Math.round(Math.random() * 1);
            if (arrayA[i] == 0){
                zeroCount++;
            } else if (arrayA[i] == 1){
                oneCount++;
            }
            System.out.println(arrayA[i]);
        }

        System.out.println("Quantity of numbers zero: " + zeroCount);
        System.out.println("Quantity of numbers one: " + oneCount);
    }
}
