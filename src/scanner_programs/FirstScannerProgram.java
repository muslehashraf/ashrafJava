package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        //1. Create a scanner object

        //dattaType varName = value;

        String fName, lName;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter your first name");
        fName = inputReader.next();//Ashraf

        System.out.println("Please enter your last name");
        lName = inputReader.next();//Musleh

        System.out.println("Your full name is = " + fName + " " + lName );


    }


}
