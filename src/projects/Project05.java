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

        System.out.println("-------------Task-5----------------");
        String[] task5String = {"foo", "bar", "Foo", "bar", "6", "abc", "6","xyz"};
        findDuplicatedElementsInAnArray(task5String);

        System.out.println("-------------Task-6----------------");
        String[] task6string = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(task6string);

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
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int secondMin = 0;
        int secondMax = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] != min){
                secondMin = numbers[i];
                break;
            }
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] != max){
                secondMax = numbers[i];
                break;
            }
        }
        System.out.println("Smallest = " + secondMin);
        System.out.println("Greatest = " + secondMax);
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
    public static void findDuplicatedElementsInAnArray(String[] str){

        for (int i = 0; i < str.length; i++){
            for (int j = i + 1; j < str.length; j++) {
            if (str[i].equals(str[j])) System.out.println(str[i]);
            }
        }

    }
    public static void findMostRepeatedElementInAnArray(String[] str){
        int finalCount = 0;
        int count = 0;
        String strWord = "";
//        String[] task6string = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        for (int i = 0; i < str.length; i++){
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])){
                    count++;
                    if(count > finalCount){
                        finalCount = count;
                        strWord = str[i];
                    }

                }
            }
        }
        System.out.println(strWord);

    }

}
