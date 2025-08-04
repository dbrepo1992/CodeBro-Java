import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice;
        String playerChoice;
        String playAgain = "yes";
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("******************************************************");
        System.out.println("|     WELCOME TO ROCK, PAPER, SCISSORS JAVA GAME!    |");
        System.out.println("******************************************************");


            do {
                System.out.println("Enter your choice (rock, paper, scissors): ");
                playerChoice = scanner.nextLine().toLowerCase();


                if (!playerChoice.equals("rock") &&
                        !playerChoice.equals("paper") &&
                        !playerChoice.equals("scissors")) {
                    System.out.println("Wrong choice! Try again");
                    continue;
                }

                computerChoice = choices[random.nextInt(3)];
                System.out.println("Computer choice: " + computerChoice);


                if (playerChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                    System.out.println("You win!");
                    playerScore++;
                } else {
                    System.out.println("You lose!");
                    computerScore++;
                }
                System.out.println("Your score: " + playerScore);
                System.out.println("Computer score: " + computerScore);
                System.out.println("Out of: " + (playerScore + computerScore) + " rounds");
                System.out.println("Play again? (yes/no)");
                playAgain = scanner.nextLine().toLowerCase();

            } while (playAgain.equals("yes"));

        System.out.println("Good bye!");

        scanner.close();
    }
}
