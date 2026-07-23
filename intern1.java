import java.util.Random;
import java.util.Scanner;

public class intern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        char playAgain;

        System.out.println("===================================");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("===================================");

        do {

            int randomNumber = random.nextInt(100) + 1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == randomNumber) {

                    System.out.println("\n Congratulations!");
                    System.out.println("You guessed the number correctly.");

                    System.out.println("Attempts Used: " + attempts);

                    int score = (maxAttempts - attempts + 1) * 10;

                    System.out.println("Score This Round: " + score);

                    totalScore += score;

                    guessed = true;

                    break;

                } else if (guess < randomNumber) {

                    System.out.println(" Too Low!");

                } else {

                    System.out.println(" Too High!");
                }

                System.out.println("Remaining Attempts: " + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("\n Game Over!");
                System.out.println("The correct number was: " + randomNumber);
            }

            System.out.println("\nTotal Score: " + totalScore);

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n===================================");
        System.out.println("Thank you for playing!");
        System.out.println("Final Score: " + totalScore);
        System.out.println("===================================");

        sc.close();
    }
}