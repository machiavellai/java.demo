import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //enhanced Switches - A replacement to using if/else statement

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week : ");
        String Day = scanner.nextLine();

        //generalizing similar switch cases
        // enhanced replacement for many if/else statements
        switch(Day){
            case  "Monday",
              "Tuesday" ,
              "Wednesday" ,
              "Thursday",
              "Friday"  -> System.out.println("It is a Weekday🙃");
            case  "Saturday" -> System.out.println("It is a Weekend🕺🏽");
            case  "Sunday" -> System.out.println("Let's go praise d day");
            default -> System.out.println(Day +" is not a day!" );


        }
        scanner.close();
    }
}