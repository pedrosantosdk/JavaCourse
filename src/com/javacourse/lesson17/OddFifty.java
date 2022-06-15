package com.javacourse.lesson17;

public class OddFifty {
    public static void main(String[] args) {

        // Shows the odd numbers from 1 to 50.
        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
