import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //initializes scanner

        int num; //creates variable for number

        System.out.println("Enter a number:"); //asks for user input

        num = myScanner.nextInt(); //stores number in scanner

        System.out.println("The square of: "+num +" is: "+Math.pow(num, 2)); //calculates square of number

        System.out.println("The cube of: "+num +" is: "+Math.pow(num, 3)); //calculates cube of number
    }
}
