import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // Your name here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guessNumber = random.nextInt(50) + 1;
        int attempts = 0;
        int guess;
        boolean correct = false;

        while (!correct) {
            attempts++;
            System.out.print("Enter a number from 1 - 50 (Attempt #" + attempts + "): ");
            guess = scanner.nextInt();
            if (guess == guessNumber) {
                System.out.println("Congratulations, you got it right after " + attempts + " attempts");
                correct = true;
            } else if (guess > guessNumber) {
                System.out.println("The guess number is lower than " + guess);
            } else {
                System.out.println("The guess number is higher than " + guess);
            }
        }
    }
}