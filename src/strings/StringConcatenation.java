package strings;

import com.sun.org.apache.xpath.internal.objects.XString;

public class StringConcatenation {
    public static void main(String[] args) {


        System.out.println("\n-------------- Concatenation with + operator------------\n");
        String firstName = "Ashraf";
        String lastName = "musleh";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println("\n-------------- Concatenation with concat() method------------\n");
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);



    }
}
