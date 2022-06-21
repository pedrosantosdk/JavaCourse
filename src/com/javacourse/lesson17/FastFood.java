package com.javacourse.lesson17;

import java.util.Scanner;

public class FastFood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean end = true;
        int code, amount;
        int total = 0;
        StringBuilder output = new StringBuilder();

        System.out.println("""
                \tSpecification      Code      Price
                \tBigMac             100       $16.00
                \tMcChicken          101       $6.48
                \tCheeseburger       102       $7.16
                \tHamburger          103       $1.55
                \tMcDouble           104       $5.35
                \tCoca-Cola          105       $1.76
                """);

        do{
        System.out.println("Enter the order code:    (Enter 0 to exit)");
        code = input.nextInt();

        System.out.println("Enter the purchase amount:    (Enter 0 to exit)");
        amount = input.nextInt();

        if(code == 0 && amount == 0){
            end = false;
            output.append("Total payable = $ ").append(total);
        } else {
            if (code == 100) {
                output.append("BigMac -> $ 16.00 * ").append(amount);
                output.append(" = $ ").append(16 * amount).append("\n");
                total += 16 * amount;
            } else if (code == 101) {
                output.append("McChicken -> $ 6.48 * ").append(amount);
                output.append(" = $ ").append(6.48 * amount).append("\n");
                total += 6.48 * amount;
            } else if (code == 102) {
                output.append("Cheeseburger -> $ 7.16 * ").append(amount);
                output.append(" = $ ").append(7.16 * amount).append("\n");
                total += 7.16 * amount;
            } else if (code == 103) {
                output.append("Hamburger -> $ 1.55 * ").append(amount);
                output.append(" = $ ").append(1.55 * amount).append("\n");
                total += 1.55 * amount;
            } else if (code == 104) {
                output.append("McDouble -> $ 5.35 * ").append(amount);
                output.append(" = $ ").append(5.35 * amount).append("\n");
                total += 5.35 * amount;
            } else if (code == 105) {
                output.append("Coca-cola -> $ 1.76 * ").append(amount);
                output.append(" = $ ").append(1.76 * amount).append("\n");
                total += 1.76 * amount;
            }
        }
        } while(end);

        System.out.println(output);
    }
}
