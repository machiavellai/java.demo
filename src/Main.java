import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //.susbsctring() = A method used to extract a portion of a string
//        .substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email ;
        String username;
        String Domain;

        System.out.print("Enter your Email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            //using this to create a substring of the email
            //we use the indexOf() method to select the strings before hthat highlighted character
            username = email.substring(0,email.indexOf("@"));

            //adding the +1 because we want to remove the '@' symbol
            String domain = email.substring(email.indexOf("@") +1);


            System.out.println(username);
            System.out.println(domain);
        }else {
            System.out.println("Error, Emails must contains! @");
        }

        scanner.close();
    }
}