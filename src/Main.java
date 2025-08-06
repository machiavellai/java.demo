import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        //searching through an array

        int[] numbers = {1,9,8,5,6,3,2};
        //we need a target to search for
        String[] fruits = {"Orange", "apple", "Banana"};
        boolean isFound = false;
        int target;
        String target2;

        System.out.print(" Enter a number to search for: ");
        target = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" Enter a fruit to search for: ");
        target2 = scanner.nextLine();
        //initialized a boolean operator for the found or not found case


        //performing a linear search
        for ( int i = 0 ; i < numbers.length; i++){
            if (target == numbers[i]){
                System.out.println("Number found at index : " + i);
                //we implement break here because
                // we have found the element so it should stop searching
                isFound = true;
                break;
            }
        }

        //working with search of array with integers
        for ( int i = 0 ; i < numbers.length; i++){
            if (fruits[i].equals(target2)){
                System.out.println( target2 + " Fruit found at index : " + i);
                isFound = true;
                break;
            }

        }
        if (!isFound){
            System.out.println("Element not Found in the Array");
        }
        scanner.close();
    }

}
