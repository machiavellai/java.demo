import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //A Shopping Programme
        //we will use a scanner for input for what users want!

        Scanner scanner = new Scanner((System.in));

        String item ;
        double price;
        int quantity;
        char currency = '$';
        double total ;

        System.out.print("what Item would you like to buy : ");
        item = scanner.nextLine();

        System.out.print("What is the price of each  : ");
        price = scanner.nextDouble();

        System.out.print("How many woukd you like? : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nCustomer your total amount for "+ quantity + " "+ item+ " is : " +total);
        System.out.println( "Your total amount = " + total + " " + currency
        );
//        System.out.println(price
//        );



        scanner.close();
    }
}