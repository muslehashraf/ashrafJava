package notes_java;

public class _09_10_2022_Java_Variables_String_Scanner {
    /*
            Variables: container to store a piece of data
        dataType 	variableName 	value
        int age = 21;
        String name = "John";
        Variable declaration
        dataType variableName;
        Variable assignment
        variableName = value;
        Variable declaration and assignment
        dataType variableName = value;
        Variable naming
        -meaningful
        -starts with lowercase
        -follows camelcase rule
        -no spaces
        -digits are allowed to be used in the variable names unless it is first letter of the variable
        - $ (dollar sign) and _ (under score) can be used in variable names and even as the first letter
        NOTE: any special character cannot be used in variable names except the _ and $ and other money currencies
        NOTE: A variable name cannot be a reserved keyword by Java (public or class)
        String SSN = "";
        String DOB = "";
        Class != class
        int age; 					-> true
        byte AGE; 					-> true
        short shift$; 				-> true
        byte number of students; 	-> false
        char _firstLetter; 			-> true
        int 8students; 				-> false
        boolean isWheatherSnowing#; -> false
        double @balance; 			-> false
        = is known as assignment operator
        == is known comparison operator
        'a' == 'A'
        boolean b1, b2; 			-> true
        int i1 = 45, i2; 			-> true
        double d1, double d2; 		-> false
        byte b1; byte b2; 			-> true
        int i3; i4; 				-> false
        Data Types
        1. Primitives
        2. Reference types - objects
            String - Array - Collections, Exceptions, Custom objects
        String:
        -it is used to store a sequence of characters
        -it is an object
        String name = "John";
        String greeting = "Good" + " " + "morning!";
        System.out.println("The name is = " + name);
        The name is = John
        String city; // declaration
        city = "Chicago"; // assignment
        String concatenation = forming a new string that is the combination of multiple strings
        There are 2 ways of string concatenation in java
        1. by “+” operator
        2. by concat() method
        Pseudo Code
        -English like statements known as pseudo code
        -A flowchart which is a graphical representation of your program
        -Pseudo is a detailed description of what a computer program must do, expressed in an English like language than in a programming language
        Array -> 10 names
        String name = "John";
        String[] names = {"Alex", "Ali", "Mike"};
        PSEDUO CODE FOR HAVING A COFFEE AT TECHGLOBAL
        -Go to kitchen
        -Pick your coffee
        -Get a cup
        -Get your cup and coffee set in the machine
        -Push the button to start brewing
        -Enjoy your coffee
        -Create 2 strings to store fName and lName
        -Create third string and store both fName and lName concatenated
        -print the third string with a print statement
        Scanner
        -Both next() and nextLine() are used to read strings from the user
            DIFFERENCE
            next() 		-> gets only one word
            nextLine() 	-> whole line
            nextInt()   -> next int
        + operator
        "abc" + "xyz"  	-> abcxyz
        1 + 3 			-> 4
        "12" + 3 		-> "123"
        "5" + 2 + 3 	-> "523"
        "5" + (2 + 3)   -> "55"
        1 + 2 + 4 + "55" -> "755"
        "2" + "2" + "2"  -> "222"
        ATTENTION!!!!
        Stay away from Scanner methods that have has in it.
        Whenever you used one of the below method
            next();
            nextInt();
            nextDouble();, AND
            you will need to use nextLine() after these
            THEN, make sure to provide an empty line first
        Scanner scan = new Scanner(System.in);
     */
}
