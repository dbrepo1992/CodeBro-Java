import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] items = {"rock", "paper", "scissors"};
        int computerChoice = random.nextInt(0, 3);
        int userChoice = 0;
        String playAgain = "yes";



        System.out.println("**********************************************");
        System.out.println("|   Welcome to Rock, paper, scissors game!   |");
        System.out.println("**********************************************");

        System.out.println("Select your item (0 - Rock | 1 - Paper | 2 - Scissors): ");
        userChoice = scanner.nextInt();

        if (userChoice == computerChoice) {
                System.out.println("You're both selected the same item! It's withdraw!");
            } else if (userChoice == 0 && computerChoice == 1) {
                System.out.println("Your type was " + items[userChoice] + " | " + "Computer type was " + items[computerChoice] + " | " + " You have lost!");
            } else if (userChoice == 0 && computerChoice == 2) {
                System.out.println("Your type was " + items[userChoice] + " | " + "Computer type was " + items[computerChoice] + " | " + " You have won!");
            } else if (userChoice == 1 && computerChoice == 0) {
                System.out.println("Your type was " + items[userChoice] + " | " + "Computer type was " + items[computerChoice] + " | " + " You have won!");
            } else if (userChoice == 1 && computerChoice == 2) {
                System.out.println("Your type was " + items[userChoice] + " | " + "Computer type was " + items[computerChoice] + " | " + " You have lost!");
            } else if (userChoice == 2 && computerChoice == 0) {
                System.out.println("Your type was " + items[userChoice] + " | " + "Computer type was " + items[computerChoice] + " | " + " You have lost!");
            } else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("Your type was " + items[userChoice] + " | " + "Computer type was " + items[computerChoice] + " | " + " You have won!");
            } else {
                System.out.println("Wrong choice! Try again!");
            }

        scanner.close();
    }
}
