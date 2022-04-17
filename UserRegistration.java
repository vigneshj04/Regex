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
        System.out.println("Enter the PassWord");
        String passWord = input.next();


        Pattern P = Pattern.compile("^[A-Z][a-z]{2}$");
        Pattern P1 = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Pattern P2 = Pattern.compile("[91?]\\s[6-9][0-9]{9}$");
        Pattern P3 = Pattern.compile("^[A-Z][a-z]{6}[0-9]$");

        Matcher M = P.matcher(firstName);
        Matcher M1 = P.matcher(lastName);
        Matcher M2 = P1.matcher(eMail);
        Matcher M3 = P2.matcher(mobileNumber);
        Matcher M4 = P3.matcher(passWord);

        if (M.find() && M1.find()) {
            if (M2.find() && M3.find()) {
                if (M4.find()) {
                    System.out.println("Your Details are Valid");
                } else {
                    System.out.println("Please Check Your PassWord");
                }
            } else {
                System.out.println("Please Check Your EMail and Mobile Number");
            }
        } else {
            System.out.println("Please Check Your First Name and Last Name");
        }
    }
}
