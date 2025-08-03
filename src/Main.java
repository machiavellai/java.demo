import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //if styatement = perform a block of code if the condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age = 40;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print(" Enter your AGe: ");
        age = scanner.nextInt();


        System.out.println("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();

        //Group1
        // to check if there's a value for the name
        //string method to check if tjere's a value for a string or if it's empty
        if(name.isEmpty()){
            System.out.println("you didn't enter you name");
        }
        else{
            System.out.println("hello " + name);
        }

        //group 2
        if(age >= 70){
            System.out.println("you are a senior 👴🏽");
        } else if (age >= 18) {
            System.out.println("you are an adult🧔🏽‍");
        } else if (age < 0) {
            System.out.println("you are not yet born");
        }
        else if (age == 0) {
            System.out.println("you are a baby");
        } else{
            System.out.println("you are child sucker!");
        }

        //Group 3
        if( isStudent){
            System.out.println("you are a student");
        }
        else{
            System.out.println("you are not a student");
        }

        scanner.close();
    }
}