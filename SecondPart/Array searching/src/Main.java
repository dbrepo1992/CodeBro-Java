import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // EXAMPLE WITH NUMBERS
        /*
        int[] numbers = {5, 7, 2, 8, 9, 12, 15, 19};

        int target = 9;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
            if (numbers[i] == target) {
                System.out.println("Number " + target + " found at index " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound){ // (!) means IS NOT
            System.out.println("Element not found in the array");
        }

         */

        // EXAMPLE WITH STRINGS

        String[] words = {"gun", "car", "flower", "dog", "house"};
        String target;
        boolean isFound = false;

        System.out.println("Enther a word to serach for");
        target = scanner.nextLine();


        for (int i = 0; i < words.length; i++){
            if (words[i].equals(target)){ // it's better to use methods than for example (target == words[i])
                System.out.println("Found word " + target + " at index number " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println(target + " word NOT found in the array");
        }

        scanner.close();
    }
}
