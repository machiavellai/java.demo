import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
                //OBJECT ORIENTED PROGRAMMING
                //OBJ= an entity that holds data (attributes)and can perform actions(Methods)
                // It is a reference data type
                // class is a blueprint to create an object

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //calling the car object defined
        Car car = new Car();

        //this will print a memory address because
        // it's a reference data type

        //modify the attributes of objects
        car.isRunning = true;

//        System.out.println(car.model);//dot. is a dot.operator
//        System.out.println(car.make);   // allows you to access things in an object
//        System.out.println(car.price);
//        System.out.println(car.isRunning);
//        System.out.println(car.year);

        //you input a check for the changes before and after the actions
        System.out.println("the engine is running: "+car.isRunning);
        car.start();
        System.out.println("the engine is running: "+car.isRunning);

        car.stop();
        System.out.println("the engine is running: "+car.isRunning);

        //creating a new car object
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);


    }


}
