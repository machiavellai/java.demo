import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        boolean isEmployee = true;
        double Height = 60.5;

        // now working[.precision]
        double price1 = 90.99;
        double price2 = 10.14;
        double price3 = -220.3;

        // now working[.width]
        int id1 = 99;
        int id2 = 14;
        int id3 = 203;
        int id4 = 2103;


        System.out.printf("Hello %s\n" , name );
        System.out.printf("Your Name Starts with a %c\n" ,firstLetter );
        System.out.printf("Your are %d years old\n" , age );
        System.out.printf("You are %1f inches tall\n", Height);
        System.out.printf("Employed:  %b\n", isEmployee);

        //combining different value of different datatype in the formatted string
        //setting the precision to the amount of numbers we want shown
        //output a plus (flags) for positive numbers

        // + = couput a plus
        // , = comma grouping sperators
        // ( = negative numbers enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.printf("%s is %d years old \n", name, age);
        System.out.printf("% .1f \n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .1f\n", price3);


        //working with width
        //0 = zero padding then add the amount of digits you want e.g.  printf("%0d\n", id1);
        // number = right justified padding  e.g printf("%4d\n", id2);
        // negative number = left justified padding e.g printf("%-4d\n", id1);

        System.out.println("Working with the width width formatted strings");
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%03d\n", id3);
        System.out.printf("%04d\n", id4);
    }
}