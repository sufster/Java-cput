import java.util.Scanner;

public class password2 {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        String userInput;
        boolean isNum = false;
        boolean isCap = false;
        boolean isSpec = false;

        System.out.println("Enter your password: ");
        userInput = myScanner.nextLine();

        for(char c: userInput.toCharArray())
        {
            if(Character.isDigit(c))
            {
                isNum = true;
            }
            if(Character.isUpperCase(c))
            {
                isCap = true;
            }
            if(!Character.isLetterOrDigit(c))
            {
                isSpec = true;
            }
        }
        while(true)
        {
            if(userInput.length() <= 6)
            {
                System.out.println("Password too short");
            }
            else if (userInput.length() >= 9)
            {
                System.out.println("Password too long");
            }
            else if (userInput.length() == 8 && isSpec && isCap && isNum) {
                System.out.println("Valid password");
                break;
            }
            else
            {
                System.out.println("Invalid password");
            }
            System.out.println("Enter your password: ");
            userInput = myScanner.nextLine();

            for(char c: userInput.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    isNum = true;
                }
                if(Character.isUpperCase(c))
                {
                    isCap = true;
                }
                if(!Character.isLetterOrDigit(c))
                {
                    isSpec = true;
                }
            }
        }
    }
}
