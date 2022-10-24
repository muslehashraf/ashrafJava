package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        // 1. Declare a String array called as countries and assign size of three
        String[] countries = new String[3];

        // 2. Assigning values to specific indexes
        countries[1] = "Spain";

        // 3. Print a specific index from an array
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // spain

        // 4. Printing an array
        System.out.println(Arrays.toString(countries)); // [null, Spain, null]

        /*
        Assign Belgium to index of 2 and print the array again

        [null, Spain, Belgium]
         */

        countries[2] = "Belgium";

        System.out.println(Arrays.toString(countries));

        // 5. Update existing element
        countries[1] = "France";
        System.out.println(Arrays.toString(countries));


        // 6. Getting the length of an array - how many elements - 3
        System.out.println(countries.length); // 3
        // or
        int i = countries.length;
        System.out.println(i);

        // 7. Printing each element separately
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // france
        System.out.println(countries[2]); // Belgium

        System.out.println("\n");
        for (int j = 0; j < countries.length; j++) {
            System.out.println(countries[j]);
        }





    }
}
