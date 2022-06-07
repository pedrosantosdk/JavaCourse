package com.javacourse.lesson13;

public class LogicalOperators {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

        boolean result1 = (value1 == 1) && (value2 == 2);
        System.out.println("value1 is 1 AND value2 is 2 - Result: " + result1);

        boolean result2 = (value1 == 1) || (value2 == 2);
        System.out.println("value1 is 1 OR value2 is 2 - Result: " + result2);

        boolean verdade = true;
        boolean falso = false;

        // Logical and
        System.out.println(verdade && falso);

        // Logical or
        System.out.println(verdade || falso);

        //Bitwise exclusive OR
        System.out.println(verdade ^ falso);

        // Logical not
        System.out.println(!verdade && falso);
    }
}
