package notes_java;

public class _09_17_2022_Casting {
    /*
            var keyword in Java
        -It became a part of Java since Java version 10
        var age = 25; // int
        var c1 = 'A'; // char
        var name = "John"; // String
        var input = new Scanner(System.in); // Scanner
        Casting is known as assigning value of one primitive data type into another
        There are 2 types of casting in Java
        1. Implicit casting - automatically
            byte -> int
            int -> long
        2. Explicit casting
            int -> short
            double -> float
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
        Narrowing Casting (manually - explicitly) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        Casting Characters
        -Casting from char to int, long, float and double can happen implicitly
        -Casting from char to byte or short can happen explicitly
        -Casting from any data type to char can happen explicitly
        -When char is used in casting with numeric data types, it will give decimal value of the character from ASCII table
        -boolean can not be used for casting with any data type
        primitive + String 		-> String
        String + primitive 		-> String
        p + p + S 				-> number String
        'A' + "" + 'a' 			-> Aa
        p + p + p + S + p + p + p 	->
        1 + 1 + 1 + "" + 1 + 1 + 1  -> 3111
        1 + 1 + 1 + "" + (1 + 1 + 1)-> 33
        Converting primitives to String
        -We can convert any data type to a String
        -Using + (concatenation), will convert any data type to a String
        -Or String.valueOf(variable) can be used
        Example:
            int age = 45;
            String stringAge1 = age + “”;      //”” is known as empty String
            String stringAge2 = String.valueOf(age);
        23 		-> "23"
        50 		-> "50"
        String.valueOf(50) -> "50"
        System.out.println(String.valueOf(23) + 5);
        a. compiler error
        b. 28
        c. 235
        d. runtime error
        Wrapper classes - There are of 8 of them
        Primitive 		Wrapper class
        byte 			Byte
        short 			Short
        int 			Integer
        long 			Long
        float 			Float
        double 			Double
        boolean 		Boolean
        char 			Character
        -Wrapper classes are object representation of primitives
        -For each primitive type, there is Wrapper class
        -Wrapper class names are usually same as with primitive data types but starts with upper case
        -Wrapper classes can do everything that their primitives do and they also provide many useful methods to manipulate data
        Scanner, System, String, Math
        Autoboxing and unboxing
        -This is about wrapper classes to be converted to their primitives and visa versa
        -Autoboxing is known as storing primitive type into an object/wrapper class
        int i1 = 25;
        Integer i2 = i1; // Autoboxing
        -Unboxing-boxing is known as storing object/wrapper class into primitive
        Double d1 = 10.5;
        double d2 = d1; // Unboxing
        parse vs valueOf methods
        -parse methods return primitive
        -valueOf methods return wrapper object
     */
}
