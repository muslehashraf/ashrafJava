package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("----------Task-1----------");
        String task1TD1 = "JAVA";
        String task1TD2 = "";
        String task1TD3 = "hello";
        String task1TD4 = "123$";
        System.out.println(hasLowerCase(task1TD1));
        System.out.println(hasLowerCase(task1TD2));
        System.out.println(hasLowerCase(task1TD3));
        System.out.println(hasLowerCase(task1TD4));

        System.out.println("\n----------Task-2----------");
        ArrayList<Integer> task2TD1 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> task2TD2 = new ArrayList<>(Arrays.asList(1, 1, 10));
        ArrayList<Integer> task2TD3 = new ArrayList<>(Arrays.asList(0, 1, 10));
        ArrayList<Integer> task2TD4 = new ArrayList<>(Arrays.asList(0, 0, 0));
        System.out.println(noZero(task2TD1));
        System.out.println(noZero(task2TD2));
        System.out.println(noZero(task2TD3));
        System.out.println(noZero(task2TD4));

        System.out.println("\n----------Task-3----------");
        int[] task3TD1 = {1, 2, 3};
        int[] task3TD2 = {0, 3, 6};
        int[] task3TD3 = {1, 4};
        System.out.println(Arrays.deepToString(numberAndSquare(task3TD1)));
        System.out.println(Arrays.deepToString(numberAndSquare(task3TD2)));
        System.out.println(Arrays.deepToString(numberAndSquare(task3TD3)));

        System.out.println("\n----------Task-4----------");
        String[]  arrTask3TD1 = {"abc", "foo", "java"};
        String[]  arrTask3TD2 = {"abc", "def", "123"};
        String[]  arrTask3TD3 = {"abc", "def", "123", "Java", "Hello"};
        String strTask4TD1= "hello";
        String strTask4TD2= "Abc";
        String strTask4TD3= "123";
        System.out.println(containsValue(arrTask3TD1, strTask4TD1));
        System.out.println(containsValue(arrTask3TD2, strTask4TD2));
        System.out.println(containsValue(arrTask3TD3, strTask4TD3));

        System.out.println("\n----------Task-5----------");
        String Task5TD1= "Hello";
        String Task5TD2= "Java is fun";
        String Task5TD3= "This is a sentence";
        System.out.println(reverseSentence(Task5TD1));
        System.out.println(reverseSentence(Task5TD2));
        System.out.println(reverseSentence(Task5TD3));

        System.out.println("\n----------Task-6----------");
        String Task6TD1= "123Java #$%is fun";
        String Task6TD2= "Selenium";
        String Task6TD3= "Selenium 123#$%Cypress";
        System.out.println(removeStringSpecialsDigits(Task6TD1));
        System.out.println(removeStringSpecialsDigits(Task6TD2));
        System.out.println(removeStringSpecialsDigits(Task6TD3));

        System.out.println("\n----------Task-7----------");
        String[]  Task7TD1 = {"123Java", "#$%is", "fun"};
        String[]  Task7TD2 = {"Selenium", "123$%", "###"};
        String[]  Task7TD3 = {"Selenium", "123#$%Cypress"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(Task7TD1)));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(Task7TD2)));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(Task7TD3)));

        System.out.println("\n----------Task-7----------");
        ArrayList<String>  Task7TD1Arr1 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        ArrayList<String>  Task7TD1Arr2 = new ArrayList<>(Arrays.asList("abc", "xyz", "123"));
        ArrayList<String>  Task7TD2Arr1 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        ArrayList<String>  Task7TD2Arr2 = new ArrayList<>(Arrays.asList("Java", "C#", "Python"));
        ArrayList<String>  Task7TD3Arr1 = new ArrayList<>(Arrays.asList("Java", "C#", "C#"));
        ArrayList<String>  Task7TD3Arr2 = new ArrayList<>(Arrays.asList("Python", "C#", "C++"));
        System.out.println(removeAndReturnCommons(Task7TD1Arr1, Task7TD1Arr2));
        System.out.println(removeAndReturnCommons(Task7TD2Arr1, Task7TD2Arr2));
        System.out.println(removeAndReturnCommons(Task7TD3Arr1, Task7TD3Arr2));

        System.out.println("\n----------Task-8----------");
        ArrayList<String>  Task8TD1 = new ArrayList<>(Arrays.asList("abc", "123", "#$%"));
        ArrayList<String>  Task8TD2 = new ArrayList<>(Arrays.asList("xyz", "123", "#$%"));
        ArrayList<String>  Task8TD3 = new ArrayList<>(Arrays.asList("x", "123", "#$%"));
        ArrayList<String>  Task8TD4 = new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"));
        System.out.println(noXInVariables(Task8TD1));
        System.out.println(noXInVariables(Task8TD2));
        System.out.println(noXInVariables(Task8TD3));
        System.out.println(noXInVariables(Task8TD3));
        System.out.println(noXInVariables(Task8TD4));
    }


    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> noZero(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (num != 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static int[][] numberAndSquare(int[] numbers) {
        int[][] result = new int[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            result[i][0] = numbers[i];
            result[i][1] = numbers[i] * numbers[i];
        }
        return result;
    }

    public static boolean containsValue(String[] array, String value) {
        int index = Arrays.binarySearch(array, value);
        return index >= 0;
    }

    public static String reverseSentence(String str) {
        String result = "";
        if (!str.trim().contains(" ")) result = "There is not enough words!";
        else{
            for(int i = str.split(" ").length-1; i >= 0; i--){
                result += str.split(" ")[i] + " ";
            }
            result = result.substring(0, result.length()-1);
            result = result.substring(0, 1).toUpperCase() + result.substring(1, result.lastIndexOf(" ") + 1) +
                    result.substring(result.lastIndexOf(" ") + 1).toLowerCase();
        }
        return result;
    }

    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^a-zA-Z ]", "");
    }

    public static String[] removeArraySpecialsDigits(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replaceAll("[^a-zA-Z ]", "");
        }
        return array;
    }

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> commons = new ArrayList<>();
        for (String s : list1) {
            if (list2.contains(s)){
                commons.add(s);
                list2.remove(s);
            }
        }
        return commons;
    }

    public static ArrayList<String> noXInVariables(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            if (!s.equalsIgnoreCase("x")) {
                result.add(s.replaceAll("[xX]", ""));
            }
        }
        return result;
    }
}
