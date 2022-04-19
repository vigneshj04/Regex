package com.regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {

        ArrayList emails = new ArrayList();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc+100@gmail.com");

        emails.add("abc@gmail.com.aa.au");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@abc@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc()*@gmail.com");
        emails.add(".abc@abc.com");
        emails.add("abc123@.com.com");
        emails.add("abc123@.com");
        emails.add("abc123@gmail.a");

        String regex = ("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@][a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");

        Pattern pattern = Pattern.compile(regex);

        for(Object email : emails){
            Matcher matcher = pattern.matcher((CharSequence) email);
            System.out.println(email +" : "+ matcher.matches());
        }
        }
    }
