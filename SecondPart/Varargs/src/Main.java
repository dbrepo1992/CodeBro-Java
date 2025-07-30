
public class Main {
    public static void main(String[] args) {
        // VARARGS = allow a method to accept a varying number of arguments
        //           makes methods more flexible, no need for overloaded methods
        //          java will pack the arguments into an array
        //          ... (ellipsis)


        // FIRST EXAMPLE

        /*


        System.out.println(add(1, 2, 3, 4, 5, 6));

         */

        System.out.println("Your average is: " + average(4.5, 4.0, 4.0, 3.0, 3.5, 5.0, 4.0, 5.0));

    }

    // FUNCTION FOR THE FIRST EXAMPLE
    /*
    static int add (int... numbers){
        int sum = 0;

        for (int number : numbers){
            sum += number;
        }
        return sum;
    };

     */

    static double average(double... numbers){
        double sum = 0.0;

        if (numbers.length == 0){
            return 0;
        }

        for (double number : numbers) {
        sum += number;
        }
        return sum / numbers.length;
   }
}
