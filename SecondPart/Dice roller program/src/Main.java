import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // DECLARE VARIABLES

        int numberOfDice;
        int total = 0;


        System.out.println("Enter the number of dice (from 1 to 6): ");
        numberOfDice = scanner.nextInt();


        if (numberOfDice > 0 && numberOfDice < 7){
           for (int i = 0; i < numberOfDice; i++){
               int roll = random.nextInt(1, 7);
               printDie(roll);// because second number (7) is exclusive, our range is 1 - 6.
               System.out.println("You rolled: " + roll);
               total += roll;
           }
            System.out.println("Total: " + total);
        } else {
            System.out.println("# of dice must be greater than 0 and smaller than 7");
        }

        scanner.close();
    }

    static void printDie(int roll){

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }
    }

}
