package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {

    public static void main(String[] args) {

        /*
        Get 2 numbers from user and find their max and min then print them with messages
        Output:
        "Hey user give me a number"
        -> input = 10
        "Hey user give me another number"
        -> input = 15
        Max of your numbers is 15
        Min of your numbers is 10
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Hey user give me a number");
        int num1 = scan.nextInt();

        System.out.println("Hey user give me another number");
        int num2 = scan.nextInt();

        System.out.println("Your first number is = " + num1);
        System.out.println("Your second number is = " + num2);



        /*

        Get 3 numbers from user and find their max and min then print them with messages

        Output:
        "Hey user give me a number"
        -> input = 10
        "Hey user give me another number"
        -> input = 15
        "Hey user give me the last number"
        -> input = 20

        Max of your numbers is 20
        Min of your numbers is 10
         */
        System.out.println("Hey user give me a number");
        int n1 = scan.nextInt();

        System.out.println("Hey user give me another number");
        int n2 = scan.nextInt();

        System.out.println("Hey user give the last number");
        int n3 = scan.nextInt();

        System.out.println("Max of your numbers is = " + Math.max(Math.max(n1, n2), n3));
        System.out.println("Min of your numbers is = " + Math.min(Math.min(n1, n2), n3));


    }
}
