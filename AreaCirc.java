import java.util.Scanner;

public class AreaCirc {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        double radius;

        System.out.print("Enter a measurement: ");
        radius = myScanner.nextDouble();
        System.out.println("The area is: "+ (Math.PI*Math.pow(radius,2)) + " and the circumference is: " +
                (Math.PI*2*radius));
    }
}
