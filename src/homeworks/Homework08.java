package homeworks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("----------task1----------");
        String task1 = "MY Name is samuel";
        System.out.println(countConsonants(task1));

        System.out.println("----------task2----------");
        String task2 = "Hello, nice to meet you!!";
        System.out.println(Arrays.toString(wordArray(task2)));

        System.out.println("----------task3----------");
        String task3 = "java  is    fun";
        System.out.println(removeExtraSpaces(task3));

        System.out.println("----------task4----------");
        String task4 = "Hel, guys";
        System.out.println(count3OrLess(task4));

        System.out.println("----------task5----------");
        String task5 = "01/21/1999";
        System.out.println(isDateFormatValid(task5));

        System.out.println("----------task6----------");
        String task6 = "abc@gmail.com";
        System.out.println(isEmailFormatValid(task6));

    }

    public static int countConsonants(String str){


        char[] letters = str.toCharArray();
        int count = 0;

        for (char letter : letters) {

            if (String.valueOf(letter).matches("[^eaiouAOUIE\\ 0-9]"))count++;
        }
        return count;
    }

    public static String[] wordArray(String str){

        str = str.replaceAll("[\\W[^A-ZA-z\\S]]", "");

        return str.split(" ");
    }

    public static String removeExtraSpaces(String str){

        return str;
    }

    public static int count3OrLess(String str){

        str = str.replaceAll("[^\\w\\ ]", "");

        return (int) Arrays.stream(str.split(" ")).filter(x -> x.length() < 4).count();
    }

    public static boolean isDateFormatValid(String str){

        return str.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}");
    }

    public static boolean isEmailFormatValid(String str){

        return str.matches("[a-zA-Z]{2,}@[a-zA-Z]{2,}\\.[a-zA-Z]{2,}");
    }

}
