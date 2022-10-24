package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("\n========================== TASK 1 ==========================\n");


        System.out.println("Please enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("The product of the numbers entered is = " + (num1 * num2 * num3));

        input.nextLine();


        System.out.println("\n============================ TASK 2 =============================\n");


        String fName, lName ;
        int yearOfBirth;
        System.out.println("Please enter your first name?");
         fName = input.nextLine();
        System.out.println("Please enter your last name?");
         lName = input.nextLine();
        System.out.println("Please enter your year of birth");
        yearOfBirth = input.nextInt();

        System.out.println(fName + " " + lName + "'s age is = " + (2022 - yearOfBirth));

        input.nextLine();

        System.out.println("\n========================= TASK 3==============================");


        System.out.println("Please enter your full name");
        String fullName = input.nextLine();

        System.out.println("Please enter your weight as kg");
        double kgWeight = input.nextDouble();

        System.out.println(fullName + "'s weight is = " + kgWeight * 2.205 + " lbs." );

        input.nextLine();


        System.out.println("\n===================================== TASK 4 =================\n");


        String fullName1, fullName2, fullName3;
        int age1, age2, age3;

        System.out.println("What is your full name?");
        fullName1 = input.nextLine();
        System.out.println("What is your age?");
        age1 = input.nextInt();

        input.nextLine();

        System.out.println("What is your full name?");
        fullName2 = input.nextLine();
        System.out.println("What is your age?");
        age2 = input.nextInt();

        input.nextLine();

        System.out.println("What is your full name?");
        fullName3 = input.nextLine();
        System.out.println("What is your age?");
        age3 = input.nextInt();

        System.out.println(fullName1 + "'s age is " + age1 + ".");
        System.out.println(fullName2 + "'s age is " + age2 + ".");
        System.out.println(fullName3 + "'s age is " + age3 + ".");
        System.out.println("The average age is " + (age1 + age2 + age3) / 3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(age1, age2),age3) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(age1, age2),age3) + ".");





    }
}
