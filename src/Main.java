import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start ; i > 0; i--){
            System.out.println(i);
            //implementing  threads is a java class used to cause a delay in output
            Thread.sleep(1000);
        }
        System.out.println("Happy new Year!!");

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter How many times you want to loop: ");
//        int max = scanner.nextInt();
//
//            for (int i = 0; i < max; i ++){
//                System.out.println(i);
//            }


//        // for loop = execute some code a  CERTAIN amount of times
//        //while loop executes an infinte number of times until it's no longer valid
//
//        //we declare a counter first in the loop or a loop control var
//        //Condtion Variable is second
//        for (int i =10; i >0; i-=2 ){
//            System.out.println(i);

//        scanner.close();
        }
    }
