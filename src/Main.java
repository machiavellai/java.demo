//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int year = 2025 ;
        int age = 34;

        double gap = 22.0;
        double temprature = 222.0;

        //when using char, it's a single object like a grade or symbol
        char grade = 'A';
        char symbol = '!';

        boolean isStudent = true;
        boolean isOnline = false;
        boolean forSale = false;

        //The boolean condition is similar to JavaScript
        if(isStudent && forSale){
            System.out.println("You are a student " + "It is on sale for ss3 students" );
        }
        else {
            System.out.println("Not available for non student");
        }
        //
        System.out.println(" my Grade last year was " + grade + symbol);
        System.out.println();
        System.out.println( " the Price is " + temprature + "$ " );
        System.out.println(" The year is " + year + " " + age);
    }
}