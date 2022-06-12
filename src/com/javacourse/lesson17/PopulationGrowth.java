package com.javacourse.lesson17;

import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        // User input
        System.out.println("Calculate how long countryA will overtake the population of countryB.");
        System.out.println("Enter the population of CountryA:");
        int countryA = input.nextInt();
        System.out.println("Enter the population of CountryB:");
        int countryB = input.nextInt();
        System.out.println("Enter the CountryA growth rate:");
        double rateA = input.nextDouble();
        System.out.println("Enter the CountryB growth rate:");
        double rateB = input.nextDouble();

        // While the user puts wrong data.
        while(countryA > countryB && rateB >= rateA){
            System.out.println("""
                    \tERROR
                    \t"The CountryA population must be smaller than that of the CountryB and the growth rate of the CountryA must be greater than the CountryB."
                    \t"TRY AGAIN:
                    """
                    );
            System.out.println("Enter the population of CountryA:");
            countryA = input.nextInt();
            System.out.println("Enter the population of CountryB:");
            countryB = input.nextInt();
            System.out.println("Enter the CountryA growth rate:");
            rateA = input.nextDouble();
            System.out.println("Enter the CountryB growth rate:");
            rateB = input.nextDouble();
        }

        // If the data is correct, perform the calculation.
        while(countryA < countryB && rateA > rateB) {
            countryA += (countryA / 100) * rateA;
            countryB += (countryB / 100) * rateB;
            count++;
        }
        System.out.printf("For countryA to exceed the population of countryB it will take %d years.",count);
        System.out.printf("\nIn %d years the population of the countries will be:", count);
        System.out.printf("\nCountryA will be: %d peoples.",countryA);
        System.out.printf("\nCountryB will be: %d peoples.", countryB);
    }
}