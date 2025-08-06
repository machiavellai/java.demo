import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        //when we initialize an empty array
        //        String[] foods ={};

        //allocate space for the array
        String[] foods;
        int size;

        //the user will set the size
        System.out.print("what number of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        //and the size will be passed down here
        foods = new String[size];

        for (int i = 0; i < foods.length ; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }
//        //if you try to allocate it won't work
//

//        System.out.println(foods.length);
        scanner.close();
    }

}
