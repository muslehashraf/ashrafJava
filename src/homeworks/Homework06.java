package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n-----------------Task-1------------\n");

        int[] task1Numbers = new int[10];

        task1Numbers[2] = 23;
        task1Numbers[4] = 12;
        task1Numbers[7] = 34;
        task1Numbers[9] = 7;
        task1Numbers[6] = 15;
        task1Numbers[0] = 89;

        System.out.println(task1Numbers[3]);
        System.out.println(task1Numbers[0]);
        System.out.println(task1Numbers[9]);
        System.out.println(Arrays.toString(task1Numbers));


        System.out.println("\n-----------------Task-2------------\n");

        String[] task2Words = new String[5];

        task2Words[1] = "abc";
        task2Words[4] = "xyz";

        System.out.println(task2Words[3]);
        System.out.println(task2Words[0]);
        System.out.println(task2Words[4]);

        System.out.println(Arrays.toString(task2Words));


        System.out.println("\n-----------------Task-3------------\n");

        int[] task3Numbers = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(task3Numbers));
        Arrays.sort(task3Numbers);
        System.out.println(Arrays.toString(task3Numbers));

        System.out.println("\n-----------------Task-4------------\n");

        String[] task4Countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(task4Countries));
        Arrays.sort(task4Countries);
        System.out.println(Arrays.toString(task4Countries));

        System.out.println("\n-----------------Task-5------------\n");

        String[] task5Cartoons = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(task5Cartoons));

        boolean containsPluto = false;
        for (String cartoon : task5Cartoons){
            if (!containsPluto && cartoon.contains("Pluto"))containsPluto = true;
        }
        System.out.println(containsPluto);


        System.out.println("\n-----------------Task-6------------\n");

        boolean containsFelix = false;
        boolean containsGarfield = false;

        String[] task6Cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(task6Cats);
        System.out.println(Arrays.toString(task6Cats));

        for (String cat : task6Cats){
            if (!containsFelix && cat.contains("Felix"))containsFelix = true;
        }
        for (String cat : task6Cats){
            if (!containsGarfield && cat.contains("Garfield"))containsGarfield = true;
        }

        System.out.println(containsFelix && containsGarfield);


        System.out.println("\n-----------------Task-7------------\n");

        double[] task7numbers = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(task7numbers));

        for (double number : task7numbers){
            System.out.println(number);
        }

        System.out.println("\n-----------------Task-8-----------\n");

        char[] task8Chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(task8Chars));

        int task8LetterCount = 0;
        int task8UppercaseCount = 0;
        int task8LowercaseCount = 0;
        int task8digitsCount = 0;
        int task8specialsCount = 0;

        for (char character : task8Chars){
            if (Character.isLetter(character)) {
                task8LetterCount++;
                if (Character.isUpperCase(character)) task8UppercaseCount++;
                else if (Character.isLowerCase(character)) task8LowercaseCount++;
            }
            else if (Character.isDigit(character))task8digitsCount++;
            else task8specialsCount++;
        }

        System.out.println("Letter = " + task8LetterCount);
        System.out.println("Uppercase letters = " + task8UppercaseCount);
        System.out.println("Lowercase letters = " + task8LowercaseCount);
        System.out.println("digits = " + task8digitsCount);
        System.out.println("Special = " + task8specialsCount);


        System.out.println("\n-----------------Task-9-----------\n");

        String[] task9Objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(task9Objects));

        int task9Uppercase = 0;
        int task9Lowercase = 0;
        int task9BOrP = 0;
        int task9Contains = 0;

        for (String object : task9Objects){
            if (object.charAt(0) >= 65 && object.charAt(0) <= 90)task9Uppercase++;
            else if (object.charAt(0) >= 97 && object.charAt(0) <= 122)task9Lowercase++;
            if (object.charAt(0) == 'b' || object.charAt(0) == 'B' || object.charAt(0) == 'p' || object.charAt(0) == 'P')task9BOrP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen"))task9Contains++;
        }
        System.out.println("Elements starts with uppercase = " + task9Uppercase);
        System.out.println("Elements starts with lowercase = " + task9Lowercase);
        System.out.println("Elements starting with B or P = " + task9BOrP);
        System.out.println("Elements having \"book\" or \"pen\"= " + task9Contains);

        System.out.println("\n-----------------Task-10-----------\n");

        int[] task10Numbers = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        int moreCounter = 0;
        int lessCounter = 0;
        int equalCounter = 0;

        for (int number : task10Numbers){
            if (number > 10)moreCounter++;
            else if (number < 10)lessCounter++;
            else equalCounter++;
        }
        System.out.println("Elements that are more than 10 = " + moreCounter);
        System.out.println("Elements that are less than 10 = " + lessCounter);
        System.out.println("Elements that are 10 = " + equalCounter);

        System.out.println("\n-----------------Task-11-----------\n");

        int[] firstNumbers = {5, 8, 13, 1, 2};
        int[] secondNumbers = {9, 3, 67, 1, 0};
        int[] thirdNumbers = new int[5];

        for (int i = 0; i < firstNumbers.length; i++) {
            thirdNumbers[i] = Math.max(firstNumbers[i], secondNumbers[i]);
        }

        System.out.println("1st array is = " + Arrays.toString(firstNumbers));
        System.out.println("2nd array is = " + Arrays.toString(secondNumbers));
        System.out.println("3rd array is = " + Arrays.toString(thirdNumbers));
    }
}
