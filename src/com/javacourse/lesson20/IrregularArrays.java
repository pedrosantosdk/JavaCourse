package com.javacourse.lesson20;

import java.util.Scanner;

public class IrregularArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of people to be interviewed: ");
        int numOfRespondents = input.nextInt();

        String[][] childrensName = new String[numOfRespondents][];

        for (int i = 0; i < childrensName.length; i++){
            System.out.println("Enter the number of children's: ");
            int numberOfChildren = input.nextInt();

            childrensName[i] = new String[numberOfChildren];

            for (int j = 0; j < childrensName[i].length; j++){
                System.out.println("Enter the name of child " + (j + 1));
                childrensName[i][j] = input.next();
            }
        }

        for (int i = 0; i < childrensName.length; i++) {
            System.out.println("Interviewee " + i + " has " + childrensName[i].length + " children");
            for (int j = 0; j < childrensName[i].length; j++) {
                System.out.println(childrensName[i][j]);
            }
        }
    }
}
