package com.javacourse.lesson17;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        double sum = 0;

        System.out.println("Enter the amount of temperatures.");
        double amount = input.nextDouble();

        for (int i = 1; i <= amount; i++) {
            System.out.printf("Enter temperature %d: ", i);
            double temperature = input.nextDouble();
            sum += temperature;
            if(temperature > highest){
                highest = temperature;
            }
            if(temperature < lowest){
                lowest = temperature;
            }
        }
        System.out.println("The highest temperature was: " + highest + "°C");
        System.out.println("The lowest temperature was: " + lowest + "°C");
        System.out.println("The average temperature was: " + sum/amount + "°C");
    }
}