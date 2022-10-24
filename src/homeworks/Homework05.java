package homeworks;

import utilities.ScannerHelper;

public class Homework05 {
    public static void main(String[] args) {

        System.out.println("\n---------------TAsk 1---------------\n");

        String result1 = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0)result1 += i + " - ";
        }
        System.out.println(result1.substring(0,result1.length() - 3));

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 2---------------\n");

        String result2 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 3 == 0)result2 += i + " - ";
        }
        System.out.println(result2.substring(0,result2.length() - 3));

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 3---------------\n");

        String result3 = "";
        for (int i = 100; i >= 50; i--){
            if (i % 5 == 0)result3 += i + " - ";
        }
        System.out.println(result3.substring(0,result3.length() - 3));

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 4---------------\n");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);
        }

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 5---------------\n");

        int calculation = 0;

        for (int i = 1; i <= 10 ; i++) {
            calculation += i;
        }
        System.out.println(calculation);

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 6---------------\n");

        int n1 = ScannerHelper.getANumber();
        int factorial = 1;



        for (int i = 1; i <= n1 ; i++) {
            if (n1 == 0) System.out.println("1");
            else if (n1 == 1){ System.out.println("1");}
            else if (n1 >= 2) {factorial = factorial * i;

            if(n1 == i) System.out.println(factorial);}//i put if here bc if i didnt put it it will be printing till the loop break but now it will print when the lopp break
        }

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 7---------------\n");

        String name = ScannerHelper.getAFullName();
        int count = 0;
        name = name.toLowerCase();

        for (int i = 0; i <= name.length() - 1; i++) {
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')count++;
        }
        if (count == 1) System.out.println("There is " + count + " vowel letter in this Full name");
        else System.out.println("There are " + count + " vowel letters in this Full name");

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 8---------------\n");

        int calculator = 0;
        int attempts = 0;

        do{
           int num = ScannerHelper.getANumber();
           calculator += num;
           attempts++;
        }while (calculator < 100);
        if (attempts == 1) System.out.println("The number is already more than 100");
        else if(attempts > 1) System.out.println("sum of entered numbers is at least  100");

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 9---------------\n");

        int i = ScannerHelper.getANumber();
        int firstNum = 0, secondNum = 1, nextNum;
        int counter = 0;
        String S = "";

        while (counter < i) {
            if (counter <= i - 2) {
                System.out.print(firstNum + " - ");

                nextNum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = nextNum;
                counter++;
            } else if (counter == i - 1 ) {
                System.out.print(firstNum);
                nextNum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = nextNum;
                counter++;
            }
        }

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        System.out.println("\n---------------TAsk 10---------------\n");

        String name1;

        do {
            name1 = ScannerHelper.getAName();
        }while(name1.toLowerCase().charAt(0) != 'j');

        System.out.println("end of the program");
    }
}
