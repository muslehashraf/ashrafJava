package notes_java;

public class _09_18_2022_RECAPCasting {
    /*
            -Casting happens bt primitives and it is known as assigning one value of primitive into another
        Casting types bt primitives
        1. Implicit - widening - upcasting
            -it happens automatically
            -does not require any programmer effort
            byte b = 45;
            int i = b; // implicitly happening
            double d = i; // implicitly happening
        2. Explicit - narrowing - down-casting
            -it has to be done manually by programmer
            double d = 10;
            int i = (int) d;
        Upcasting   -> byte-short-char-int-long-float-double
        down-casting -> double-float-long-int-char-short-byte
        CASTING CHARACTERS
        char to int
        char c = 'A';
        int i = c; // implicit casting
        System.out.println(i); // 65
        int to char
        int n = 97;
        char c = (char) n; // explicit casting
        System.out.println(c); // a
        char c1 = 66; // B
        char c2 = 98; // b
        char c3 = 3000; // a character
        int i1 = 'A'; // 65
        int i2 = 'b'; // 98
        CONVERTING PRIMITIVES TO STRING AND VISA VERSA
        PRIMITIVES TO STRING
        1. concatenation
        2. String.valueOf(primitive);
        int i = 45;
        "" + i + 3 				-> "453"
        i + 3 					-> 48
        "" + i 					-> "45"
        String.valueOf(i) + 5	-> "455"
        STRING TO PRIMITIVE
        -We can convert String to primitives using Wrapper classes and their parse or valueOf methods
        String s = "45";
        Double.parseDouble(s) + 5 		-> 50.0
        Integer.parseInt(s) + 5 		-> 50
        Double.valueOf(s) + 5 			-> 50.0
        Integer.valueOf(s) + 5 			-> 50
        Wrapper -> primitive 		-> unboxing or boxing
        primitive -> Wrapper 		-> autoboxing
        Autoboxing
        byte b = 23;
        Byte bb = b;
        Unboxing - boxing
        Boolean b = true;
        boolean bb = b;
     */
}
