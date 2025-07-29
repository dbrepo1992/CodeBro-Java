import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] arg){

        /*  REPEAT ARRAY DECLARATION AND FOR LOOP

    String[] foods = new String[5];

    foods[0] = "pizza";
    foods[1] = "cheeseburger";
    foods[2] = "taco";
    foods[3] = "spring rolls";
    foods[4] = "pad thai";

        for (int i = 0; i < foods.length; i++){
            System.out.println(foods[i]);
        }

        for (String food : foods){
            System.out.println(food);
        }

         */

        // EXAMPLE OF USER IMPUT INTO AN ARRAY

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        String[] foods;

        /* ANOTHER WAY YOU CAN ALSO MAKE NEW VARIABLE

        int size;
        System.out.println("What number of food do you want?: \n");
        size = scanner.nextInt();
        scanner.nextLine()

        foods = new String[size];

         */

        System.out.println("What number of food do you want?: ");
        foods = new String[scanner.nextInt()];
        scanner.nextLine(); // IT'S NECESSARY BECAUSE COMMON JAVA SCANNER ISSUE IS THAT nextInt() and
                            // nextLine() methods when the user types a number and presses Enter,
                            // nextInt() reads only the number, but it does not consume the newline (\n) left in the input buffer.

        for (int i = 0; i < foods.length; i++){
            System.out.println("Enter a food: \n");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }

        System.out.println(foods.length);

        scanner.close();
    }
}
