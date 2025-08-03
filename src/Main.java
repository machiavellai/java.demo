import java.util.Random;
//importing random class
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //working and genrating Random numbers

        //initializing the random object
        Random random = new Random();

        boolean isHeads ;
        int number1 ;
        int number2 ;
        int number3 ;

        //setting a bounds for the random number for range
        // 6 in exclusive and 1 is inclusive( origin && Bound)
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1,8);
        number3 = random.nextInt(2, 8);

//        System.out.println(isHeads);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}