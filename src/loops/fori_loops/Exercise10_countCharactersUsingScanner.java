package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_countCharactersUsingScanner {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and count how many l letter exists in the name

        Lionel -> 2
        Leo    -> 1
        lucy   -> 1
         */

        String name = ScannerHelper.getAName();
        name = name.toLowerCase();
        int counter = 0;
        for (int i = 0; i <= name.length() -1; i++)
            {
                if ('l' == name.charAt(i)) counter++;
            }
            System.out.println(counter);


    }
}
