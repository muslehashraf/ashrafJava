package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_StringComparison {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter 2 strings
        And store answers of user in different String variables
        Finally, check if given 2 Strings are equal or not and print messages given below

        Test data 1:
        java
        JAVA

        Expected output 1:
        These strings are not equal

        Test data 2:
        Hello
        Hello

        Expected output 2:
        These strings are equal
         */


        String s1, s2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 Strings");
        s1 = input.nextLine();
        s2 = input.nextLine();

        if (s1.equals(s2)){
            System.out.println("These Strings are equal");
        }else System.out.println("There Strings are not equal");

        // or after we created a method // best way
        String i1 = ScannerHelper.getAString();// best way
        String i2 = ScannerHelper.getAString();// best way

        if (i1.equals(i2))System.out.println("These Strings are equal");// best way
        else System.out.println("There Strings are not equal");// best way

        System.out.println( ScannerHelper.getAString().equals(ScannerHelper.getAString()) ? "these String are equal" : "These Strings are not equal");



    }
}
