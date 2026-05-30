
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playagain;

        do { 
            
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println("Welcome to Number Game!");
        System.out.println("Guess a number between 1 and 100");

        while (guess != number && attempts < maxAttempts) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                score++;
                System.out.println("Congratulations!");
                System.out.println("You guessed the number in " + attempts + " attempts.");
                System.out.println("Score: " + score)   ;
            }
        }
        if (guess != number) {
            System.out.println("Game Over!");
            System.out.println("The correct number was: " + number);
        }

        System.out.println("Do you want to play again? (Y/N): ");
        playagain = sc.next().charAt(0);

    }while (playagain == 'Y' || playagain == 'y');

        sc.close();
    }   
}
