import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

     // 2D ARRAY = A Array is where each element is an array
        //useful for storing a matrix of data

        String [] fruits = {"orange", "apple", "watermelon"};
        String [] protein = {"meat", "chicken", "fish"};
        String[] vegetables = {"Potatoes", "onion"," carrot"};

        String [] [] groceries = {fruits, vegetables, protein};

        //replacing items in the multidimensional array
        groceries[0][0] = "Pineapple";
        groceries[2][0] = "Avocado";
        groceries[2][2] = "beetruit";

        //we have to use extended for loop because a normal for loop
        // will return a memory location
        for (String [] foods : groceries){
           for(String food : foods){
               System.out.print(food + " ");
           }
            System.out.println();
        }
    }
}
