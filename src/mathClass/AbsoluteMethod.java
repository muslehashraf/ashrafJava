package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {
    public static void main(String[] args) {

        System.out.println("Difference between your number is = " + Math.abs(10 - 14));
        System.out.println("Difference between your number is = " + Math.abs(14 - 10));
        System.out.println("subtraction between your number is = " + (10 - 14));

        /*
        Write a program asks user two ages and gets the difference between ages
        and prints them

        Output:
        "Please enter an age"
        input -> 24
        "Please enter another age"
        input -> 32

        "Difference between your ages is = 8"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an age");
        int age1 = input.nextInt();
        System.out.println("Please enter another age");
        int age2 = input.nextInt();

        System.out.println("difference between your ages is = " + Math.abs(age1 - age2));
        System.out.println("Biggest age is = " + Math.max(age2,age1));
        System.out.println("Smallest age is = " + Math.min(age2, age1));





























    }
}
