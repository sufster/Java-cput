import java.util.Scanner;

public class MinutesToHours {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //initializes the scanner

        double minutes; //creates variable for minutes

        System.out.println("Enter number of minutes:"); //asks for user input

        minutes = myScanner.nextDouble(); //stores minutes in scanner

        System.out.println("The number of hours is: " + (minutes/60) + " hour(s) "); //gives output and calculates minutes
    }
}
