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
        System.out.println("Enter the E-Mail-ID");
        String eMail = input.next();

        Pattern namePattern = Pattern.compile("^[A-Z][a-z]{2}$");
        Pattern emailPattern = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@][a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
        Matcher nameMatcher = namePattern.matcher(firstName);
        Matcher lastNameMatch = namePattern.matcher(lastName);
        Matcher emailMatch = emailPattern.matcher(eMail);


        if (nameMatcher.find() && lastNameMatch.find() && emailMatch.find()) {
            System.out.println("Your Details are Valid");
        } else {
            System.out.println("Your Details are Not Valid");
        }
    }
}