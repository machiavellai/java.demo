import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        //method is a block of reusable block of code that is executed when called()

       double result =  square(3);
        System.out.println(result);

        String FUllName = getFullName("Victor", "Oghene");
        System.out.println(FUllName);

        int age = 10;
        if (ageCheck(age)){
            System.out.println("You may Sign up!");
        }else{
            System.out.println("You must be 18+ to sign up");
        }
    }
    //declaring the method
    //to do an action
    // it needs a return type, name for method and parenthesis
    // adding "static void" because we are in a static class

    static void happyBirthday(String name, int age){
        System.out.println("happy Birthday to you");
        //there's an error because methods are not
        // familiar with methods in another variable
        //it's like 2 neighbours on the same street

        System.out.printf("happy Birthday Dear %s!\n", name);
        System.out.printf("you Are %d yars old\n", age );
        System.out.println("happy Birthday to you\n");
    }
    static  double square(double number){
        return  number * number ;
    }
    static double cube (double number ){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static  boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }else{
            return false;
        }
    }


}
