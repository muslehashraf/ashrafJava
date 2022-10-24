package conditional_statements.if_else_statements;

public class IfElseSyntax {
    public static void main(String[] args) {
        /*
        -if and else statements are used to control the flow of the program based on conditions
        - conditions are always boolean statements (True or False)
        - if block can be used without else block
        - else block can Never be used without if
         */
        boolean condition = true;

        if (condition){
        // this is the if block, and it executes of the condition is true
            System.out.println("AAA");
        }
        else {
        // this is the else block, and it executes if the condition is false
            System.out.println("BBB");
        }

        System.out.println("End of the program");
















    }
}
