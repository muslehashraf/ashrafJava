package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("-------------Task-1----------------");
        int[] task1Numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(task1Numbers);

        System.out.println("-------------Task-2----------------");
        int[] task2Numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallest(task2Numbers);

        System.out.println("-------------Task-3----------------");
        int[] task3Numbers = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(task3Numbers);

        System.out.println("-------------Task-4----------------");
        int[] task4Numbers = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(task4Numbers);
    }



    public static void findGreatestAndSmallestWithSort(int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);
    }
    public static void findGreatestAndSmallest(int[] numbers){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if(number < min)min = number;
            else if(number > max)max = number;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);

    }
    public static void findSecondGreatestAndSmallestWithSort(int[] numbers){
        Arrays.sort(numbers);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers){
            if (number < min)min = number;
            if (number > max)max = number;
        }
        System.out.println("Smallest = " + numbers[1]);
        System.out.println("Greatest = " + numbers[numbers.length - 2]);
    }
    public static void findSecondGreatestAndSmallest(int[] numbers){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int number : numbers){
            if (number < min)min = number;
            if (number > max)max = number;
        }
        for(int number : numbers){
            if (number < secondMin && number > min)secondMin = number;
            if (number > secondMax && number < max)secondMax = number;
        }
        System.out.println("Second smallest = " + secondMin);
        System.out.println("Second greatest = " + secondMax);
    }

}
