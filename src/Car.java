

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2021;
    double price = 58000;
    boolean isRunning = false;


    //Methods of a class are what actions an object can do and how it works
    void start(){
        //you can make changes to an object attributes in a method
        isRunning = true;
        System.out.println("You Start the engine");
    }
    void stop(){
        //you can make changes to an object attributes in a method
        isRunning = false;
        System.out.println("You Stop the engine");
    }
    void  Drive(){
        System.out.println("You drive the "+ model);
    }

    void Break(){
        System.out.println("You break the "+ model);
    }



}
