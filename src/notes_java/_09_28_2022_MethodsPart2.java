package notes_java;

public class _09_28_2022_MethodsPart2 {
    /*
    Method:
        - it is a block of code that has a task with reusable coding statements
        - it helps us to reuse same code statements which decreases time and effort we use to write programs
        - initially, creating methods could be challenging but for the future it will save us a lot of time and effort
        METHOD=FUNCTION
        IS THIS METHOD RETURNING ANYTHING?
        YES -> this method is a return type
            Then, what it returns?
            int, String, boolean, array, collection, map
        NO  -> this method is a void type
        void methods does not return anything
        RETURN TYPE METHODS - SYNTAX
        public returnType methodName(){

            return data; // this statement is MUST for return methods
        }
        public int sum(int a, int b){
            return a + b;
        }
        public String getName(){
            // a name from Scanner
            return name;
        }
        VOID TYPE METHODS - SYNTAX
        print(), println() are some Java pre-defines examples
        public void methodName(){

        }
        public void printHello(){
            System.out.println("Hello");
        }
        public void printHelloName(String name){
            System.out.println("Hello " + name);
        }
        STATIC METHODS: These are the methods that can be invoked with their className
        Math.min(), Math.max(), Integer.parseInt(), Double.valueOf()
        String.valueOf()
        NON-STATIC METHODS: These are the methods that can be invoked with an object of their class
        Scanner input = new Scanner(System.in);
        input.nextInt();
        Random r = new Random();
        r.nextBoolean();
        *** How we decide to make a method static or non-static?
        invoke it with className -> static (easy to access)
                                 -> it belongs to class
        invoke it with an object of the class -> non-static
                                              -> it belongs to object
        NOTE: Return or void type methods can be static or non-static
        1. return and static
        2. return and non-static
        3. void and static
        4. void and non-static
        CREATING A METHOD
        1. return or void
        2. If return -> what it returns
        3. static or not
        4. does it take any argument
        5. if yes -> what type of args
        ARGUMENT = PARAMETER
        THERE ARE 2 TYPES OF METHODS IN JAVA
        1. void types
            -does not return anything but executes a block of code
            -return keyword cannot be used with this method
            -can be created with void keyword
        2. return types
            -does return something
            -return keyword MUST be used, otherwise it is a compiler error
            -cannot use void keyword
        NOTE: you cannot have any code statements after return in the method block
        -This code is known as unreachable code
        public static String getDay(int num){
            if(day == 1) return "Monday";
            else if(day == 2) return "Tuesday";

            return "";
        }
        System.out.println(2 == 2);
        (int num1, double num2)
        (double num1, int num2)
        OVERLOADING - achieved only with method signature
        method signature = methodName + arguments
     */
}
