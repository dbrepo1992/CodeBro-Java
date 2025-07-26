import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       // METHOD = A BLOCK OF REUSABLE CODE THAT IS EXECUTED WHEN CALLED ();
       // WITH THE METHOD YOU CAN WRITE SOME CODE ONCE AND REUSED IT WHENEVER YOU WANT
       // BY CALLING THE METHOD ()

        /*
        // Okay so code below is not necessary because you can set your arguments when you calling a method
        // matrix(5, 5, '#')
        // (rows, columns, symbol)

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        int rows;
        int columns;
        char symbol;
        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

         */
        /*

        // there is enough of code to set arguments and call method matrix.
        // BRILLIANT !
        matrix(7,4, 99); // char symbol needs to be inside ' ' not like a String in " "

    }



    static void matrix(int rows, int columns, double number) { // STATIC because main() method is static
                                                             // and can use only other static methods or variables.

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                double randomNumber = Math.random() * 99;
                System.out.printf("%.2f ", randomNumber);
            }
            System.out.println();
        }
    }
}


/*   OBJECTED ORIENTED PROGRAMMING BELOW

public class Main {

    // instance  fields (not static)
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int rows;
    int columns;
    char symbol;

    public static void main(String[] args) {
        // create main class object
        Main app = new Main();
        app.run(); // wywołujemy metodę uruchamiającą logikę programu
    }

    // This is standard instance method (not static)
    void run() {
        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        matrix(); // możemy wywołać inną metodę tej samej instancji
    }

    void matrix() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

         */

        // ---------------- MORE EXAMPLES WITH METHODS


    // double result = square(3);
    //    System.out.println(result);
    //    System.out.println(square(3)); // print exactly the same

        /*

        System.out.println(cube(3));

        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

        int age = 11;
        if (ageCheck(age)){
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18 to sign up!");
        }

    }
    static double square(double number){
        return  number * number;
    }

    static double cube(double number){
       return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if (age >= 18){
            return  true;
        } else {
            return  false;
        }
    }
}

         */