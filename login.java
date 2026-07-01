import java.util.Scanner;
public class login {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String givenUsername = "Adadajdi1";
        String givenPassword = "Aaaaaa1!";

        System.out.print("Enter your username : ");
        String username = input.nextLine();
        System.out.print("Enter your password : ");
        String password = input.nextLine();

        int attempts = 0;

        while (attempts < 3)
        {
            if(username.equals(givenUsername) && password.equals(givenPassword))
            {
                System.out.println("You logged in");
                break;
            }
            else{
                System.out.println("Invalid username or password");
            }
            attempts++;
            if (attempts == 3)
            {
                System.out.println("Too many attempts");
                break;
            }
            System.out.print("Enter your username : ");
            username = input.nextLine();
            System.out.print("Enter your password : ");
            password = input.nextLine();
        }

    }
}
