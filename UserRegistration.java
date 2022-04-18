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
        System.out.println("Enter the Mobile Number");
        String mobileNumber = input.next();

        Pattern namePattern = Pattern.compile("^[A-Z][a-z]{2}$");
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Pattern mob_Pattern = Pattern.compile("[91?]\\s[6-9][0-9]{9}$");
        Matcher nameMatcher = namePattern.matcher(firstName);
        Matcher lastNameMatch = namePattern.matcher(lastName);
        Matcher emailMatch = emailPattern.matcher(eMail);
        Matcher mob_Match = mob_Pattern.matcher(mobileNumber);

        if (nameMatcher.find() && lastNameMatch.find()) {
            if (emailMatch.find() && mob_Match.find()) {
                System.out.println("Your Details are Valid");
            } else {
                System.out.println("Please Check Your Email and Mobile Number");
            }
        } else {
            System.out.println("Please Check Your First Name and Last Name");
        }
    }
}