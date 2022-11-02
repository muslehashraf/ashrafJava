package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n------------task-1------------\n");
        ArrayList<Integer> task1Numbers = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));
        System.out.println(task1Numbers.get(3));
        System.out.println(task1Numbers.get(0));
        System.out.println(task1Numbers.get(2));
        System.out.println(task1Numbers);

        System.out.println("\n------------task-2------------\n");
        ArrayList<String> task2Colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));
        System.out.println(task2Colors.get(1));
        System.out.println(task2Colors.get(3));
        System.out.println(task2Colors.get(5));
        System.out.println(task2Colors);

        System.out.println("\n------------task-3------------\n");
        ArrayList<Integer> task3Numbers = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));
        System.out.println(task3Numbers);
        Collections.sort(task3Numbers);
        System.out.println(task3Numbers);

        System.out.println("\n------------task-4------------\n");
        ArrayList<String> task4Countries = new ArrayList<>();
        task4Countries.add("Istanbul");
        task4Countries.add("Berlin");
        task4Countries.add("Madrid");
        task4Countries.add("Paris");
        System.out.println(task4Countries);
        Collections.sort(task4Countries);
        System.out.println(task4Countries);

        System.out.println("\n------------task-5------------\n");
        ArrayList<String> task5Marvels = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));
        System.out.println(task5Marvels);
        boolean containsWolwerine = false;
        for(String marvel : task5Marvels) {
            if (marvel.contains("Wolwerine")) {
            containsWolwerine = true;
            break;
            }
        }
        System.out.println(containsWolwerine);

        System.out.println("\n------------task-6------------\n");
        ArrayList<String> task6Avengers = new ArrayList<>();
        task6Avengers.add("Hulk");
        task6Avengers.add("Black Widow");
        task6Avengers.add("Captain America");
        task6Avengers.add("Iron Man");
        System.out.println(task6Avengers);
        boolean containsHulk = false;
        boolean containsIronMan = false;
        for (String avenger : task6Avengers) {
            if (!containsIronMan && avenger.contains("Iron Man"))containsIronMan = true;
            if (!containsHulk && avenger.contains("Hulk"))containsHulk = true;
        }
        System.out.println(containsIronMan && containsHulk);

        System.out.println("\n------------task-7------------\n");
        ArrayList<Character> task7Chars = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));
        System.out.println(task7Chars);
        for (Character chars : task7Chars) {
            System.out.println(chars);
        }

        System.out.println("\n------------task-8------------\n");
        int countM = 0;
        int countAE = 0;

        ArrayList<String> task7Objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(task7Objects);
        Collections.sort(task7Objects);
        System.out.println(task7Objects);

        for (String object : task7Objects) {
            if (object.toLowerCase().startsWith("m"))countM++;
            if (!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e"))countAE++;
        }

        System.out.println(countM);
        System.out.println(countAE);

        System.out.println("\n------------task-9------------\n");
        ArrayList<String> task8Kitchen = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(task8Kitchen);
        int uppercase = 0;
        int lowercase = 0;
        int containsP = 0;
        int startsEndWithP = 0;

        for (String kitchen : task8Kitchen){
            if (Character.isUpperCase(kitchen.charAt(0)))uppercase++;
            else if (Character.isLowerCase(kitchen.charAt(0)))lowercase++;
            if (kitchen.toLowerCase().contains("p"))containsP++;
            if (kitchen.toLowerCase().startsWith("p") || kitchen.toLowerCase().endsWith("p"))startsEndWithP++;
        }
        System.out.println("Elements starts with uppercase = " + uppercase);
        System.out.println("Elements starts with lowercase = " + lowercase);
        System.out.println("Elements having P or p= " + containsP);
        System.out.println("Elements starting or ending with P or p = " + startsEndWithP);

        System.out.println("\n------------task-10------------\n");
        ArrayList<Integer> task10Numbers = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        int divided10 = 0;
        int evenGreater15 = 0;
        int oddLess20 = 0;
        int less15Greater50 = 0;

        System.out.println(task10Numbers);
        for (int num : task10Numbers){
            if (num % 10 == 0)divided10++;
            if (num > 15 && num % 2 == 0)evenGreater15++;
            if (num % 2 == 1 && num < 20)oddLess20++;
            if (num < 15 || num > 50)less15Greater50++;
        }
        System.out.println("Elements that can be divided by 10 = " + divided10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreater15);
        System.out.println("Elements that are odd and less than 20 = " + oddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Greater50);













    }
}
