package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {
        System.out.println("\n----------task1----------");
        int[] task1numbers = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(task1numbers));

        System.out.println("\n----------task2----------");
        int[] task2numbers = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(task2numbers));

        System.out.println("\n----------task2----------");
        String task3String = "Hello";
        System.out.println(findFirstUniqueCharacter(task3String));

        System.out.println("\n----------task4----------");
        int[] task4numbers = {4, 7, 8, 6};
        System.out.println(findMissingNumber(task4numbers));

    }
    public static int findClosestDistance(int[] arr){

        if (arr.length < 2)return -1;

        int closest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
            if (Math.abs(arr[i] - arr[j]) < closest)closest = Math.abs(arr[i] - arr[j]);
            }
        }
        return closest;
    }


    public static int findSingleNumber(int[] arr){

        if (arr.length < 2 && arr.length % 2 == 0)return arr[0];


        ArrayList<Integer> numbers = new ArrayList<>();
        for (int number : arr) {
            numbers.add(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (arr[i] == arr[j]) {

                    numbers.remove(i);
                    i--;
                    j--;
                    numbers.remove(j);


                }

            }
        }
        return numbers.get(0);
    }

    public static char findFirstUniqueCharacter(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1) {
                return str.charAt(i);
            }
        }

        return ' ';
    }

    public static int findMissingNumber(int[] arr){

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1])return arr[i] + 1;
        }

        return -1;
    }


}
