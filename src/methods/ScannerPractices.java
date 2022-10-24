package methods;

import utilities.ScannerHelper;

public class ScannerPractices {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their name and then age
        Print the info in below format

        {name}'s age is {age}.
         */

        String name = ScannerHelper.getAName();
                int age = ScannerHelper.getAnAge();


        System.out.println(name + "'s age is " + age + ".");
        name = ScannerHelper.getAName();
                 age = ScannerHelper.getAnAge();


        System.out.println(ScannerHelper.getAName() + "'s age is " + ScannerHelper.getAnAge() + "." +
                "\n Address is " + ScannerHelper.getAnAddress());





    }
}
