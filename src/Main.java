import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

       //Var Args == allow methodss to collect a varying
        // amount of args into a methods which amkes the method felcible,
        // no need for overloaded methods,
        // java will pack the args into an array  ...(elipses)


        System.out.println( average(1,9,8,6));


    }
//        static int add(int... numbers){
//           //declare a  local var
//            int sum = 0;
//
//            for (int number : numbers){
//                sum += number;
//            }
//            return sum;
//
//        };

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for (double number : numbers){
            sum+= number;
        }
        return  sum / numbers.length;
    }
}
