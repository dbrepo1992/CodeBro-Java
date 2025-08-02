import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String[] questions = {"Which of the following is a compiled programming language?",
                              "In Python, what does the function len() do?",
                              "Which symbol is used for single-line comments in C++?"};

        String[][] options = {{"1) Python", "2) Java", "3) JavaScript", "4) HTML"},
                              {"1) Returns the length of an object", "2) Converts a number to a string","3) Creates a list", "4) Returns the last element of a list"},
                              {"1) #", "2) //", "3) <!-- -->", "4) /* */"}};



        int[] answers = {2, 1, 2};
        int score = 0;
        int guess = 0;

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("*******************************");

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess:");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("**************");
                System.out.println("You are right!");
                System.out.println("**************");
                score++;
            } else {
                System.out.println("**************");
                System.out.println("You are wrong!");
                System.out.println("**************");
            }
        }

        System.out.println("Your score is: " + score + " out of " + questions.length);

        scanner.close();
    }

}
