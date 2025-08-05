import java.util.Random;
import java.util.Scanner;

public class Main {

    static  int x = 3; //Class

    public static void main(String[] args)  {
        //variable scope

        int x = 1;//local Var
        System.out.println(x);

        doSomething();
    }
    static void doSomething(){
        int x = 2;
        //another local variable

        System.out.println(x);
    }


}
