package notes_java;

public class _09_18_2022_ConditionalStatements {
            /*
            if else statements
        RECAP: Casting
        -Casting happens bt primitives and it is known as assigning one value of primitive into another
        Casting types bt primitives
        1. Implicit - widening - upcasting
            -it happens automatically
            -does not require any programmer effort
            byte b = 45;
            int i = b; // implicitly happening
            double d = i; // implicitly happening
        2. Explicit - narrowing - downcasting
            -it has to be done manually by programmer
            double d = 10;
            int i = (int) d;
        Upcasting   -> byte-short-char-int-long-float-double
        downcasting -> double-float-long-int-char-short-byte
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
        Conditional Statements
        - we are talking about if and else
        boolean feelingGood = ___;
        if(feelingGood){
            //go to school
        }
        else{
            //watch online
        }
        int age = ____;
        if(age >= 21){
            //Welcome
        }
        else{
            //have your milk
        }
        int yearOfBirth = ___;
        if(currentYear - yearOfBirth > 15){
            //Allow user to continue with their application for DL
        }
        else{
            //You are not there yet
        }
        boolean isUserNameValid = ____;
        if(isUserNameValid){
            //Take user to password input box
            boolean isPasswordValid = ____;
            if(isPasswordValid){
                //Allow user to be logged in and take them to the Home Page
            }
            else{
                //Show "There was a problem" and make them enter password again
            }
        }
        else{
            //Show "There was a problem" and make them enter username again
        }
        - if or else statements are used to control the flow of the program based on conditions
        - conditions are always boolean statements (true or false)
        - if block can be used without else block
        - else block CAN NEVER be used without if
        num % 2 == 0 	-> number can be divided by 2 - EVEN
        num % 2 != 1 	-> EVEN
        num % 2 != 0    -> ODD
        num % 2 == 1 	-> ODD
        EVEN -> -4, -2, 0, 2, 10, 12, 100
        ODD  -> -77, -45, -1, 1, 3, 77, 103
        ***EDGE CASES
        50-50 either or
        if(condition){

        }
        else{

        }
        if - else if - else ladder statement
        Positive - negative - neutral
        int num = ___;
        if(num > 0){
            //positive
        }
        else if(num < 0){
            //negative
        }
        else{
            //zero
        }
        if(monday){
            //Blue
        }
        else if(Tuesday){
            //Green
        }
        else if(Wednesday){
            //Yellow
        }
        else if(Thursday){
            //Pink
        }
        else if(Friday){
            //Red
        }
        else{
            //Free
        }
        if(free){
            //Visit friends
        }
        else if(cinema){
            //go to movie
        }
        else{
            //stay at home
        }
             */
}
