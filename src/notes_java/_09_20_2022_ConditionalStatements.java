package notes_java;

public class _09_20_2022_ConditionalStatements {
    /*
            Ternary Operator - Switch statements
        if-else statements
        -if else statements in Java can be used to control the flow the program. Usually, there are multiple blocks of code that will probably be executed based on a condition.
        SYNTAX:
        if(condition){
            //these statements will run if condition is true
        }
        else{
            //these statements will run if condition is false
        }
        if(condition) // This statement will run if condition is true
        else // This statement will run if condition is false
        -Ladder if-else statements
        if(num <= 25) 1st quarter
        else if(num <= 50) 2nd quarter
        else if(num <= 75) 3rd quarter
        else 4th quarter
        -Nested if-else statements
        if(condition){
            if(condition){

            }
            else{
                if(condition){

                }
                else if(condition){
                }
                else{

                }
            }
        }
        else{
            if(condition){

            }
            else{

            }
        }
        NOTES:
        -if statement can be used without else
        -BUT else statement can never be used without if statement
        if(condition){

        }
        else{

        }
        Ternary Operator
        -Ternary operator can be used instead of if-else statement
        -It is used a lot in programming languages
        Java Random class
        -We can use this class to get some random values like numbers, booleans, doubles etc.
        -To be able to use it
            1. We need to create an object first
                Random r = new Random();
            2. We need import it from java.util package
                import java.util.Random;
                int i = r.nextInt(); // this will return a random int
        Switch statements:
        -It is kind of an ladder if else statement but based on cases instead of conditions
        if(monday){
            //blue
        }
        else if(tuesday){
            //yellow
        }
        int dayOfTheWeek = ___; // 1 to 7 1 is Monday 7 is Sunday
        switch(dayOfTheWeek){
            case 1:
                //Monday
                break;
            case 2:
                //Tuesday
                break;
                case
        }
        NOTE: We use switch only if we have few cases
        NOTE: switch statements can NEVER used with boolean
        -We can use switch with int, short, byte, String, Enum
        -Java allows to have any number of case statements within a switch
        -Each case is followed by “:” (colon)
        NOTE: The value of a case must be the same data type as the variable in the switch
        -Using break is optional. If no break appears, the flow of control continue until a break is reached
        -The statement for a case will execute until a break statement is reached
        -When a break statement is reached, the switch terminates
        -A switch statement can have an optional default case, which should be at the end of the switch. The default case can be used for performing a task when none of the cases is true. No break is needed in the default case
        -In Java break statement is used for the termination
        -It is used with switch statements and loop statements
        Syntax:
        break;
             */
}
