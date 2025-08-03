import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Hypotenuse C = Math.sqrt(a2 + b2)😂


        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("enter the length of the side A: ");
        a = scanner.nextDouble();

        System.out.print("enter the length of the side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("the Hypotenuse (side c) is : " + c + "cm");
        scanner.close();
    }
}