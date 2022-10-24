package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdallah", "Newer"}
        };

        System.out.println(students[0][1]); // Mehmet
        System.out.println(students[1][1]); // regina

        System.out.println(students.length); // 3 outer array

        System.out.println(Arrays.toString(students[0])); // [Ali, Mehmet, Alex]
        System.out.println(Arrays.toString(students[1])); // [Alex, Regina]
        System.out.println(Arrays.toString(students[2])); // [Abdallah, Newer]

        System.out.println("\n---------- fori loop-----------\n");

        for (int i = 0; i < students.length; i++){
            System.out.println(Arrays.toString(students[i]));
        }
        System.out.println("\n---------- for each loop-----------\n");
        for (String[] group : students) {
            System.out.println(Arrays.toString(group));
        }


        System.out.println(Arrays.deepToString(students)); // [[Ali, Mehmet, Alex], [Alex, Regina], [Abdallah, Newer]]

        for (String[] group : students) {
            for (String student : group){
                System.out.println(student);
            }
        }





    }
}
