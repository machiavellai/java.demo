import java.util.Random;
import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        // JAVA BANKING PROGRAM FOR BEGINNERS
        Scanner scanner = new Scanner(System.in);
        double balance = 0; //in case of.99 in amount
        boolean isRunning = true;
        int choice;

        //the interactive part of the code
        //i want the programm to run as long as is running= true
        // hence a while loop

        while (isRunning){
            System.out.println("******************");
            System.out.println("BANKING PROGRAMME");
            System.out.println("******************");
            System.out.println("1. Show balance: ");
            System.out.println("2. Deposit: ");
            System.out.println("3. Withdraw: ");
            System.out.println("4. Exit: ");
            System.out.println("******************");

            System.out.println("Enter your choice (1 -4): ");
            choice = scanner.nextInt();

            switch (choice){
                //in case one we will pass the showBalance method ...
                case  1 -> {
                   showBalance(balance);
                }
                case 2 ->{
                    balance += deposit();
                }
                case 3 ->{
                   balance -= withdraw(balance);
                }
                case 4 ->{
                    isRunning = false;
                }
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("******************");
        System.out.println("THANK YOU HAVE A NICE DAY");


        //withdraw()

        // DECLARE VAR

        //DISPLAY MENU

        //USERS PICK A CHOICE

        // GET AND PROCESS USERS CHOICE

        //SHOWBalance()

        //deposit()


        //EXIT MESSAGE
    }
    static void showBalance(double balance){
        System.out.println("******************");
        System.out.printf("$%.2f balance \n ", balance );
    }

    static double deposit(){
        double amount;
        System.out.print("Enter an Amont to b deposited: ... $");
        //we need to get deposit but we can't access the scaneer method
        // from the other methods because we can't see  the other variables

        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative!");
            return  0;

        }else{
            return  amount;
        }
    }

    static  double withdraw(double balance){
        double amount;
        System.out.print("ENter an Amount to be withdraw: ");
        amount = scanner.nextDouble();

        if(amount >balance)    {
            System.out.println("INSUFFICIENT FUNDS");
            return  0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return  0;
        }
        else{
            return  amount;
        }
    }
}
