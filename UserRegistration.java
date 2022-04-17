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

        Pattern P = Pattern.compile("^[A-Z][a-z]{2}$");
        Pattern P1 = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher M = P.matcher(firstName);
        Matcher M1 = P.matcher(lastName);
        Matcher M2 = P1.matcher(eMail);


        if (M.find() && M1.find() && M2.find()) {
            System.out.println("Your Details are Valid");
        } else {
            System.out.println("Your Details are Not Valid");
        }
    }
}