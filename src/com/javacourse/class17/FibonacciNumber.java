package com.javacourse.class17;

public class FibonacciNumber {
    public static void main(String[] args) {
        int numberMax= 16, firstTerm = 0, secondTerm = 1;

       // Fibonacci using do-while loop.
        /*do {
            System.out.println(firstTerm + "");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        } while (firstTerm <=610);
    }

        // Fibonacci using while loop.
        while (firstTerm <= 610) {
            System.out.println(firstTerm + "");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }*/

        // Fibonacci using for loop.
        for(int i =1; i <= numberMax; ++i){
            System.out.println(firstTerm + "");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
