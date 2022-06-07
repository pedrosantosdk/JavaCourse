package com.javacourse.lesson13;

public class ShortCircuit {

    public static void main(String[] args) {

        boolean verdade = true;
        boolean falso = false;
        boolean result1 = falso &
                verdade;
        boolean result2 = falso &&
                verdade;

        // Bitwise AND
        System.out.println(result1);

        // Logical AND
        System.out.println(result2);

        // Order of operations.
        int result = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(result);
    }
}
