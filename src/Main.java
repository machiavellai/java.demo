import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Compound Interest calculator
        Scanner scanner = new Scanner(System.in);

        double principle;//principle amount
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("enter the principal amount : " );
        principle = scanner.nextDouble();

        System.out.print(" Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100 ; //for the division of percentile

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print(" ENter the Amount of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("The Amount after  %d years is $%,.0f ", years, amount);

        scanner.close();
    }
}