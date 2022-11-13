package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\n================Task1================");
        String[] task1 = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(task1));

        System.out.println("\n================Task2================");
        ArrayList<Integer> task2 = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(task2));

        System.out.println("\n================Task3================");
        String task3 = "Abcd123!";
        System.out.println(validatePassword(task3));

        System.out.println("\n================Task4================");
        String task4 = "abcd@gmail.com";
        System.out.println(validateEmailAddress(task4));

    }

    public static int countMultipleWords(String[] array){

        int multipleWord = 0;
        for (String str : array) {
        Pattern pattern = Pattern.compile("[ ]");
        Matcher matcher = pattern.matcher(str.trim());
        if(matcher.find()){
            multipleWord++;
            continue;
        }
        }

        return multipleWord;
    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){

        for(int i = numbers.size() - 1; i >= 0; i--) {
            Pattern pattern = Pattern.compile("-");
            Matcher matcher = pattern.matcher(numbers.get(i).toString());
            if (matcher.find()) {
                numbers.remove(numbers.get(i));
            }
        }

        return numbers;
    }

    public static boolean validatePassword(String password){


        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,16}");
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
    public static boolean validateEmailAddress(String email){

        Pattern pattern = Pattern.compile("\\S[a-z]{2,}@[a-z]{2,}.[a-z]{2,}");
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }















}
