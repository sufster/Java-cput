import java.util.Scanner;

public class Sums {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double num1, num2, num3;

        System.out.print("Enter a number: ");
        num1 = myScanner.nextDouble();

        System.out.print("Enter another number: ");
        num2 = myScanner.nextDouble();

        System.out.print("Enter a third number: ");
        num3 = myScanner.nextDouble();

        System.out.print("The sum of those numbers you chose are: " + (num1+num2+num3));
    }
}