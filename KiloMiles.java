import java.util.Scanner;
public class KiloMiles {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        Double miles = 0.621371;
        Double kilo;

        System.out.print("Please enter an amount of kilometers: ");

        kilo = myScanner.nextDouble();

        System.out.print(kilo + "km" + " is equal to: " + (kilo *miles) + " miles ");
    }
}
