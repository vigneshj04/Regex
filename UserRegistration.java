package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Enter Your First Name: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        Pattern p = Pattern.compile("^[A-Z][a-z]{3}$");
        Matcher m = p.matcher(firstName);

        if (m.find()) {
            System.out.println(firstName + " is Valid");
        } else {
            System.out.println(firstName + " Not Valid");
            System.out.println("First Letter must be Capital");
        }
    }
}