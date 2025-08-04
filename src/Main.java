import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // && Logical operator AND
        // || = OR
        // ! = NOT



        double temp = -7;
        boolean isSunny = false;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("the weather is Good Today!🕺🏽");
            System.out.println("It's Sunny outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("the weather is Good Today!🕺🏽");
            System.out.println("It's Cloudy outside");
        } else if (temp > 30 || temp <0) {
            System.out.println("The weather is really harsh");
        }
    }
}