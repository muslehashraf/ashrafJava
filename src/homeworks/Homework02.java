package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("\n-------------------------Task 1----------------------------------\n");
        Scanner numInput = new Scanner(System.in);

                int num1, num2;
/*
      System.out.println("Please enter 2 numbers");
        num1 = numInput.nextInt();
        num2 = numInput.nextInt();
        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));


        System.out.println("\n-------------------------Task 2----------------------------------\n");

       int number1, number2;
        System.out.println("Please enter two numbers");
        number1 = numInput.nextInt();
        number2 = numInput.nextInt();
        System.out.println("The product of the given 2 numbers is: " + number1 * number2);


        System.out.println("\n-------------------------Task 3----------------------------------\n");

        double firstNumber, secondNumber;
        System.out.println("Please enter 2 numbers");
        firstNumber = numInput.nextDouble();
        secondNumber = numInput.nextDouble();
        System.out.println("The sum of the given numbers is = " + (firstNumber + secondNumber));
        System.out.println("The product of the given numbers is = " + firstNumber * secondNumber );
        System.out.println("The subtraction of the given numbers is = " + (firstNumber - secondNumber));
        System.out.println("The division of the given numbers is = " + firstNumber / secondNumber);
        System.out.println("The remainder of the given numbers is = " + firstNumber % secondNumber);

        System.out.println("\n-------------------------Task 4----------------------------------\n");

        System.out.println(-10 + 7 * 5);
        System.out.println((72 + 24) % 24);
        System.out.println(10 + -3 * 9 / 9);
        System.out.println(5 + 18 / 3 * 3 -(6 % 3));

        System.out.println("\n-------------------------Task 5----------------------------------\n");

        int theFirstNum, theSecondNum;
        System.out.println("Please enter the first number");
        theFirstNum = numInput.nextInt();
        System.out.println("Please enter the second number");
        theSecondNum = numInput.nextInt();
        System.out.println("The average of the given numbers is: " + (theFirstNum + theSecondNum) / 2);

        System.out.println("\n-------------------------Task 6----------------------------------\n");
        int n1,n2,n3,n4,n5;
        System.out.println("Please enter the first number");
        n1 = numInput.nextInt();
        System.out.println("Please enter the second number");
        n2 = numInput.nextInt();
        System.out.println("Please enter the third number");
        n3 = numInput.nextInt();
        System.out.println("Please enter the fourth number");
        n4 = numInput.nextInt();
        System.out.println("Please enter the fifth number");
        n5 = numInput.nextInt();
        System.out.println("The average of the given numbers is: " + (n1 + n2 + n3 + n4 + n5) / 5);

        System.out.println("\n-------------------------Task 7----------------------------------\n");
        int i1,i2,i3;
        System.out.println("Please enter the first number");
        i1 = numInput.nextInt();
        System.out.println("The " + i1 + " multiplied with " + i1 + " is = " + i1 * i1 );
        System.out.println("Please enter the second number");
        i2 = numInput.nextInt();
        System.out.println("The " + i2 + " multiplied with " + i2 + " is = " + i2 * i2 );
        System.out.println("Please enter the third number");
        i3 = numInput.nextInt();
        System.out.println("The " + i3 + " multiplied with " + i3 + " is = " + i3 * i3 );

        System.out.println("\n-------------------------Task 8----------------------------------\n");
        int s1;
        System.out.println("Please enter a side of the square");
        s1 = numInput.nextInt();
        System.out.println("Perimeter of the square = " + 4 * s1);
        System.out.println("Area of the square = " + s1 * s1);

        System.out.println("\n-------------------------Task 9----------------------------------\n");

        double yearly = 90_000;
        int years = 3;
        System.out.println("A Software Engineer in Test can earn $" + yearly * years + " in " + years + " years.");

        System.out.println("\n-------------------------Task 10----------------------------------\n");


        String favBook, favColor;
        int favNumber;


        numInput.nextLine();

        System.out.println("What's your favorite book");
        favBook = numInput.nextLine();

        System.out.println("What's your favorite color");
        favColor = numInput.next();

        System.out.println("What's your favorite number");
        favNumber = numInput.nextInt();

        System.out.println("User's favorite book is: " + favBook + "\n" +
                "User's favorite color is: " + favColor + "\n" +
                "User's favorite number is: " + favNumber);

*/
        System.out.println("\n-------------------------Task 11----------------------------------\n");



        String fName,lName,emailAddress,phoneNumber,address;
        int age;

        numInput.nextLine();

        System.out.println("Please enter your first Name");
        fName = numInput.nextLine();

        System.out.println("please enter your last name");
        lName = numInput.nextLine();

        System.out.println("Please enter your age");
        age = numInput.nextInt();

        numInput.nextLine();

        System.out.println("Please enter your email address");
         emailAddress = numInput.nextLine();

         System.out.println("Please enter your phone number");
        phoneNumber = numInput.nextLine();


        System.out.println("Please enter your address");
        address = numInput.nextLine();

     System.out.println("\tUser who joined this program is " + fName + " " + lName + ". "
     + fName + "'s " + "age is " + age + ". " + fName + "'s email\naddress is " + emailAddress + ", phone number is "
             + phoneNumber + "," + " and address\nis " + address + ".");






    }
}
