package notes_java;

public class _10_02_2022_StringMethodsPart2 {
    /*
    1. String.valueOf(variable); // converts to String
        2. s1.concat(s2); // s1 + s2
        3. s1.equals(s2); // comparison - case sensitive
        4. s1.equalsIgnoreCase(s2); // case insensitive
        5. s1.toUpperCase(), s2.toLowerCase(); //
        6. s1.charAt(index); // returns the char at given index
            out of range: StringIndexOutOfBoundsException
        7. s1.indexOf(char), s1.lastIndexOf(String)
        8. s1.length(); // it gives back the int - character count
        "Hello".indexOf('l'); // 2
        "Hello".lastIndexOf('l'); // 3
        "Hello".indexOf('x'); // -1
        "Hello".lastIndexOf('x'); // -1
        "Hello".indexOf("llo"); // 2
        "Hello".indexOf("Hello"); // 0
        "Hello".lastIndexOf("Hello"); // 0
        "Hello".indexOf("eL"); // -1
        "techglobal".indexOf("techglobaL"); // -1
        "1 2 3 ".length(); // 6
        "@#$@#%435".length(); // 9
        String s = "   abc   ";
        1. s.trim().length(); // 3
        2. s.length().trim(); // compiler error
        substring() method
        String s = "TechGlobal";
        "Tech" -> s.substring(0, 4); // 0, 1, 2, 3
        "Glo"  -> s.substring(4, 7); // 4, 5, 6
        substring(beginIndex, endIndex)
        beginIndex is included
        endIndewx is not included
        "Global" -> s.substring(4); // 4, 5, 6, 7, 8, 9
        NOTE: We may get Exception if we use indexes that exceeds the bounds
        0 - string's length
        s.substring(0, length);
        StringIndexOutOfBoundsException
        Lionel
        last index -> length() - 1 = 5
        Beyza -> length() - 1 = 4
        John -> length() - 1 = 3
        First and last characters in the a String
        String s = "______";
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        Middle 1 or 2 characters
        ODD -> Find middle char with ->
                s.charAt(s.length()/2);
        EVEN -> Find middle 2 chars with ->
                s.substring(s.length()/2-1, s.length()/2+1)
        First or last n characters
        s.substring(0, n)
        s.substring(s.length()-n)
        String s = "My fav cities are Tokyo and Brugge";
        s.contains("Tokyo" + "Brugge"); // false
        s.contains("Tokyo") && s.contains("Brugge"); // true
        -Method chaining
        We can use many methods in a single line by chaining them and this is called as method chaining in Java
        String methods that returns boolean
        -isEmpty()
        -equals()
        -equalsIgnoreCase()
        -contains()
        -startsWith()
        -endsWith()
        String methods that returns char
        -charAt()
        String methods that returns int
        -indexOf()
        -lastIndexOf()
        -length()
        String methods that returns a String back
        -valueOf()
        -concat()
        -toUpperCase()
        -toLowerCase()
        -trim()
        -replace()
        -substring()
         */
}
