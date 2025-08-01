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
        int guess;

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("*******************************");



            for (int i = 0; i < questions.length; i++){
                System.out.println(questions[i]);
            }

        System.out.println(answersGroup.length);


        scanner.close();
    }

}
