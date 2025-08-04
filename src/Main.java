import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      //username must be btw 4-12 characters
        //username must not contain spaces or underscores


        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() >12){
            System.out.println("Username must be between 4 - 12 characters");
        } else if(username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain Spaces or UnderScores");
        }

        else {
            System.out.println("Welcome : " + username);
        }
    }
}