package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n======================== TASK 1 =======================");

        int num1, num2;

        System.out.println("Please enter two numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));

        System.out.println("\n================= Task 2 ======================\n");
        int n1, n2, n3, n4, n5;
        System.out.println("Please enter 5 numbers");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5));
        System.out.println("Max value = " + Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5));

        System.out.println("\n================= Task 3 ======================\n");
        int n1myRandomBetween50To100 = (int) (Math.random() * (100 - 50 + 1) + 50);
        int n2myRandomBetween50To100 = (int) (Math.random() * (100 - 50 + 1) + 50);
        int n3myRandomBetween50To100 = (int) (Math.random() * (100 - 50 + 1) + 50);


        System.out.println("Number 1 = " + n1myRandomBetween50To100);
        System.out.println("Number 2 = " + n2myRandomBetween50To100);
        System.out.println("Number 3 = " + n3myRandomBetween50To100);
        System.out.println("The sum of numbers is = " + (n1myRandomBetween50To100 + n2myRandomBetween50To100 + n3myRandomBetween50To100));

        System.out.println("\n================= Task 4 ======================\n");

        double alexMoney = 125, mikeMoney = 220, moneyGiven = 25.5;


        System.out.println("Alex's money: " + (alexMoney -= moneyGiven));
        System.out.println("Mike's money: " + (mikeMoney += moneyGiven));


        System.out.println("\n================= Task 5 ======================\n");

        double bicyclePrice = 390, dailySaving = 15.60;

        int days = (int)(bicyclePrice / dailySaving);
        System.out.println(days);

        System.out.println("\n================= Task 6 ======================\n");

        String s1 = "5", s2 = "10";
        int number1 = Integer.valueOf(s1);
        int number2 = Integer.valueOf(s2);

        System.out.println("Sum of " + number1 + " and " + number2 + " is = " + (number1 + number2));
        System.out.println("Product of " + number1 + " and " + number2 + " is = " + (number1 * number2));
        System.out.println("Division of " + number1 + " and " + number2 + " is = " + (number1 / number2));
        System.out.println("Subtraction of " + number1 + " and " + number2 + " is = " + (number1 - number2));
        System.out.println("Remainder of " + number1 + " and " + number2 + " is = " + (number1 % number2));

        System.out.println("\n================= Task 7 ======================\n");
        String s3 = "200", s4 = "-50";
        int i3 = Integer.valueOf(s3);
        int i4 = Integer.valueOf(s4);
        System.out.println("The greatest value is = " + Math.max(i3, i4));
        System.out.println("The smallest value is = " + Math.min(i3, i4));
        System.out.println("The average is = " + (i3 + i4) / 2);
        System.out.println("The absolute difference is = " + Math.abs(i3 - i4));

        System.out.println("\n================= Task 8 ======================\n");
        double savingsADay = 0.96;
        int days24 = (int) (24 / savingsADay);
        int days168 = (int) (168 / savingsADay);
        System.out.println(days24 + " days");
        System.out.println(days168 + " days");
        System.out.println("$" + (savingsADay * 150));

        System.out.println("\n================= Task 9 ======================\n");
        double computerPrice = 1250, savingADay = 62.5;
        System.out.println((int)(computerPrice / savingADay));

        System.out.println("\n================= Task 10 ======================\n");
        double carPrice = 14265, option1 = 475.50, option2 = 951;
        System.out.println("Option 1 will take " + (int)(carPrice / option1) + " months");
        System.out.println("Option 2 will take " + (int)(carPrice / option2) + " months");

        System.out.println("\n================= Task 11 ======================\n");
        System.out.println("Please enter 2 numbers");
        int number01 = input.nextInt();
        int number02 = input.nextInt();
        double number011 = number01;
        double number012 = number02;
        System.out.println(number011 / number012);

        System.out.println("\n================= Task 12 ======================\n");

        int a1 = (int)(Math.random() * (101));
        int a2 = (int)(Math.random() * (101));
        int a3 = (int)(Math.random() * (101));
        boolean b1 = (a1 > 25);
        boolean b2 = (a2 > 25);
        boolean b3 = (a3 > 25);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        if (b1&&b2&&b3){
            System.out.println("true");
        }
        else{System.out.println("false");}

       System.out.println("\n================= Task 13 ======================\n");

        int numberDays1;
        System.out.println("Please enter a number between 1 to 7 (1 and 7 are included)");
        numberDays1 = input.nextInt();
        if (numberDays1 == 1){
            System.out.println("The number entered returns MONDAY");
        } else if (numberDays1 == 2) {
            System.out.println("The number entered returns TUESDAY");
        } else if (numberDays1 == 3) {
            System.out.println("The number entered returns WEDNESDAY");
        }else if (numberDays1 == 4) {
            System.out.println("The number entered returns THURSDAY");
        }else if (numberDays1 == 5) {
            System.out.println("The number entered returns FRIDAY");
        } else if (numberDays1 == 6) {
            System.out.println("The number entered returns SATURDAY");
        } else if (numberDays1 == 7) {
            System.out.println("The number entered returns SUNDAY");
        }

        System.out.println("\n================= Task 14 ======================\n");

        int exam1, exam2, exam3;
        System.out.println("Tell me your exam results");
        exam1 = input.nextInt();
        exam2 = input.nextInt();
        exam3 = input.nextInt();
        if ((exam1 + exam2 + exam3) /3 >= 70){
            System.out.println("YOU PASSED!");
        }
        else System.out.println("YOU FAILED!");


        System.out.println("\n================= Task 15 ======================\n");

        int m1, m2, m3;
        System.out.println("Please enter 3 numbers");
        m1 = input.nextInt();
        m2 = input.nextInt();
        m3 = input.nextInt();

        if (m1 == m2 && m2 == m3){
            System.out.println("\"TRIPLE MATCH\"");
        } else if (m1 == m2 || m2 == m3 || m1 == m3 ) {
            System.out.println("\"DOUBLE MATCH\"");
        }else System.out.println("\"NO MATCH\"");


    }
}
