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

        Pattern namePattern = Pattern.compile("^[A-Z][a-z]{2}$");
        Matcher nameMatcher = namePattern.matcher(firstName);
        Matcher lastNameMatch = namePattern.matcher(lastName);

        if (nameMatcher.find() && lastNameMatch.find()) {
            System.out.println("User Name Is Valid");
        } else {
            System.out.println("User Name Is Not Valid");
            System.out.println("First Letter must be Capital");
        }
    }
}