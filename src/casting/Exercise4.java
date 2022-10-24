package casting;

import first_package.HelloWorld;

public class Exercise4 {
    public static void main(String[] args) {
        // ture false      -> " true" "false "hello"

        System.out.println(true && false); // false
        //System.out.println("true" && "false"); // compiler error
        System.out.println(String.valueOf(true) + String.valueOf(false)); // "true" + "false"
        System.out.println("" + true + false); // true false;
        System.out.println(String.valueOf('A') + "a"); // Aa
        System.out.println("" + 10.5 + 5); // "10.5" + 5 -> 10.55


    }
}
