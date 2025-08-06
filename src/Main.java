import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
       //Rock papaer scissors game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String ComputerChoice;
        String  playAgain = "yes";
do {
    System.out.print("Enter your move (rock, paper, scissors): ");
    playerChoice = scanner.nextLine().toLowerCase();

    if (!playerChoice.equals("rock")&&
            !playerChoice.equals("paper") &&
            !playerChoice.equals("scissors")){
        System.out.println("Invalid choice");
        continue;
    }

    ComputerChoice = choices[random.nextInt(3)];
    System.out.println("Computer choice: "+ ComputerChoice);

    if (playerChoice.equals(ComputerChoice)){
        System.out.println("It's a tie");
    } else if ((playerChoice.equals("rock") && ComputerChoice.equals("scissors")) ||
            (playerChoice.equals("paper") && ComputerChoice.equals("rock")) ||
            (playerChoice.equals("scissors") && ComputerChoice.equals("paper"))){
        System.out.println("You Win!");
    }  else{
        System.out.println("you loose!");
    }
    //Play Again
    System.out.print("Play Again Yes/No: ");
    playAgain = scanner.nextLine().toLowerCase();

    }while(playAgain.equals("yes"));

        System.out.println("Thanks for Playing");

        scanner.close();
    }
}
