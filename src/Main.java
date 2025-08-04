import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

       //Using nested loops to work with arrays

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbols;

        System.out.print("ENter the number of Rows: " );
        rows = scanner.nextInt();

        System.out.print("Enter the number of Columns: " );
        columns = scanner.nextInt();

        System.out.print("Enter the symbok to use: ");
        symbols = scanner.next().charAt(0);

        //setting up the matrices
        //starting with columns
        //outer loop for
        for (int j =0; j < rows; j++){
            for (int i = 0; i < columns; i++){
                System.out.print(symbols);
            }
            System.out.println();
        }

        scanner.close();
//        //nested loop = A loop inside another loop
//        //              often used with Matrices or DS&A
//
//        //if you have a loop inside another loop give different variable name
//        for( int i = 1; i <=9; i++){
//            for( int j = 1; j <=9; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//

// break = break out of a loop (STOP)
//        //continue = skip current iteration of a loop (SKIP)
//
//        for(int i=1 ; i <=10; i++){
//
//            if (i == 5){
//                continue;
//            }
//            System.out.print(i + " ");
//        }
        }
    }
