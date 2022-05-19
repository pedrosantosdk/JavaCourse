package com.javacourse.class13;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // Sum 1+2
        int result = 1 + 2;
        System.out.println(result);
        // 3

        // Subtract one from the result.
        result = result - 1;
        System.out.println(result);
        // 2

        // Multiply the result by 2.
        result = result * 2;
        System.out.println(result);
        //4

        // Divide the result by 2.
        result = result / 2;
        System.out.println(result);
        // 2

        // Add result plus 8.
        result = result + 8;
        System.out.println(result);
        //10

        // See the rest of the division by 7.
        result = result % 7;
        System.out.println(result);
        // 3

        // String concatenation.
        String firstString = "This is ";
        String secondString = "a concatenated String!";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);

        // Add one to the result.
        result = result + 1;
        System.out.println(result);
        // 4

        // Add one to the result.
        result++;
        System.out.println(result);
        // 5

        // Print the result first, then add one.
        System.out.println(result++);
        // 5

        // Add one first, then print the result.
        System.out.println(++result);
        // 7

        // Subtract one
        result--;
        System.out.println(result);
        // 6

        // Print the result first, then subtract one.
        System.out.println(result--);
        // 6

        // Subtract one first, then print the result.
        System.out.println(--result);
        // 4
    }
}
