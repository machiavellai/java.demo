import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        //overloaded methods = methods that share
        // the same name but different parameters
        //      signature = name + parameters

        System.out.println(add(3, 6));
        System.out.println(add(3, 6, 4));


    }
    static double add (double a, double b){
        return  a + b;
    }
    //the same method name but different parameters
    //no two methods can share two signatures
    static double add (double a, double b, double c){
        return  a + b + c;
    }
}
