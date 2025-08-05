import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        //overloaded methods = methods that share
        // the same name but different parameters
        //      signature = name + parameters

        String pizza = bakePizza("Flat Bread", "mozzarella", "Pepperoni");
        System.out.println(pizza);
    }
    static String bakePizza ( String Bread){
        return Bread + "  Pizza";
    }
    static String bakePizza ( String Bread, String cheese){
        return cheese + " " + Bread + "Pizza";
    }
    static String bakePizza ( String Bread, String cheese, String Topping){
        return Topping+ " "+ cheese + " " + Bread + " "+ "Pizza";
    }

}
