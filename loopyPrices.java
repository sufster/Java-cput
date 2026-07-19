import java.util.Scanner;

public class loopyPrices {
    public static void main(String[] args)
    {
        double[] prices = new double[5];
        Scanner input = new Scanner(System.in);
        double sum = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter price for: ");
            prices[i] = input.nextDouble();
        }

        for(double price : prices)
        {
            sum+=price;
        }
        System.out.println("Your price is: "+sum);
    }
}
