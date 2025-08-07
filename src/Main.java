import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
                //Static = makes a variable or method belong to the class
                // rather than any specific object
                // commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("spongebob");
        Friend friend2 = new Friend("spongekid");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Krabbs");
        Friend friend5 = new Friend("Jason");

        Friend.showFriends();
        //it will print the numOfFriends to be 1 because each has a refernce
        // to the friend object


        //Now we want to use static keyword so it can keep in memory of the changes
        // it is better to use the class itself to reference any static method or cariables
        //for clarity

    }


}
