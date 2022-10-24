package notes_java;

public class _10_01_2022_StringMethodsPart1 {
    /*
            Method:
        -A block of code that is invoked  and each time when it is invoked, it executes a task
        -TASK of the method: usually used for naming the method as well
        accessModifier returnType methodName() {
            //method block
        }
        public void print(String str){
            System.out.print(str);
        }
        public int sum(int a, int b){
            return a + b;
        }
        1. return or void?
        2. if return, then what is the return type?
        3. static or non-static
        static methods: can be invoked with the class name they belong to.
        Ex: Math.min()
        non-static methods: can be invoked with an object of the class
        Scanner input = new Scanner(System.in;
        input.nextInt();
        Scanner.nextInt(); // compiler error
        Random myRandom = new Random();
        myRandom.nextBoolen();
        STRING METHODS
        NOTE: DO NOT compare strings with == operator
        We compare 2 strings using equals() method
        equals() vs equalsIgnoreCase()
        "abc".equals("ABC") -> false
        "abc".equals("abC") -> false
        "abc".equalsIgnoreCase("ABC") -> true
        "abc".equalsIgnoreCase("aBC") -> true
        "abc".equalsIgnoreCase("abC") -> true
        "abc".equalsIgnoreCase("abc") -> true
        charAt(index)
        -This method takes an int index and returns the char at given index
        -It returns a char
        -BUT, we should be careful about the range that we can only get from index 0 to last index
        String s = "";
        s.charAt(0); // StringIndexOutOfBoundsException
        String s2 = "Hello"; // H = 0 and o = 4
        s2.charAt(5); // StringIndexOutOfBoundsException
        NOTE: The return that you got from charAt() method cannot be used with other String methods as it is a char primitive
        indexOf()
        String s = "Today I woke up at 8 and then I went to school";
        s.charAt(1); // 'e'
        s.indexOf('l'); // 2
        s.lastIndexOf('l'); //
        NOTE: if an attempt to get an index of non-existing character or a sequence of characters from a String happens, then indexOf() or lastIndexOf() methods return -1 (NOT FOUND)
        String s = "Java and JavaScript are among the most popular programing languages";
        s.indexOf("Java"); // 0
        s.lastIndexOf("Java"); // 9
        s.indexOf("javascript"); // -1
     */
}
