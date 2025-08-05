import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       String[] emojis = {"1", "2", "3", "4", "5"};
       int balance = 100;
       int betAmount = 0;


        System.out.println("*************************");
        System.out.println("| Welcome to Java Slots |");

       for (int i = 0; i < emojis.length; i++){
           System.out.print(emojis[random.nextInt(5)]);
       }
        System.out.println("*************************");


        System.out.println();

        // System.out.println("| Symbols: " + emojis[0] + " " + emojis[1]+ " " + emojis[2]+ " " + emojis[3]+ " " + emojis[4]+ " " + " | ");



        System.out.printf("Current balance: $%d", balance);

        System.out.println("Place your bet amount: ");
        betAmount = scanner.nextInt();

        System.out.println("Spinning...");


        scanner.close();
    }
}
