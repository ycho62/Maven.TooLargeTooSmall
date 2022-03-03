import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        int low = 1;
        int high = 25;
        int tries = 0;
        int memory = 0;
        boolean win = false;

        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int answer = random.nextInt(low, high);


        while (!win) {
            System.out.println("Guess a number between 1 - 25!");
            int guess = input.nextInt();

            if (guess == memory) {
                    System.out.println("Input was used");
            } else if (guess > answer) {
                System.out.println("Answer is too large");
                tries++;

            } else if (guess < answer) {
                System.out.println("Answer is too small!");
                tries++;

            }else if (guess == answer) {
                win = true;
                System.out.println("YOU GOT IT!");
                System.out.println("Number of tries: " + tries);
                System.out.println("Correct number was: " + answer);
        }
    }

    }}