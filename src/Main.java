import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        //Java Quiz Game
        //Questions?

        String[] questions= {" Whats is the main function of router",
                             " What is the brain  of your body?",
                             "Who is the owner of tesla",
                             "What is the first programming language",
                             " Father of computer? ",
                             " Who is obama?"};

        //Options Array
        String[][] options= {{"1. Storing giles", "2. Encrypting data", "3. directing internet activity"},
                            {"1. head", "2.brain", "3. leg\n" },
                            {"1. elon musk", "2. will smith", "3.david beckhan\n"},
                            {"1. python", "2. C++", "3.Fortran\n"},
                            {"1. Steve jobbs", "2. Bill Gates", "3.Alan turing\n"},
                            {"1. former president", "2. that guy", "3. A racist\n"}};

        //Declare Variables
        int[] answeres = {3, 2, 1, 3, 3,1};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        //welcome message

        System.out.println("********************************");
        System.out.println("Welcome to the java Quiz Game! ");
        System.out.println("********************************\n");

        //Question(loop)
        for (int i=0; i < questions.length; i++){
            System.out.println(questions[i]);

            //enhanced for loops to loop through the options
            for (String option : options[i]){
                System.out.println(option);
            }
            //Get guess from User
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answeres[i]){
                System.out.println("***********");
                System.out.println("CORRECT!");
                System.out.println("***********");
                score++;
            }
            else {
                System.out.println("***********");
                System.out.println("WRONG!");
                System.out.println("***********");
            }
        }
        //Display final score
        System.out.println("Your final score is: "+ score + " out of " + questions.length);
        //Options

        //Check our Guess

scanner.close();
    }
}
