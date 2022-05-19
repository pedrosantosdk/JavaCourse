package com.javacourse.class16;

public class WhileLoop {
    public static void main(String[] args) {

        // Declares the initial value and the maximum value.
        int i = 1;  // count
        int max = 10;
        System.out.println("Counting to " + max);

        // The while loop loops through a block of code as long as a specified condition is true:
        while (i <= max) {
            System.out.println("i value = " + i);
            i++;
        }
        System.out.println(i);

        // The do/while loop is a variant of the while loop.
        // This loop will execute the code block once, before checking if the condition is true,
        // then it will repeat the loop as long as the condition is true.
        do {
            i++;
            System.out.println("i value = " + i);
        } while (i < 15);
        System.out.println(i);
    }
}
