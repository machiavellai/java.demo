import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
                //Constructors = A special method to initialize objects
                // You can pass arguments to a constructor
                // and set up initial values

        //calling the student class object
        Student student1 = new Student("SPongebob", 30, 3.3);
        Student student2 = new Student("Victor", 20, 2.9);
        Student student3 = new Student("Sandy", 27, 4.0);

        student1.study();
        student2.study();
        student3.study();
        //we are trying to change the name make it a unique name
        //So we need a constructor


    }


}
