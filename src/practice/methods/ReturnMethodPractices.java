package practice.methods;

import utilities.MathHelper;

public class ReturnMethodPractices {
    public static void main(String[] args) {

    }
    /*
    Create a public static method named as "findDifference" it will take two values and returns the difference

    Example:
    6, 9 -> 3
    4, 1 -> 3
    99, 23 -> 76
     */

    public static int findDifference(int num1, int num2){
        return Math.abs(num1 - num2);
    }
    /*
    Create a public static method named as "findDifference" it will take two decimal values and returns
    the positive difference

    Example:
    6, 9 -> 3
    4, 1 -> 3
    99, 23 -> 76
     */
    public static double findDifference(double double1, double double2){
    return Math.abs(double1 - double2);
    }
    /*

    Create a public static method named as "isIncluded" which takes two String values, and return true if
    the small string is inside the other one. NOTE: You have to check which string is bigger than check if
    it is included.

    Example:
    "John", "John Doe" -> true
    "green, blue, red", "blue" -> true
    "John", "blue" -> false
     */
    public static boolean isIncluded(String str1, String str2){
        // is str1 containing str2 OR str2 containing str1
        return str1.contains(str2) || str2.contains(str1);
        // if(str1.length() > str2 .length()) return str1.contains(str2);
        // else return str2.contains(str1);

    }




}
