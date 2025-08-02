import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //accepting input with Scanner
        //system.in is to read the input
        Scanner scanner = new Scanner(System.in);

       //creating a prompt to prompt users to enter their names
        System.out.print("Enter your Name: ");
        //declaration and Assignment
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();


        System.out.print(" What is your GPA:? ");
        double Gpa = scanner.nextDouble();

        System.out.println("Are you a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean()
;
        System.out.println("Hello you are " + name + " And you are " + age + " Years old");
        System.out.println("Your GPA is : " + Gpa);

        if(isStudent){
            System.out.println("Student: "+ isStudent);
        }else{
            System.out.println(" No Acess! " + "You are not Enrolled");
        }
        scanner.close();
        //it is good to close your scanner at the end of your application
    }
}