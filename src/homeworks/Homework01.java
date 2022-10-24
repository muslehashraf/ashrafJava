package homeworks;

public class Homework01 {
    public static void main(String[] args) {

    /*
   ========================================== JAVA===================================
    J=074   128 64 32 16 8 4 2 1                             i got the ascii code chrome
             0   1  0  0 1 0 1 0       64+8+2=72
              we start counting from the highest number it can carry

    A=065   128  64 32 16 8 4 2 1
             0    1 0   0 0 0 0 1

    V=086   128  64 32 16 8 4 2 1
            0    1  0  1  0 1 1 0

     A=065   128  64 32 16 8 4 2 1
             0    1 0   0 0 0 0 1

===========================================SELENIUM====================================
    S=083   128 64 32 16 8 4 2 1
             0   1 0  1  0 0 1 1

    E=069   128 64 32 16 8 4 2 1
             0   1 0  0  0 1 0 1

    L=076   128 64 32 16 8 4 2 1
             0   1 0  0  1 1 00

    E=069   128 64 32 16 8 4 2 1
             0   1 0  0  0 1 0 1

    N=078   128 64 32 16 8 4 2 1
             0   1 0  0  1 1 1 0

    I=078   128 64 32 16 8 4 2 1
             0   1 0  0  1 0 0 1

    U=085   128 64 32 16 8 4 2 1
             0   1 0  1  0 1 0 1

    M=078   128 64 32 16 8 4 2 1
             0   1 0  0  1 1 0 1
=====================================requirement2========================================
            0  1  0  0  1  1  0  1
           128 64 32 16 8  4  2  1
           64+8+4+1=077=M                       put binary code in a table then put the bits under them and
                                                add each one is on or have 1 then match the ASCII code from the table
           0  1  1  0  1  0  0  0
          128 64 32 16 8  4  2  1
           64+32+8=104=h

           0  1  1  1  1  0  0  1
          128 64 32 16 8  4  2  1
          64+32+16+8+1=121=y

          0  1  0  1  0  0  1  1
         128 64 32 16 8  4  2  1
         64+16+4+2+1=115=s

         0  1  1  0  1  1  0  0
        128 64 32 16 8  4  2  1
        64+32+8+4=108=l


     */
        System.out.println("I start to practice \"JAVA\" today, and I like it.");
        System.out.println("The secret of getting ahead is getting started.");
        System.out.println("\"Don't limit yourself.\"");
        System.out.println("Invest in your dreams. Grind now. Shine later");
        System.out.println("It's not the load that breaks you down, it's the way you carry it.");
        System.out.println("The hard day are what make you stronger");
        System.out.println("You can waste your live drawing lines. Or you can live your life crossing them");


        System.out.println("\tJava is easy to write and easy to run—this is the foundational" +
                "\nstrength of Java and why many developers program in it. When you" +
                "\nwrite Java once, you can run it almost anywhere at any time.");

        System.out.println("\tJava can be used to create complete applications that can run" +
                "\non a single computer or be distributed across servers and clients in a" +
                "\nnetwork.");

        System.out.println("\tAs a result, you can use it to easily build mobile applications or" +
                "\nrun-on desktop applications that use different operating systems and" +
                "\nservers, such as Linux or Windows.");

        int myAge = 18; //I can use byte, short, or long as well but int is the most common
        int myFavoriteNumber = 7;
        String myHeight = "6'4"; //double myHeight = 6.4
        double myWeight = 185.0; // can use float but double is more common
        char myFavoriteCharacter = '$';

        System.out.println(myAge);
        System.out.println(myFavoriteNumber);
        System.out.println(myHeight);
        System.out.println(myWeight);
        System.out.println(myFavoriteCharacter);

    }

}
