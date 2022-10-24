package arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {

        /*
        Assume you are given as below

        String word = "Java";

        Count how many a letters you have in the String

        EXPECTED:
        2
         */

        String word = "Java"; // [J, a, v, a]

        int countA = 0;

        for(char element : word.toCharArray()){
            if(element == 'a') countA++;
        }

        System.out.println(countA);

    }
}
