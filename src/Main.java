import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String name = "biggie";

//       int length = name.length();
//       char letter = name.charAt(2);
//       int index = name.indexOf("r");
//        int lastIndex = name.lastIndexOf("c");

//        name = name.replace("o", "a");
//        name = name.trim();
//        name = name.toUpperCase();
//        name


//        if(name.isEmpty()){
//            System.out.println("Your Name is EMpty");
//        }else{
//            System.out.println("Hello " + name
//            );
//        }

        //add equalsIgnoreCase
        if(name.equalsIgnoreCase("Biggie")){
            System.out.println("your name contains Biggie");
        }else{
            System.out.println("Your name doesn't contain Biggie");
        }

//        if(name.contains("Biggie")){
//            System.out.println("your name contains a space");
//        }else{
//            System.out.println("Your name doesn't contain spaces");
//        }

//        System.out.println(name);
//        System.out.println(length);
//        System.out.println(letter);
//        System.out.println(index);
//        System.out.println(lastIndex);
    }
}