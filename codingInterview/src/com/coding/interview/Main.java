package com.coding.interview;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //FizzBuzz
        fizzBuzz(100);

        //Palindrome
        palindrome("ANNA");


    }

    //method for fizzbuzz
    public static int fizzBuzz(int p) {
        for (int i = 0; i <= p; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if(i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
       return p;
    }

    //method for palindrome test
    public static String palindrome(String p) {
        String text = p;
        String temp = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            char c = text.charAt(i);
            temp += String.valueOf(c);
        }

        if (temp.toLowerCase(Locale.ROOT).equals(text.toLowerCase())) {
            System.out.println("TEXT is a PALINDROME");
        } else {
            System.out.println("TEXT is not a PALINDROME");
        }

        return p;
    }
}
