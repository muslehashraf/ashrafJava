package operaters.arithmetic_operators;

public class UnderstandingArithmeticOperators {
    public static void main(String[] args) {


        System.out.println("\n----------- task 1 -------------------");
        /*
        Find the result of below expressing
        3 + 5 --> 8
        5 - 2 --> 3
        10 / 2 --> 5
        2 * 4 --> 8
        10 % 3 --> 1

         */

        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println(10 / 2);
        System.out.println(2 * 4);
        System.out.println(10 % 3);


        System.out.println("\n----------------- task 2 ---------------");
        /*
        Create 2 int variable as num1 and num2
        and store 6 and 4 in these variables
        find their
        sum
        subtraction
        product
        division
        remainder
       */

       int num1 = 6, num2 = 4;
       System.out.println("The sum of numbers is = " + (num1 + num2));// Must
        System.out.println("The subtraction numbers is = " + (num1 - num2));// must
        System.out.println("The product of numbers is = " + num1 * num2); // () optional
        System.out.println("The division of numbers is = " + num1 / num2); // () optional
        System.out.println("The remainder of numbers is = " + num1 % num2); // () optional


    }
}
