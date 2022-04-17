package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Enter Your First Name: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        System.out.println("Enter the Last Name");
        String lastName = input.next();

        Pattern P = Pattern.compile("^[A-Z][a-z]{2}$");
        Matcher M = P.matcher(firstName);
        Matcher M1 = P.matcher(lastName);

        if (M.find() && M1.find()) {
            System.out.println("User Name Is Valid");
        } else {
            System.out.println("User Name Is Not Valid");
            System.out.println("First Letter must be Capital");
        }
    }
}