import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

      int number = 0;

      do{
          System.out.print("enter a umber betwee 1-10: ");
          number = scanner.nextInt();

      }while  (number < 1 || number > 11);
        System.out.println(" You picked " + number);
//        //using while loop to make sure no one uses a negative value
//        while(age < 0){
//            System.out.println("Your Age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }
//
//        //now working with do-while loops
//        do {
//            System.out.println("Your Age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }while(age < 0);

        //when the age meet the requirements we then accept the input
//        System.out.println("Your are " + age + " Years old");

        scanner.close();
    }
}