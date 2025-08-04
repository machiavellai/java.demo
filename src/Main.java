import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //WEIGTH CONVERSION PROGRAMME

        Scanner scanner = new Scanner(System.in);

//        DECLARING VARIABLES
        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight COnversion Programme");
        System.out.println("step 1: Convert Lbs to Kg");
        System.out.println("Step 2: Weight COnversion Programme");

        System.out.print(" Choose an Option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weitgh in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("The new Weight in Kgs is: %.1f" , newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weitgh in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("The new Weight in lbs is: %.1f" , newWeight);
        }
        else{
            System.out.println("Not a valid Choice");
        }

//        SHOW WELCOME MESSAGE

        //promot for user choice Using scanner

        // covert the lbs to kgs

        //option 2 convert kgs to lbs
        scanner.close();
    }
}