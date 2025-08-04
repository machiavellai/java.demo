import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Number Guessding Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // guess
        int guess;
        int attempts =0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("<<<<<<<<<< Number Guessing Game >>>>>>>>>>>>>");
        System.out.printf("Guess a number between %d - %d: \n", min, max);

        do {
        //do the condition here...keep playing
            System.out.print("Enter A Guess: ");
            guess = scanner.nextInt();
            attempts++;
//ll
            //check to see if the guess is less than the random number and various conditions
            if (guess < randomNumber){
                System.out.println("Too low Try AGain");
            }
            else if (guess > randomNumber){
                System.out.println("Too High Try AGain");
            }
            else {
                System.out.println("You Won 🥇");
                System.out.println("Correct the number was : " + randomNumber);
                System.out.println("Number of Attempts " + attempts);
            }
        }while (guess != randomNumber); //while the guess doesn't equal to our random guess

        scanner.close();
    }
}