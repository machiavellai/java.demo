import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        //searching through an array

        int[] numbers = {1,9,8,5,6,3,2};
        //we need a target to search for
        String[] fruits = {"Orange", "apple", "Banana"};

        String target2 = "Orange";
        int target = 8;

        //initialized a boolean operator for th found or not found case
        boolean isFound = false;

        //performing a linear search
        for ( int i = 0 ; i < numbers.length; i++){
            if (target == numbers[i]){
                System.out.println("Element found at index : " + i);
                //we implement break here because
                // we have found the element so it should stop searching
                isFound = true;
                break;
            }
        }

        //working with search of array with integers
        for ( int i = 0 ; i < numbers.length; i++){
            if (fruits[i].equals(target2)){
                System.out.println("Element found at index : " + i);
                isFound = true;
                break;
            }

        }
        if (!isFound){
            System.out.println("Element not Found in the Array");
        }
    }

}
