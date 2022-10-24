package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("\n============TASK 1================\n");

        String s1 = "24", s2 = "5";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (i1 + i2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (i1 - i2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " + ((double)i1 / i2));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + i1 * i2);
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + i1 % i2);

        System.out.println("\n============TASK 2================\n");

        int random1 = (int)(Math.random() * 35 - 1 +1) + 1;
        if (random1 % 1 == random1 && random1 % random1 == 1){
        System.out.println(random1 + " IS A PRIME NUMBER");
        }else if(random1 % 1 != random1 || random1 % random1 != 1 || random1 <=1){
        System.out.println(random1 + " IS NOT A PRIME NUMBER");
        }

           System.out.println("\n============TASK 3================\n");

        int random2 = (int)(Math.random() * 50 - 1 +1) + 1;
        int random3 = (int)(Math.random() * 50 - 1 +1) + 1;
        int random4 = (int)(Math.random() * 50 - 1 +1) + 1;

        System.out.println("Lowest number is " + Math.min(Math.min(random2, random3), random4));
        if (random2 > random3 && random2 < random4 || random2 < random3 && random2 > random4){
        System.out.println("Middle number is = " + random2);
        } else if (random3 > random2 && random3 < random4 || random3 < random2 && random3 > random4) {
            System.out.println("Middle number is = " + random3);
        } else if (random4 > random2 && random4< random3 || random4 < random2 && random4 > random3) {
    System.out.println("Middle number is = " + random4);

}
        System.out.println("Highest number is " + Math.max(Math.max(random2, random3), random4));

        System.out.println("\n============TASK 4================\n");

        char c = 'R';
if (c >= 97 && c <= 122){
            System.out.println("The letter is lower case");
        }else if (c >= 65 && c <= 90){
    System.out.println("The letter is upper case");
        }else {
    System.out.println("Invalid Character detected!!!");
        }

        System.out.println("\n============TASK 5================\n");

    char b = 'a';
    if (b == 97 || b == 101 || b == 105 || b == 111 || b == 117 || b == 65 || b == 69 || b == 73 || b == 79 || b == 85){
        System.out.println("The letter is vowel");
    } else if (b >= 66 && b <= 68 || b >= 70 && b <= 72 || b >= 74 && b <= 78 || b >= 80 && b <= 84 || b >= 86 && b <= 90
            || b >= 98 && b <= 100 || b >= 102 && b <= 104 || b >= 106 && b <= 110 || b >= 112 && b <= 116 || b >= 118 && b <= 122) {
        System.out.println("The letter is consonant");
    }else System.out.println("Invalid character detected!!!");

        System.out.println("\n============TASK 6================\n");

    char d = ' ';
    if (d >= 33 && d <= 47 || d >=58 && d <= 64 || d >= 91 && d <= 96 || d >= 123 && d <= 126){
        System.out.println("special character is = " + d);
    }else{
        System.out.println("Invalid character detected!!!");
    }

        System.out.println("\n============TASK 6================\n");

    char i = ' ';
        if (i >= 32 && i <= 47 || i >=58 && i <= 64 || i >= 91 && i <= 96 || i >= 123 && i <= 126) {
            System.out.println("Character is special character");
        }else if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            System.out.println("character is a letter");
        }else if (i >= 48 && i <= 57){
            System.out.println("Character is a digit");
        }






    }
}
