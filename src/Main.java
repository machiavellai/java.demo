import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
            //Creating an Array of Objects
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        //anonymous object
//        Car[] cars = {new Car("Mustang", "Red"),
//                new Car("Corvette", "Blue"),
//                new Car("Charger", "yello")};

        //initializing the array object
//        Car[] cars = new Car[3];
         Car[] cars = {car1, car2, car3};
         for( Car car : cars){
             car.drive();
         }
         //using a for loop
//        for (int i=0; i <cars.length; i++){
//            cars[i].drive();
//        }

    }


}
