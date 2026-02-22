import java.util.Scanner;

public class RemaQuo {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter a number: ");

        num1 = myScanner.nextInt();

        System.out.print("Enter another number: ");

        num2 = myScanner.nextInt();

        System.out.println("The quotient for: " + num1 + " = " + num1/2 + " remainder: " + num1%2);
        System.out.print("The quotient for: " + num2 + " = " + num2/2 + " remainder: " + num2%2);
    }
}
