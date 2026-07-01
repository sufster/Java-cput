import java.util.Scanner;

public class pssword {
    public static void main(String[] args)
    {
        Scanner myScanner =  new Scanner(System.in);
        String password;

        System.out.println("Enter your password: ");
        password = myScanner.nextLine();

        while(true)
        {
            if(password.length() <= 6)
            {
                System.out.println("Password too short");
            }
            else if (password.length() >= 9)
            {
                System.out.println("Password too long");
            }
            else if (password.length() == 8 && password.matches(".*[^a-zA-Z0-9].*") && password.matches(".*[A-Z].*")) {
                System.out.println("Valid password");
                break;
            }
            else
            {
                System.out.println("Invalid password");
            }
            System.out.println("Enter your password: ");
            password = myScanner.nextLine();
        }
    }
}
