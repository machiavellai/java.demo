import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     //MAD LIBS GAME
        //scanner will help us accept user inputs
        Scanner scanner = new Scanner(System.in);

        String Adjective;
        String noun1;
        String Adjective2;
        String verb;
        String Adjective3;

        System.out.print("Enter An adjective (description):");
        Adjective = scanner.nextLine();
        System.out.print("Enter a Noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter An adjective (description): ");
        Adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing(action: )");
        verb = scanner.nextLine();
        System.out.print("Enter An adjective (description): ");
        Adjective3 = scanner.nextLine();


        System.out.println("\nToday i went to a "+ Adjective + " zoo" );
        System.out.println("In an exhibit, i saw a " + noun1 + ".");

        System.out.println(noun1 +"was" + Adjective2 + " and " + verb + "!");
        System.out.println("I was " + Adjective3 + "!");


scanner.close();
    }
}