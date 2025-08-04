import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CALCULATOR WITH ENHANCED SWITCHES
       Scanner scanner = new Scanner(System.in);

       double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("enter an operator: (+ ,- ,*, /, ^) ");
        operator = scanner.next().charAt(0);
//calc
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            //this are commands that are given based on what cases
            // we have, which is the benefit os the enhanced switch
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;

                //we will enhance this becayse if we divide a var by 0 we get infinity

                case '/' -> {
                    if(num2 == 0){
                        System.out.println("Cannot divide by zero");
                        validOperator = false;

                    }else{
                        result = num1 / num2;
                    }
                }
                case '^' -> result= Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator");
                validOperator = false;
            }
        }
        if(validOperator){
            //we still display result
            //we need to make sure we only have a result when we have a valid operator
            System.out.printf("The result is %.1f",result);
        }


        scanner.close();
    }
}