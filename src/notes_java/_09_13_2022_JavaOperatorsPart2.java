package notes_java;

public class _09_13_2022_JavaOperatorsPart2 {
    /*
    RECAP:
        Operators: +, -, /, *, %, =, <, >, !, |, &
        <=, >=, ==, !=, &&, ||, ++, --
        special symbols that are used to perform some certain tasks
        = assignment operator
        dataType varName = value;
        Shorthand Assignment Operators
        +=
        -=
        *=
        /=
        %=
        int age = 10;
        age += 3; // age = age + 3;
        Increment and decrement
        Pre vs post
        int num1 = 5;
        num1++;
        int num2 = num1;
        System.out.println(num2); // 6
        int i1 = 10;
        int i2 = --i1;
        System.out.println(i2); // 9
        i++, i--, num++, num--
        RELATIONAL OPERATORS
        -Relational operators are used to compare 2 expressions and returns a boolean
        -Relational operators always return either true or false
        < 	is used for less than
        <= 	is used for less than or equal to
        > 	is used for greater than
        >= 	is used for greater than or equal to
        == 	comparison -> checks if both sides are equal
        != 	comparison (not equal) -> checks if both sides are not equal
        10 <= 10  	-> true
        15 > 20 	-> false
        -3 == -3 	-> true
        2 == 2 		-> true
        5 != 10 	-> true
        ! 	-> NOT
        2 == "2" 	-> false
        65 == 'A' 	-> compiler error
        "A" == 'A' 	-> false
        int x = 10, y = 20, z = 10;
        boolean b1 = y < z;  		-> false
        boolean b2 = x <= y; 		-> true
        boolean b3 = x >= z; 		-> true
        boolean b4 = y > x; 		-> true
        boolean b5 = x >= y; 		-> false
        boolean b6 = (x >= z) < y; 	-> compiler error
        (x >= z) < y
        (10 >= 10) < 20
        true < 20
        2 < 5 == ((5 != 10) == (10 >= 5)) -> true
        Logical operators
        -Logical operators are used to check multiple conditions and they return a boolean
        -There are 2 types of logical operators used in Java
            1. AND operator &
            2. OR operator |
        10 < 5 | 10 < 20 | 2 != 2 	-> true
        2 > 1 & 3 > 2 & 4 > 3 		-> true
        2 != 3 & 5 == 20 			-> false
        2 != 3 | 5 == 20 			-> true
        AND operator syntax => condition1 & condition2
        true & true 	-> true
        true & false 	-> false
        false & true 	-> false
        false & false 	-> false
        NOTE:
        It will return true only if both conditions are true
        It will return false if one or both conditions are false
        EXAMPLE: username & password
        OR operator syntax => condition1 | condition2
        true | true 	-> true
        true | false 	-> true
        false | true 	-> true
        false | false 	-> false
        NOTE:
        It will return false only if both conditions are false
        It will return true if one or both conditions are true
        | OR
        & AND
        || OR
        && AND
        Difference of 	| 	or 	||
        Difference of 	& 	or 	&&
        false && true && true && true 	-> false
        false & true & true & true 		-> false
        true && false && ____________________ -> false
        true || _____________________________ -> true
        NOT operator syntax => !condition
        Expected results
        !false 	- returns true
        !true	- returns false
        (3 < 5 && !(5 > 10) && (3 == 3 || 5 != 5)) || 4 != 5
        false || false && true || false
        password and username
        if(username == true && password == true) {
            //let user to login
        }
        else if (username == false && password == true){
            //tell user their username is wrong
        }
        else if(username == true && password == false){
            //tell user their password is wrong
        }
        else{
            //tell user their credentials are wrong
        }
     */
}
