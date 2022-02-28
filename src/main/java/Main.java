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
        boolean win = false;
//        int numguess = 0
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int answer = random.nextInt(low, high);
//        System.out.println(answer);

        while (!win) {
            System.out.println("Guess a number between 1 - 25!");
            int guess = input.nextInt();
            tries++;
            if (guess == answer) {
                win = true;
                System.out.println("YOU GOT IT!");
                System.out.println("Number of tries: " + tries);
                System.out.println("Correct number was: " + answer);
            } else if (guess > answer) {
                System.out.println("Answer is too large");

            } else if (guess < answer) {
                System.out.println("Answer is too small!");

            }

        }
    }

    }