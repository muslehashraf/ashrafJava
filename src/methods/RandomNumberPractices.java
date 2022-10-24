package methods;

import utilities.RandomNumberGenerator;

public class RandomNumberPractices {
    public static void main(String[] args) {
        /*
        Generate 5 random number and finder their average
         */
    int r1 = RandomNumberGenerator.getARandomNumber(5, 15);
    int r2 = RandomNumberGenerator.getARandomNumber(3, 10);
    int r3 = RandomNumberGenerator.getARandomNumber(50, 55);
    int r4 = RandomNumberGenerator.getARandomNumber(6, 63);
    int r5 = RandomNumberGenerator.getARandomNumber(100, 113);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    System.out.println("The average is = " + (r1 + r2+ r3 + r4 + r5) / 5);


    }
}
