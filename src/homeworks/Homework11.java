package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("\n----------task-1----------");
        String task1String1 = "";
        String task1String2 = "Java";
        String task1String3 = "    Hello     ";
        String task1String4 = " Hello World ";
        String task1String5 = "Tech Global";
        System.out.println(noSpace(task1String1));
        System.out.println(noSpace(task1String2));
        System.out.println(noSpace(task1String3));
        System.out.println(noSpace(task1String4));
        System.out.println(noSpace(task1String5));

        System.out.println("\n----------task-2----------");
        String task2String1 = "";
        String task2String2 = "A";
        String task2String3 = "    A     ";
        String task2String4 = "Hello";
        String task2String5 = "Tech Global";
        System.out.println(replaceFirstLast(task2String1));
        System.out.println(replaceFirstLast(task2String2));
        System.out.println(replaceFirstLast(task2String3));
        System.out.println(replaceFirstLast(task2String4));
        System.out.println(replaceFirstLast(task2String5));

        System.out.println("\n----------task-3----------");
        String task3String1 = "";
        String task3String2 = "java";
        String task3String3 = "1234";
        String task3String4 = "ABC";
        System.out.println(hasVowel(task3String1));
        System.out.println(hasVowel(task3String2));
        System.out.println(hasVowel(task3String3));
        System.out.println(hasVowel(task3String4));

        System.out.println("\n----------task-4----------");
        int task4String1 = 2010;
        int task4String2 = 2006;
        int task4String3 = 2050;
        int task4String4 = 1920;
        int task4String5 = 1800;
        checkAge(task4String1);
        checkAge(task4String2);
        checkAge(task4String3);
        checkAge(task4String4);
        checkAge(task4String5);

        System.out.println("\n----------task-5----------");
        System.out.println(averageOfEdges(0, 0 ,0));
        System.out.println(averageOfEdges( 0, 0, 6));
        System.out.println(averageOfEdges(-2, -2, 10));
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println(averageOfEdges(10, 13, 20));

        System.out.println("\n----------task-6----------");
        String[] task6String1 = {"java", "hello", "123", "xyz"};
        String[] task6String2 = {"appium", "123", "ABC", "java"};
        String[] task6String3 = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println(Arrays.toString(noA(task6String1)));
        System.out.println(Arrays.toString(noA(task6String2)));
        System.out.println(Arrays.toString(noA(task6String3)));

        System.out.println("\n----------task-7----------");
        int[] task7String1 = {7, 4, 11, 23, 17};
        int[] task7String2 = {3, 4, 5, 6};
        int[] task7String3 = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(task7String1)));
        System.out.println(Arrays.toString(no3or5(task7String2)));
        System.out.println(Arrays.toString(no3or5(task7String3)));

        System.out.println("\n----------task-8----------");
        int[] task8String1 = {-10, -3, 0, 1};
        int[] task8String2 = {7, 4, 11, 23, 17};
        int[] task8String3 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(task8String1));
        System.out.println(countPrimes(task8String2));
        System.out.println(countPrimes(task8String3));
    }

    public static String noSpace(String str){

        return str.replaceAll("[\\s]", "");
    }

    public static String replaceFirstLast(String str){

        str = str.trim();
        if (str.length() < 3)return "";

        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public static boolean hasVowel(String str){

        boolean contains = false;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'e')return true;
        }
        return false;
    }

    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        int currentYear = date.getYear() + 1900;


        if(currentYear - yearOfBirth > 100 || yearOfBirth > currentYear) System.out.println("AGE IS NOT VALID");
        else if (currentYear - yearOfBirth < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }

    public static int averageOfEdges(int num1, int num2, int num3){
        int[] nums = {num1, num2, num3};
        Arrays.sort(nums);

        return (nums[0] + nums[2]) / 2;
    }

    public static String[] noA(String[] strings){

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith("a") || strings[i].startsWith("A"))strings[i] = "###";
        }

        return strings;
    }

    public static int[] no3or5(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 5 == 0 && nums[i] % 3 == 0)nums[i] = 101;

            if (nums[i] % 3 == 0)nums[i] = 100;
            else if (nums[i] % 5 == 0)nums[i] = 99;
        }
        return nums;
    }

    public static int countPrimes(int[] nums){

        int count = nums.length;
        for (int num : nums) {
            if (num < 3)count--;
            for (int i = 2; i < num; i++) {
                if (num % i == 0)count--;
            }
        }
        return count;
    }
}
