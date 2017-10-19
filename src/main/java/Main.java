import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static String getStringInput(String prompt) {
        println(prompt);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public static Integer getIntegerInput(String prompt) {
        return Integer.parseInt(getStringInput(prompt));
    }

    public static void println(String str) {
        printlnf(str);
    }

    public static void printlnf(String str, Object... args) {
        System.out.println(String.format(str, args));
    }








    public static void main(String[] args) {
        int min = 0;
        int max = 5;
        int mysteryNum = ThreadLocalRandom.current().nextInt(min, max);
        String response = "Your guess was too %s.";

        // TODO - This print statement is for testing purposes; this should be removed in production
        println("The mystery value is secretly " + mysteryNum);

        int numberOfGuesses = 0;
        int prevGuess = min - 1; // a value out of guessing range
        int currentGuess;

        do {
            println("\n\nAttempt to guess the mystery number.");
            printlnf("The value is between %s and %s inclusively.", min, max);

            currentGuess = getIntegerInput("Enter your guess:");
            boolean consecutiveGuess = (prevGuess == currentGuess);
            boolean tooHigh = currentGuess > mysteryNum;
            boolean tooLow = currentGuess < mysteryNum;

            if(tooHigh) printlnf(response, "high");
            if(tooLow) printlnf(response, "low");

            if(!consecutiveGuess) {
                numberOfGuesses++;
            }
        } while(currentGuess != mysteryNum);
        println("You have guessed the correct value!");
        println("Number of guesses: " + numberOfGuesses);
    }
}
