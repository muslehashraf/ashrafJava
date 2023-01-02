package notes_mocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class _12_17_2022_Mock3_Notes {

    /*
                    Mock-3
        Soft-skills knowledge -
            Testing types - GIT
            merge vs rebase
            branching commands
            Bug Life Cycle - Reports
            SAFe
            SMART
        Java knowledge
            Exceptions
            Collections
            OOP
                Class members
                Garbage collection
                Access modifiers
                OOP concepts
                    What is it?
                    How to achieve it?
                    What is the main goal / advantages?
            Casting
        Java Whiteboard
            Collections - loops - conditions - pseudo code
            Map - Set
        Friday 10 AM to 1 PM ->
        Lunch together


        Monday 6 PM meeting to discuss Mock-3 details
        Tuesday - Wednesday - Thursday - OFF
        Document TO DO -> January 2nd
        Map-1
        Map-2
        AP-1
        Homework-13
        Project10
        Selenium Installation
     */


    public static void main(String[] args) {

        String a = "a1b2c3";
        System.out.println(findDigitSum(a));

        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(5,3,4,1,2));
        System.out.println(findMin(b));


        int[] c  = {6,7,8,9,10};
        System.out.println(Arrays.toString(subtract5(c)));
    }

    public static int findDigitSum(String str){


        int sum = 0;

        str = str.replaceAll("[\\D]", "");

        if(str.isEmpty())return sum;

        for(int i = 0; i < str.length(); i++){
            sum += Integer.parseInt("" + str.charAt(i));
        }

        return sum;
    }

    public static int findMin(ArrayList<Integer> arr) {

        TreeSet<Integer> set = new TreeSet<>(arr);

        return set.first();
    }

    public static int[] subtract5(int[] arr){


        for(int i = 0; i < arr.length; i++){
            arr[i] -= 5;
        }

        return arr;
    }
}
