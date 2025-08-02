import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     //common issues
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your AGe: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your Favorite color ");
        String color = scanner.nextLine();

        System.out.println("Enter your Favorite car ");
        String car = scanner.nextLine();

        System.out.println( "you are "+ age + " Years old");
        System.out.println("you like the color " + color);
        System.out.println("you like the car " + car);


        scanner.close();
        //it is good to close your scanner at the end of your application
    }
}