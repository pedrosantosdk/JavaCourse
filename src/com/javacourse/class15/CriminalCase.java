package com.javacourse.class15;

import java.util.Scanner;

public class CriminalCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Counter of
        int counter = 0;

        // User input.
        System.out.println("Answer the interrogation:");
        System.out.println("Did you call the victim?" +"(y/n)");
        String call = input.next();
        System.out.println("Were you at the crime scene?" + "(y/n)");
        String scene = input.next();
        System.out.println("Did you live near the victim?" + "(y/n)");
        String live = input.next();
        System.out.println("Did you owe the victim money?" + "(y/n)");
        String money = input.next();
        System.out.println("Have you ever worked with the victim?" + "(y/n)");
        String worked = input.next();

        // Count the number of affirmative answers.
        if(call.equalsIgnoreCase("y")){
            counter++;
        }

        if(scene.equalsIgnoreCase("y")){
            counter++;
        }

        if(live.equalsIgnoreCase("y")){
            counter++;
        }

        if(money.equalsIgnoreCase("y")){
            counter++;
        }

        if(worked.equalsIgnoreCase("y")){
            counter++;
        }

        // Check if you participated in the crime.
        if(counter >= 0 && counter <=1){
            System.out.println("You are innocent.");
        } else if(counter > 1 && counter <=2){
            System.out.println("You are a suspect.");
        } else if(counter >=3 && counter <=4){
            System.out.println("You are an accomplice to the crime.");
            System.out.println("             ____            ____            ____\n" +
                    "                  /....\\          /....\\          /....\\\n" +
                    "          .-.    |::::::|    .-. |::::::|    .-. |::::::|\n" +
                    "          | |    |::::::|    | | |::::::|    | | |::::::|\n" +
                    "          | |    (`:'':')    | | (`:'':')    | | (`:'':')\n" +
                    "          | |   _--|__|--__  | |.--|__|--__  | |_--|__|--__\n" +
                    "          | |  |   ________|_|_|_  ________|_|_|_  ________|_____\n" +
                    "          | | /    |            |  |            |  |            |\n" +
                    "          | |/  /  |            |  |            |  |            |\n" +
                    "          |_| |/|  |            |  |            |  |            |\n" +
                    "         (===)| |  |   POLICE   |  |  POLICE    |  |   POLICE   |\n" +
                    "         `==='  |`-|            |`-|            |`-|            |\n" +
                    "          | |   |`-|            |`-|            |`-|            |\n" +
                    "          |_|   |  |            |  |            |  |            |\n" +
                    "                |  |            |  |            |  |            |\n" +
                    "                |  |            |  |            |  |            |\n" +
                    "                |`-|            |`-|            |`-|            |\n" +
                    "                |__|            |__|            |__|            |\n" +
                    "                /_ |            |_ |            |_ |            |\n" +
                    "               |___`-__________-'__`-__________-'__`-__________-'");
            System.out.println("YOU WERE ARRESTED!");

        } else if(counter == 5) {
            System.out.println("YOU ARE THE KILLER!");
            System.out.println("             ____            ____            ____\n" +
                    "                  /....\\          /....\\          /....\\\n" +
                    "          .-.    |::::::|    .-. |::::::|    .-. |::::::|\n" +
                    "          | |    |::::::|    | | |::::::|    | | |::::::|\n" +
                    "          | |    (`:'':')    | | (`:'':')    | | (`:'':')\n" +
                    "          | |   _--|__|--__  | |.--|__|--__  | |_--|__|--__\n" +
                    "          | |  |   ________|_|_|_  ________|_|_|_  ________|_____\n" +
                    "          | | /    |            |  |            |  |            |\n" +
                    "          | |/  /  |            |  |            |  |            |\n" +
                    "          |_| |/|  |            |  |            |  |            |\n" +
                    "         (===)| |  |   POLICE   |  |  POLICE    |  |   POLICE   |\n" +
                    "         `==='  |`-|            |`-|            |`-|            |\n" +
                    "          | |   |`-|            |`-|            |`-|            |\n" +
                    "          |_|   |  |            |  |            |  |            |\n" +
                    "                |  |            |  |            |  |            |\n" +
                    "                |  |            |  |            |  |            |\n" +
                    "                |`-|            |`-|            |`-|            |\n" +
                    "                |__|            |__|            |__|            |\n" +
                    "                /_ |            |_ |            |_ |            |\n" +
                    "               |___`-__________-'__`-__________-'__`-__________-'");
            System.out.println("YOU WERE ARRESTED!");

        }
    }
}
