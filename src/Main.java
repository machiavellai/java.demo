import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      //circumference = 2PI * Radius
        //area = Math.Pi * Math.pow( Rad, 2);

        Scanner scanner = new Scanner(System.in);

        double radius;
        double Circumference;
        double area;
        double volume;


        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();

        //calc Circumference

        Circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 2);


        System.out.println( "the Circumference is :" + Circumference+ "cm");
        System.out.println( "The Area is :" + area+ "cm²");
        System.out.println( "The Vlume is :" + volume+ "cm³");

        System.out.println(" \nNow working with formatted Strings");

        System.out.printf("the Circumference is: %.1fcm" , Circumference);
        System.out.printf("\nThe Area is: %.2fcm²" , area);
        System.out.printf("\nThe Volume is: %.1fcm³" , volume);

        scanner.close();

    }
}