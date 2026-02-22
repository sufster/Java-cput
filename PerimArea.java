import java.util.Scanner;
public class PerimArea {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //initializes scanner

        double length, width; //creates double variable for length and breadth

        System.out.print("Enter a length: "); //gets user input for length

        length = myScanner.nextDouble(); //stores length as scanner input

        System.out.print("Enter a width: "); //gets user input for width

        width = myScanner.nextDouble(); //stores width


        //gives output for the calculation for area and perimeter
        System.out.println("The area is: " + (length*width) + " and the perimeter is: " + (2*(length*width)));
    }
}
