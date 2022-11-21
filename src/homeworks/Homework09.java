package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n----------task-1----------");
        int[] task1Numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        boolean duplicateTask1 = false;

        for (int i = 0; i < task1Numbers.length; i++) {
            for (int j = i + 1; j < task1Numbers.length; j++) {
                if (duplicateTask1)break;
                if (task1Numbers[i] == task1Numbers[j]){
                    duplicateTask1 = true;
                    System.out.println(task1Numbers[i]);
                    break;
                }
            }
        }
        if (!duplicateTask1) System.out.println("There is no duplicates");

        System.out.println("\n----------task-2----------");
        String[] task2Words = {"a", "#", "123", "XYZ", "123"};
        boolean duplicateTask2 = false;

        for (int i = 0; i < task2Words.length; i++) {
            for (int j = i + 1; j < task2Words.length; j++) {
                if (duplicateTask2)break;
                if (task2Words[i].equalsIgnoreCase(task2Words[j])){
                    duplicateTask2 = true;
                    System.out.println(task2Words[i]);
                    break;
                }
            }
        }
        if (!duplicateTask2) System.out.println("There is no duplicates");

        System.out.println("\n----------task-3----------");
        int[] task3Numbers = {1, 2, 5, 0, 7};
        ArrayList<Integer> foundTask3 = new ArrayList<>();
        boolean duplicateTask3 = false;

        for (int i = 0; i < task3Numbers.length; i++) {
            for (int j = i + 1; j < task3Numbers.length; j++) {
                if (!foundTask3.contains(task3Numbers[i]) && task3Numbers[i] == task3Numbers[j]){
                    foundTask3.add(task3Numbers[i]);
                    duplicateTask3 = true;
                    System.out.println(task3Numbers[i]);

                }
            }
        }
        if (!duplicateTask3) System.out.println("There is no duplicates");

        System.out.println("\n----------task-4----------");
        String[] task4Words = {"a", "foo", "12", "bar", "java"};
        ArrayList<String> foundTask4 = new ArrayList<>();

        boolean duplicateTask4 = false;

        for (int i = 0; i < task4Words.length; i++) {
            for (int j = i + 1; j < task4Words.length; j++) {
                if (!foundTask4.contains(task4Words[i]) && task4Words[i].equalsIgnoreCase(task4Words[j])){
                    foundTask4.add(task4Words[i]);
                    duplicateTask4 = true;
                    System.out.println(task4Words[i]);

                }
            }
        }
        if (!duplicateTask4) System.out.println("There is no duplicates");

        System.out.println("\n----------task-5----------");
        String[] task5Words = {"java", "python", "ruby"};
        ArrayList<String> task5Reversed = new ArrayList<>();

        for (int i = task5Words.length - 1; i >= 0; i--) {
            task5Reversed.add(task5Words[i]);
        }
        System.out.println(task5Reversed);

        System.out.println("\n----------task-6----------");
        String task6 = "Java is fun";
        task6 = task6.replaceAll("[\\s]{2,}", " ");
        String[] task6Words = task6.split("[\\s]");
        StringBuilder newString = new StringBuilder();

        for (String task6Word : task6Words) {
            newString.append(new StringBuilder(task6Word).reverse().append(" "));
        }
        System.out.println(newString.substring(0, newString.length() - 1));





    }
}
