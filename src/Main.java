import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     //application of scanner to calculate area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner((System.in));

        System.out.print("Enter the Width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the Height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("the Area is: " + area + " cm");

        //ensure to always close the scanner object
        scanner.close();

    }
}