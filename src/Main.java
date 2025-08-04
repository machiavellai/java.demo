import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //mastering the nested if section
        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of %20\n");
                System.out.println("You also get a student account of %10");
                price *= 0.7;
            }else{
                System.out.println("you get a student discount of 10%");
                price  *= 0.9;
            }
        }else{
            if(isSenior){
                System.out.println("you get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }
        System.out.printf("The Price of a ticket is: $%.2f" , price);
    }
}