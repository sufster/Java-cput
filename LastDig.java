import java.util.Scanner;

public class LastDig {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int number;

        System.out.print("Please enter a number: ");

        number = myScanner.nextInt();

        int answer = number % 10;

        System.out.println("The last digit is: " + answer);
    }
}
