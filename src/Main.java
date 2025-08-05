import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        // working with ARRAY

        String[] fruits = {"apple", "orange", "coconut", "tuyyu"};

//        fruits[1] = "pineapple";
       // int numOfFruits = fruits.length;

        //using for loop to list through the list of array
//        for (int i = 0; i < fruits.length; i++) {
//            //printing each elemts of the array with index
//            System.out.print(fruits[i] + " ");
//        }


        //sorting your arrays
//        Arrays.sort(fruits);

        //fill method with Arrays
        Arrays.fill(fruits, "pineapple");

        //enhanced for loops/for each loop
        //where you have to delcare the data types of your items in array
        for(String fruit : fruits){
            System.out.println(fruit);

        }
    }

}
