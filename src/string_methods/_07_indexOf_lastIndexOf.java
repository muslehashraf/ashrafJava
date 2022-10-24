package string_methods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /*
        1. return
        2. returns int which matching index
        3. non-static
        4. it takes a Char or a String - there are overloaded method
         */

        String company = "TechGlobal School";

        int firstIndexOfO = company.indexOf('o');//6
        int lastIndexOfO = company.lastIndexOf('o');// 15

        System.out.println(firstIndexOfO);
        System.out.println(lastIndexOfO);

        int firstIndexOfl = company.indexOf('l');//5
        int lastInderOfl = company.lastIndexOf('l');//16

        // Find the first and last indexes of l -> expected 5 and 16
        System.out.println(company.indexOf('l'));
        System.out.println(company.lastIndexOf('l'));

        System.out.println(company.indexOf('x'));// -1 bc it's non-existing character in a string (NOY FOUND)

        String s = "Java and JavaScript are the among the most popular programing languages";
        s.indexOf("Java"); // 0
        s.lastIndexOf("Java"); // 9

        s.indexOf("javascript"); // -1 bc it the lower case

        System.out.println(s.indexOf("Java"));
        System.out.println(s.lastIndexOf("Java"));
        System.out.println(s.indexOf("javascript"));
    }
}
