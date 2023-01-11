package homeworks;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println("----------Task-1----------");
        int task1TD1 = 3;
        int task1TD2 = 5;
        int task1TD3 = 18;
        fizzBuzz1(task1TD1);
        fizzBuzz1(task1TD2);
        fizzBuzz1(task1TD3);

        System.out.println("----------Task-2----------");
        int task2TD1 = 0;
        int task2TD2 = 1;
        int task2TD3 = 3;
        int task2TD4 = 5;
        int task2TD5 = 15;
        System.out.println(fizzBuzz2(task2TD1));
        System.out.println(fizzBuzz2(task2TD2));
        System.out.println(fizzBuzz2(task2TD3));
        System.out.println(fizzBuzz2(task2TD4));
        System.out.println(fizzBuzz2(task2TD5));


        System.out.println("\n----------Task-3----------");
        String task3TD1 = "abc$";
        String task3TD2 = "a1b4c  6#";
        String task3TD3 = "ab110c045d";
        String task3TD4 = "525";
        System.out.println(findSumNumbers(task3TD1));
        System.out.println(findSumNumbers(task3TD2));
        System.out.println(findSumNumbers(task3TD3));
        System.out.println(findSumNumbers(task3TD4));

        System.out.println("\n----------Task-4----------");
        String task4TD1 = "abc$";
        String task4TD2 = "a1b4c  6#";
        String task4TD3 = "ab110c045d";
        String task4TD4 = "525";
        System.out.println(findBiggestNumber(task4TD1));
        System.out.println(findBiggestNumber(task4TD2));
        System.out.println(findBiggestNumber(task4TD3));
        System.out.println(findBiggestNumber(task4TD4));

        System.out.println("\n----------Task-5----------");
        String task5TD1 = "";
        String task5TD2 = "abc";
        String task5TD3 = "abbcca";
        String task5TD4 = "aaAAa";
        System.out.println(countSequenceOfCharacters(task5TD1));
        System.out.println(countSequenceOfCharacters(task5TD2));
        System.out.println(countSequenceOfCharacters(task5TD3));
        System.out.println(countSequenceOfCharacters(task5TD4));
    }

    public static void fizzBuzz1(int num){
        for (int i = 1; i <= num; i++){
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static String fizzBuzz2(int num){
        if (num % 15 == 0) return "FizzBuzz";
        else if(num % 3 == 0) return "Fizz";
        else if(num % 5 == 0) return "Buzz";

        return "" + num;
    }





    public static int findSumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(str.charAt(i));
                    i++;
                }
                sum += num;
            }
        }
        return sum;
    }

    public static int findBiggestNumber(String str) {
        int biggestNumber = 0;
        String currentNumber = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber += currentChar;
                int currentValue = Integer.parseInt(currentNumber);

                if (currentValue > biggestNumber) {
                    biggestNumber = currentValue;
                }
            } else {
                currentNumber = "";
            }
        }

        return biggestNumber;
    }

    public static String countSequenceOfCharacters(String input) {
        if (input.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char current = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == current) {
                count++;
            } else {
                result.append(count).append(current);
                current = input.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(current);
        return result.toString();
    }
}
