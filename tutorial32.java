import java.util.Scanner;

public class tutorial32 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double price;
        double[] sales = new double[5];
        double ave, sum = 0;

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter sales amount "+(i+1)+": ");
            price = input.nextDouble();
            sales[i] = price;
        }
        for(int j=0;j<5;j++)
        {
            sum += sales[j];
        }

        ave = sum/sales.length;
        System.out.print("The average sales price is "+ ave);
        System.out.println("\n\tSALES\n\t-----");

        for(int i=0;i<5;i++)
        {
            if(sales[i]>ave)
            {
                System.out.println(i + "\t" + sales[i]+"*");
            }
            else
            {
                System.out.println((i+1) + "\t" + sales[i]);
            }

        }
    }
}
