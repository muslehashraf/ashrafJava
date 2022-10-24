package arrays;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {
        /*
        Assume that you are given the below String

        String sentence = "I love arrays";

        EXPECTED:
        3
         */

        String sentence = "I love arrays";
        sentence = sentence.trim();
        int countS = 0;
//        for (int i = 0; i < sentence.length(); i++) {
//            if(sentence.charAt(i) == ' ')countS++;
//        }
//        System.out.println(countS + 1);

//        for(char c : sentence.toCharArray()){
//            if (c == ' ')countS++;
//        }
//        System.out.println(countS + 1);

        System.out.println("----------split method-------------");
        System.out.println(sentence.split(" ") .length);





    }
}
