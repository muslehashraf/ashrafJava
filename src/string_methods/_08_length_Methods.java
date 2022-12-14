package string_methods;

public class _08_length_Methods {
    public static void main(String[] args) {
        /*
        1. return
        2. returns int which is the total count of the characters
        3. non-static
        4. does not take any argument
         */
        String s = "John";

        int len = s.length();

        System.out.println(len); // 4

        System.out.println("" .length()); // 0
        System.out.println(" ".length()); // 1
        System.out.println("  ".length()); // 2
    }
}
