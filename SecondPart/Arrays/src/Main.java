import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ARRAY = A COLLECTION OF VALUES OF THE SAME DATA TYPE
        //  * think of it as a variable that can store more than 1 value *
        // ARRAY IS REFERENCE DATA TYPE

        String[] fruits = {"apple", "orange", "banana", "coconut"};




        // System.out.println(fruits); // output is an adress of array fruits.
        // System.out.println(fruits[0]); // output is apple because you specified an index.

        // YOU CAN ALSO USE INDEX TO CHANGE DATA IN SPECIFIED INDEX.

        // fruits[0] = "pineapple"; // RIGHT NOW OUTPUT WILL BE pineapple insted of OVERWRITTEN apple.
        //  System.out.println(fruits[0]);

        // int numOfFruits = fruits.length; // method .length shows you number of element contained in array;

        // System.out.println(numOfFruits);

        // FIRST EXAMPLE WITH FOR LOOP
        /*

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]); // output is every data saved at specified index because i(0,1,2,3)

            }

         */

        // SECOND EXAMPLE WITH FOR ENHANCED FOR LOOP (FOR EACH LOOP)
        // IT'S SIMPLIFIES ITERATING THROUGH A COLLECTION
        //Arrays.sort(fruits); // .sort method
        Arrays.fill(fruits, "pineapple"); // .fill method

        for (String fruit : fruits) { // each element of whole array
            System.out.println(fruit);
        }


    }
}

