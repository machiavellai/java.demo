import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Temprature converter
        Scanner scanner = new Scanner (System.in);

        double temp;
        double newTemp;
        String unit;


        System.out.print(" Enter the Temprature : ");
        temp = scanner.nextDouble();

        System.out.print(" Convert to celsius or Fehrenheit? (C or F): ");
        //using method chaining incase there is a lowercase or uppercase of the UNits we use toupperCase()
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false
       newTemp = (unit.equals("C")) ? (temp - 32) * 5 /9 : (temp * 5/9) * 32;
        System.out.printf("Temprature is : %.1f° %s",newTemp , unit);



//       // ternary operator ? = return 1 of 2 values if a condition is true
//        //variable = (condition) ? ifTrue : ifFalse;
//
//        int hours = 9;
//        int income = 60000;
//        double taxRate = (income >= 40000) ? 0.25 : 0.15;
//        String timeOfDay = ( hours < 12) ? "A.M." : "P.M";
//
//
//
//        System.out.println(taxRate);

        scanner.close();
    }
}