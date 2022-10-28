package notes_java;

public class _10_23_2022_ArraysPart_2 {
    /*
    RECAP:
        -Arrays are used to store multiple same/similar data in one variable
        -In this manner, array is an collection
        -ELEMENT = each data stored in array is called as element


        SYNTAX:
        dataType[] varName = new dataType[length];
        dataType[] varName = {element1, element2, element3};

        char[] characters = {'f', 'A', '4', '*'};


        HOW DO WE PRINT AN ARRAY?
        -we use toString() method to convert array to a String
        System.out.println(Arrays.toString(characters));

        [f, A, 4, *]


        HOW TO FIND THE LENGTH OF THE ARRAY?
        -we use length instance variable (it is not a method)

        characters.length; // returns an int that is length-size


        WHAT ARE THE DEFAULT VALUES FOR ARRAY DATATYPES-ELEMENTS?
        int-byte-short-long 	-> 0
        double-float 			-> 0.0
        boolean 				-> false
        char 					-> nothing
        objects(String, Integer)-> null


        SORTING ARRAYS
        Numbers -> ascending order
        Texts   -> lexicographically

        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));

        [*, 4, A, f]


        HOW TO ACCESS/RETRIEVE AN ELEMENT FROM ARRAY?
        String[] names = {"Ali", "Alex", "Mike"};

        String thirdElement = names[2].toLowerCase(); // 3rd element - Mike

        System.out.println(thirdElement); // mike


        HOW TO UPDATE AN EXISTING ELEMENT?
        names[1] = "Joe";

        System.out.println(Arrays.toString(names));

        [Ali, Joe, Mike]



        FOR EACH LOOP - ENHANCED FOR LOOP - used with collections
        String[] countries = {"Japan", "China", "US", "Germany"};

        for(String country : countries){
            System.out.println(country.toUpperCase());
        }

        JAPAN
        CHINA
        US
        GERMANY




        SEARCHING IN AN ARRAY
        Tesla, BMW, Toyota

        Do I have Tesla -> true
        Do I have Mercedes -> false

        String[] cars = {"Tesla", "BMW", "Toyota"};

        return true if the cars array has element Mercedes
        return false if it does not have it

        boolean hasMercedes = false;

        for(String car : cars){
            if(car.equals("Mercedes")) hasMercedes = true;
        }

        System.out.println(hasMercedes); // false

        boolean hasBMW = false;

        for(String car : cars){
            if(car.equals("BMW")) {
                hasBMW = true;
                break;
            }
        }


        System.out.println(hasBMW); // true



        STEPS TO SEARCH AN ELEMENT
        -sort the array first
        -then, use Arrays.binarySearch(collection, element) method
            -if this returns zero or positive index, then it means the element you search for exists in the array
            -if this returns negative index, then it meand the element you search for does not exist


        String[][] students =
        {
                {"Alex", "Regina"},
                {"Mike", "Joe", "Jane"},
                {student1, student2, student3, student4},
                {student1, student2},
                {student1, student2, student3, student4},
                {student1, student2, student3},
                {student1, student2, student3, student4},
                {student1, student2, student3},
                {student1, student2, student3, student4},
                {student1, student2, "Yoanna"}
        }

     */
}
