package operaters.relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 5, b = 10;
        System.out.println(a < b); // true
        System.out.println(a <= b); // true
        System.out.println(a != b); // true
        System.out.println(a + a == b); // true
        System.out.println(4 * a == 2 * b); //true

        System.out.println(true == true); // true
        System.out.println(true == false); // false
        System.out.println(true != false); // true


        System.out.println((3 < 5) == (10 > 2)); // true
        System.out.println(2 < 5 == (( 5 != 10 == 10 >= 2))); // true








    }
}
