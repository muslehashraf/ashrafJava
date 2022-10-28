package notes_java;

public class _10_22_2022_ArraysPart_1 {
    /*
            10/22/2022 - Arrays Part 1

        RECAP:

        Character class:
        -It is Java class that provides some methods to define the character as digit, letter, spaceChar

        -All methods that it provides are:
            -static
            -return type
            -returning boolean
            -take an argument as a char


        char c1 = ' ';

        Character.isDigit(c1); // false
        Character.isLetter(c1); // false
        Character.isSpaceChar(c1); // true



        isSpaceChar() is same as isWhitespace()


        String address = "123 ABC St #2 Chicago IL 60000";

        Character.isLetter(address); // compiler error

        EXPECTED OUTPUT:
        uppercase: 7
        lowercase: 7
        letter: 14
        digits: 9
        spaces: 6
        specials: 1


        int uppercase = 0;
        int lowercase = 0;
        int letter = 0;
        int digit = 0;
        int space = 0;
        int special = 0;

        for(int i = 0; i < address.length(); i++){
            if(Character.isLetter(address.charAt(i))){
                letter++;
                if(Character.isUpperCase(address.charAt(i))){
                    uppercase++;
                }
                else{
                    lowercase++;
                }
            }
            else if(Character.isDigit(address.charAt(i))){
                digit++;
            }
            else if(Character.isSpaceChar(address.charAt(i))){
                space++;
            }
            else{
                special++;
            }
        }


        String name1 = "James", name2 = "Isabella";

        TASK: Find which name has more a or A

        1. count how many a in name1
        2. count how many a in name2
        3. compare them and print your result

        int countName1 = 0;
        int countName2 = 0;

        for(int i = 0; i < name1.length(); i++){
            if(name1.toLowerCase().charAt(i) == 'a') countName1++;
        }

        for(int i = 0; i < name2.length(); i++){
            if(name2.toLowerCase().charAt(i) == 'a') countName2++;
        }


        if(countName1 > countName2){
            sout(name1 + " has more a in it: " + countName1);
        }
        else{
            sout(name2 + " has more a in it: " + countName2);
        }



        Arrays:
        -it is collection that allows us to store multiple similar data

        SYNTAX:
        dataType[] variableName = {data1, data2, data3...};
        dataType[] variableName = new dataType[size];

        double[] balances1 = {10.5, 20.75, 2,3};
        double[] balances2 = new double[5];


        DEFAULT VALUES FOR ARRAY ELEMENTS
        byte-short-int-long 	-> 0
        double-float 			-> 0.0
        boolean 				-> false
        char 					-> nothing
        Objects 				-> null
        Integer-Double 			-> null
        String 					-> null



        NOTE: Once you declare a size for array, it can never modified anymore.


        KNOWLEDGE CHECK
        -default values
        -printing an array -> Arrays.toString(arrayVar)
        -assigning a value to a particular index
        -updating an existing element
        -iterating an array - looping
        -getting the size -> arrayVar.length
        -for each loop


        int[] numbers = {0, -5, 2, 10, 5, 2, -1, 0};

        TASK: Print each number

        For each number in numbers, print the number

        for(int number : numbers){
            System.out.println(number);
        }


        Sorting an array
        {5, 4, 10} -> 4, 5, 10
        {"abc", "John", "mike", "Joe"} -> "Joe", John", "abc", "mike"


        numbers -> ascending
        String  -> lexicographically



        Arrays class: it is a Java class in util package
            -toString() method
                -static
                -return
                -it returns a String
                -It is overloaded and pretty much takes any type of array

            -sort()
                -static
                -void
                -It is overloaded and pretty much takes any type of array



        String[] names = {"andrii", "saeed", "Olena", "Mihail"};
     */
}
