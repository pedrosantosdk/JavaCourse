package com.javacourse.lesson17;

import java.util.Objects;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean validLogin = false;

        // Request to complete the username and password
        // if the password is the same as the username displays an error message and asks to re-enter it.
        do {
            System.out.println("Enter Username: ");
            String username = input.next();

            System.out.println("Enter Password: ");
            String password = input.next();

            if (Objects.equals(username, password)) {
                System.out.println("The username cannot be the same as the password.\n" +
                        "Please try again:");
            } else {
                System.out.println("Login successfully.");
                validLogin = true;
            }
        } while(!validLogin);
    }
}
