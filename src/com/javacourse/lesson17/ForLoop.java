package com.javacourse.lesson17;

public class ForLoop {

    public static void main(String[] args) {

        for (int i=0; i < 5; i++) {
            System.out.println("i has the value of: " + i);
            }

        for (int i=5; i > 0; i--){
            System.out.println("i has the value of: " + i);
        }

        for (int i =0, j = 10; i < j; i++, j--){
            System.out.println("i= " + i + " j= " + j);
        }

        int count =0;
        for ( ; count < 10;){
            System.out.println("i has the value of:" + count);
            count += 2;
        }

        int sum = 0;
        for (int i =1; i < 5; sum += i++)
            System.out.println("Sum has the value of: " + sum);
    }
}

