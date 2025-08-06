import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        User user1 = new User("Spongebob");
        User user2 = new User("Pat", "oghene.com");
        User user3 = new User("slls", "oggh@gmail.com", 33);
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.age);
        System.out.println(user4.email);


//        System.out.println(user1.username);
//        System.out.println(user1.age);
//        System.out.println(user1.email + "\n");
//
//        System.out.println(user2.username);
//        System.out.println(user2.age);
//        System.out.println(user2.email + "\n");
//
//        System.out.println(user3.username);
//        System.out.println(user3.age);
//        System.out.println(user3.email + "\n");
    }


}
