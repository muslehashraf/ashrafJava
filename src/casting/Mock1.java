package casting;

import java.util.Scanner;

public class Mock1 {int i1 = 3, i2 = 6, i3 = 10;



        public static void main(String[] arge){
           int i1 = 3, i2 = 6, i3 = 10;
            int max1 = Math.max(Math.max(i1, i2), i3);

            System.out.println(max1);


            /*Ask user to enter their name first, then age. Store them in
            proper variables, and print result in the format
            {name}'s age is {age}.
*/



            String name;
            int age;

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your name");
            name = input.nextLine();

            System.out.println("Please enter your age");
            age = input.nextInt();

            System.out.println( name + "'s age is " + age);










        }

    }

