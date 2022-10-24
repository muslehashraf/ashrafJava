package loops.fori_loops;

public class Exercise09_findSumOfNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to find sum of the numbers from 10 to 15 ( 10 and 15 are included)

        Expected output:
        75
         */

        int counter = 0;
        for (int i = 10; i <= 15; i++) {
            counter += i;
        }
        System.out.println(counter);
    }

    }

