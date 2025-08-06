import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
      //JAVA SLOT MACHINE
        Scanner scanner = new Scanner(System.in);

        //DECLARE VARIABLES
            int balance = 100;
            int bet;
            int payout;
            String [] row ;
            String playAgain;

        // DISPLAY WELCOME MESSAGE
        System.out.println("********************************");
        System.out.println("Welcome to Velli's slot games !");
        System.out.println("Symbols: 🍒🍉🍋🌟✨🌌");
        System.out.println("********************************");

        //PLAY IF THERE'S BALANCE
        while(balance >0){

            //        ENTER BET AMOUNT
            System.out.println("Current balance : $" + balance);
            System.out.print("place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //          VERIFY IF BET > BALANCE


            if (bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            //VERIFY IF BET > 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
            }else{
                balance -= bet;
//                System.out.println("$"+ balance);
            }
            //SPIN NOW
            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);

            //GET PAYOUT
           payout= getPayout(row, bet);

           if (payout > 0){
               System.out.println("You won $" + payout);
               balance += payout;
           }else{
               System.out.println("Sorry you lost this round");
           }
            System.out.print("Do you want to play again: ? ");
            playAgain = scanner.nextLine().toUpperCase();

           if (!playAgain.equals("Y")){
               break;
           }
        }

        System.out.println("You lost the gam Game overe");
        System.out.println("Your final balance is : "+ balance);

        scanner.close();
    }
    //creating a method to spin
    static String[] spinRow(){

        String [] symbols = {"🍒" ,"🍉","🍋","🌟","✨","🌌"};
        String [] row = new String[3];
        Random random = new Random();

        //for lloop for generation of our symbols

        for(int i = 0; i < 3; i++){
        row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[ ]row, int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
               case "🍒" -> bet * 3;
               case "🍉" -> bet * 4;
               case "🍋" ->  bet * 5;
                case "🌟" ->  bet * 10;
                case "✨" ->  bet * 15;
                case "🌌" ->  bet * 20;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 4;
                case "🍋" ->  bet * 5;
                case "🌟" ->  bet * 7;
                case "✨" ->  bet * 10;
                case "🌌" ->  bet * 12;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 4;
                case "🍋" ->  bet * 5;
                case "🌟" ->  bet * 7;
                case "✨" ->  bet * 10;
                case "🌌" ->  bet * 12;
                default -> 0;
            };
        }
        return  0;
    }
}
