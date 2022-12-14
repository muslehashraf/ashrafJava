package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("\n----------task-1----------");
        String task1T1 = "";
        String task1T2 = "Java";
        String task1T3 = "123Hello";
        String task1T4 = "123Hello World149";
        String task1T5 = "Hello World";
        System.out.println(noDigit(task1T1));
        System.out.println(noDigit(task1T2));
        System.out.println(noDigit(task1T3));
        System.out.println(noDigit(task1T4));
        System.out.println(noDigit(task1T5));

        System.out.println("\n----------task-2----------");
        String task2T1 = "";
        String task2T2 = "xyz";
        String task2T3 = "JAVA";
        String task2T4 = "125$";
        String task2T5 = "TechGlobal";
        System.out.println(noVowel(task2T1));
        System.out.println(noVowel(task2T2));
        System.out.println(noVowel(task2T3));
        System.out.println(noVowel(task2T4));
        System.out.println(noVowel(task2T5));

        System.out.println("\n----------task-3----------");
        String task3T1 = "";
        String task3T2 = "Java";
        String task3T3 = "John’s age is 29";
        String task3T4 = "$125.0";
        System.out.println(sumOfDigits(task3T1));
        System.out.println(sumOfDigits(task3T2));
        System.out.println(sumOfDigits(task3T3));
        System.out.println(sumOfDigits(task3T4));

        System.out.println("\n----------task-4----------");
        String task4T1 = "";
        String task4T2 = "java";
        String task4T3 = "John’s age is 29";
        String task4T4 = "$125.0";
        System.out.println(hasUpperCase(task4T1));
        System.out.println(hasUpperCase(task4T2));
        System.out.println(hasUpperCase(task4T3));
        System.out.println(hasUpperCase(task4T4));

        System.out.println("\n----------task-5----------");
        System.out.println(middleInt(1, 1, 1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5, 5, 8));
        System.out.println(middleInt(5, 3, 5));
        System.out.println(middleInt(-1, 25, 10));

        System.out.println("\n----------task-6----------");
        int[] task6T1 = {1, 2, 3 ,4};
        int[] task6T2 = {13, 2, 3} ;
        int[] task6T3 = {13, 13, 13 , 13, 13};
        System.out.println(Arrays.toString(no13(task6T1)));
        System.out.println(Arrays.toString(no13(task6T2)));
        System.out.println(Arrays.toString(no13(task6T3)));

        System.out.println("\n----------task-7----------");
        int[] task7T1 = {1, 2, 3 ,4};
        int[] task7T2 = {0, 5} ;
        int[] task7T3 = {5 , 0, 6};
        int[] task7T4 = {};
        System.out.println(Arrays.toString(arrFactorial(task7T1)));
        System.out.println(Arrays.toString(arrFactorial(task7T2)));
        System.out.println(Arrays.toString(arrFactorial(task7T3)));
        System.out.println(Arrays.toString(arrFactorial(task7T4)));

        System.out.println("\n----------task-6----------");
        String task8T1 = "";
        String task8T2 = "abc123$#%";
        String task8T3 = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(task8T1)));
        System.out.println(Arrays.toString(categorizeCharacters(task8T2)));
        System.out.println(Arrays.toString(categorizeCharacters(task8T3)));
    }

    public static String noDigit(String str){
        return str.replaceAll("[\\d]", "");
    }

    public static String noVowel(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static int sumOfDigits(String str){

        int sum = 0;
        char[] arr = str.toCharArray();

        for (char c : arr) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }

    public static boolean hasUpperCase(String str){

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))return true;
        }
        return false;
    }

    public static int middleInt(int n1, int n2, int n3){
        return n1 + n2 + n3 - Math.max(Math.max(n1, n2), n3) - Math.min(Math.min(n1, n2), n3);
    }

    public static int[] no13(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13)arr[i] = 0;
        }
        return arr;
    }

    public static int[] arrFactorial(int[] arr) {

        if (arr.length == 0) {
            return arr;
        }

        int[] factorials = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int factorial = 1;
            for (int j = 1; j <= num; j++) {
                factorial *= j;
            }
            factorials[i] = factorial;
        }

        return factorials;
    }

    public static String[] categorizeCharacters(String str) {
        String[] result = new String[3];
        result[0] = ""; // letters
        result[1] = ""; // digits
        result[2] = ""; // specials

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                result[0] += ch;
            } else if (Character.isDigit(ch)) {
                result[1] += ch;
            } else {
                result[2] += ch;
            }
        }

        return result;
    }
}
