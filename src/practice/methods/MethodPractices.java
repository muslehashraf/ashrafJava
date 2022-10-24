package practice.methods;

public class MethodPractices {
    public static void main(String[] args) {
//        System.out.println();
//        printStringDesc("John");
//        System.out.println();
//        printStringDesc("");
//        System.out.println();
//        printStringDesc("JavaScript");
//        System.out.println();
//        printStringDesc("Scrpt");

        MethodPractices.printMiddle("toyota"); // yo
        MethodPractices.printMiddle("civic"); // v
        MethodPractices.printMiddle("ci"); // Length is less than 3"
        MethodPractices.printFirstLastMiddle("Java");
        MethodPractices.printIsFirstLastTwoSame("xyzabc");
    }

    /*
      is empty -> "Length is zero"
      else
          print the length
          print the first char
          print the last char
          check if it has vowels
       */
    public static void printStringDesc(String str) {

        // "JavaScript",  some action --> 't' index 9, length 10
        // "Java",  some action --> 'a' index 3, length 4

        if (str.isEmpty()) {
            System.out.println("Length is zero");
        } else {
            System.out.println("Length is = " + str.length() +
                    "\nFirst char is = " + str.charAt(0) +
                    "\nLast char is = " + str.charAt(str.length() - 1)//str.substring(str.length() -1)
            );

            // a, e, i, o, u, A, E, I, O, U
//            if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
//            || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
//                System.out.println("This String has vowel");
//            }else{
//                System.out.println("This String doesn't have vowel");
//            }
            MethodPractices.printHasVowel(str);
        }
    }

    public static void printHasVowel(String str) {
        // a, e, i, o, u, A, E, I, O, U
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
                || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) {
            System.out.println("This String has vowel");
        } else {
            System.out.println("This String doesn't have vowel");
        }
    }

    public static void printMiddle(String str) {
        if (str.length() < 3) {
            System.out.println("Length is less than 3");
        } else {
            /*
            if the length is even get the middle 2 chars
            else get the middle char
             */
            if (str.length() % 2 == 0) { // toyota -> yo - 2,3 == length 6  | length /2 - 1 = 2
                System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1)); // 2, 4
            } else { // civic -> v - 2 == length 5  | length /2 = 2
                System.out.println(str.charAt(str.length() / 2));
            }
        }
    }
    public static void printFirstLastMiddle(String str){
        if (str.length() < 4) System.out.println("INVALID INPUT");

        else {
            System.out.println("First 2 characters are = " + str.substring(0,2));
            System.out.println("last 2 characters are = " + str.substring(str.length() - 2));
            System.out.println("The other characters are = " + str.substring(2, str.length() - 2));
        }
    }
    public static void printIsFirstLastTwoSame(String str){

        if (str.length() < 2) System.out.println("Length is less than 2");
        else {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2))){
                System.out.println(true);
            }
            else System.out.println(false);
        }
    }





}
