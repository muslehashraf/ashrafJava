package homeworks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("-----------Task-1-----------");
        String task1Str = "Selenium is the most common UI automation tool.   ";
        System.out.println(countWords(task1Str));

        System.out.println("-----------Task-2-----------");
        String task2Str = "QA stands for Quality Assurance";
        System.out.println(countA(task2Str));

        System.out.println("-----------Task-3-----------");
        ArrayList<Integer> task3Nums = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println(countPos(task3Nums));

        System.out.println("-----------Task-4-----------");
        ArrayList<Integer> task4Nums = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println(removeDuplicateNumbers(task4Nums));

        System.out.println("-----------Task-5-----------");
        ArrayList<String> task5Elements = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(task5Elements));

        System.out.println("-----------Task-6-----------");
        String task6Str = "Java  is fun    ";
        System.out.println(removeExtraSpaces(task6Str));

        System.out.println("-----------Task-7-----------");
        int[] task7arr1 = {10, 3, 6, 3, 2};
        int[] task7arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(add(task7arr1, task7arr2)));

        System.out.println("-----------Task-8-----------");
        int[] task8Nums = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(task8Nums));



    }

    public static int countWords(String str){
        return str.trim().replaceAll("\\s{2,}", " ").split(" ").length;
    }

    public static int countA(String str){
        return str.replaceAll("[^aA]+", "").length();
    }

    public static int countPos(ArrayList<Integer> nums){
        return (int)nums.stream().filter(num -> num > 0).count();
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> nums){
        ArrayList<Integer> newNums = new ArrayList<>();

        for (int num : nums) {
            if (!newNums.contains(num))newNums.add(num);
        }

        return newNums;
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> elements){
        ArrayList<String> newElements = new ArrayList<>();

        for (String element : elements) {
            if (!newElements.contains(element))newElements.add(element);
        }

        return newElements;
    }

    public static String removeExtraSpaces(String str){
        return str.trim().replaceAll("\\s{2,}", " ");
    }

    public static int[] add(int[] nums1, int[] nums2){
        int[] newNums = new int[Math.max(nums1.length, nums2.length)];

        for (int i = 0; i < nums1.length; i++) {
            newNums[i] += nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            newNums[i] += nums2[i];
        }

        return newNums;
    }

    public static int findClosestTo10(int[] nums){
        int closestTo10 = Integer.MIN_VALUE;

        for (int num : nums) {
            if(num != 10 && Math.abs(closestTo10 - 10) > Math.abs(num - 10)){
                if (Math.abs(closestTo10 - 10) == Math.abs(num - 10))closestTo10 = Math.min(num, closestTo10);
                else closestTo10 = num;
            }
        }
        return closestTo10;
    }
}
