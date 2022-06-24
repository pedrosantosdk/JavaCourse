package com.javacourse.lesson19;

public class Arrays {
    public static void main(String[] args) {

        // Initialization of variables.
        double dailyTemp001 =  31.3;
        double dailyTemp002 = 32;
        double dailyTemp003 = 33.7;
        double dailyTemp004 = 34;
        double dailyTemp005 = 33.1;

        // Storing the variables in an array.
        double[] temperatures = new double[365];
        temperatures[0] = dailyTemp001;
        temperatures[1] = dailyTemp002;
        temperatures[2] = dailyTemp003;
        temperatures[3] = dailyTemp004;
        temperatures[4] = dailyTemp005;

        // Shows the value inside the array.
        System.out.println("The day 3 temperature value is: " + temperatures[2]);

        // Shows the size of the array.
        System.out.println("What is the size of the array: " + temperatures.length);

        // Shows the memory address where the array values are.
        System.out.println("Memory address: " + temperatures);

        // Shows all values inside the array:
        for(int i = 0; i < temperatures.length; i++){
            System.out.println("The temperature value of day " + (i+1) + " was: " + temperatures[i]);
        }

       /* for(double temp : temperatures){
            System.out.println(temp);
        }*/

    }
}
