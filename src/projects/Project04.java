package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

public class Project04 {
    public static void main(String[] args) {


        System.out.println("\n---------------Task-1------------\n");

        String str = ScannerHelper.getAString();

        if (str.length() < 8) System.out.println("This String does not have 8 characters");
        else System.out.println(str.substring(str.length() - 4, str.length()) + str.substring(4,str.length() - 4) + str.substring(0,4));


        System.out.println("\n---------------Task-2------------\n");

        String sentence = ScannerHelper.getASentence().trim();

        int firstWordEnd = 0;
        int lastWordStart = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                firstWordEnd += i;
                break;
            }
        }
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) == ' '){
                lastWordStart += i;
                break;
            }
        }

        String modifiedString = str.substring(lastWordStart) + str.substring(firstWordEnd, lastWordStart + 1) + str.substring(0, firstWordEnd);
        System.out.println(modifiedString);



        System.out.println("\n---------------Task-3------------\n");

        String str2 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        if (str2.toLowerCase().contains("stupid") && str2.toLowerCase().contains("idiot")) {
            str2 = str2.replace("stupid", "nice");
            str2 = str2.replace("idiot", "nice");

        }
        else if (str2.toLowerCase().contains("stupid")){
            str2 = str2.replace("stupid", "nice");

        }
        else if (str2.toLowerCase().contains("idiot")){
            str2 = str2.replace("idiot", "nice");

        }
        System.out.println(str2);



        System.out.println("\n---------------Task-4------------\n");

        String name = ScannerHelper.getAName();

        if (name.length() < 2) System.out.println("Invalid input!!!");

        else{
            if (name.length() % 2 == 1) System.out.println(name.charAt(name.length() / 2));

            else System.out.println(name.substring(name.length() / 2 - 1 , name .length() / 2 + + 1));
        }


        System.out.println("\n---------------Task-5------------\n");

        String country = ScannerHelper.getACountry();

        if (country.length() <= 5) System.out.println("Invalid input!!!");
        else System.out.println(country.substring(2, country.length() - 2));


        System.out.println("\n---------------Task-6------------\n");

        String address = ScannerHelper.getAnAddress();

        address = address.replace("a", "*");
        address = address.replace("A", "*");
        address = address.replace("e", "#");
        address = address.replace("E", "#");
        address = address.replace("u", "$");
        address = address.replace("U", "$");
        address = address.replace("o", "@");
        address = address.replace("O", "@");
        address = address.replace("i", "+");
        address = address.replace("I", "+");

        System.out.println(address);

        System.out.println("\n---------------Task-7------------\n");

        int ran1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int ran2 = RandomNumberGenerator.getARandomNumber(0, 25);

        int maxRan = Math.max(ran1, ran2);
        int minRan = Math.min(ran1, ran2);

        String numbers = "";

        for (int i = minRan; i <= maxRan; i++) {
            if (i % 5 != 0)numbers += i + " - ";
        }

        System.out.println(numbers.substring(0,numbers.length() - 3));


        System.out.println("\n---------------Task-8------------\n");

        String sentence1 = ScannerHelper.getASentence().trim();

        int spaceCounter = 0;

        for (int i = 0; i < sentence1.length(); i++){
            if (sentence1.charAt(i) == ' ')spaceCounter++;
        }
        if (spaceCounter == 0) System.out.println("This sentence1 does not have multiple words");
        else System.out.println("This sentence1 has " + (spaceCounter + 1) + " words");


        System.out.println("\n---------------Task-9------------\n");

        int num1 = ScannerHelper.getAPositiveNumber();

        for (int i = 1; i <= num1; i++){
            if (i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }



        System.out.println("\n---------------Task-10------------\n");

        String word = ScannerHelper.getAWord().trim();
        String reverseWord = "";

        if (word.length() == 0) System.out.println("This word does not have 1 or more characters");
        else {
            for (int i = word.length() - 1; i >= 0; i--){
                reverseWord += word.charAt(i);
            }
            if (word.equals(reverseWord)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        }




        System.out.println("\n---------------Task-11------------\n");

        String sentence2 = ScannerHelper.getASentence().trim();

        int letterACounter = 0;
        if (sentence2.length() == 0) System.out.println("This sentence1 does not have any characters.");
        else {
            for (int i = 0; i < sentence2.length(); i++) {
                if (sentence2.charAt(i) == 'a' || sentence2.charAt(i) == 'A')letterACounter++;
            }
            System.out.println("This sentence1 has " + letterACounter + " a or A letters.");
        }









    }
}
