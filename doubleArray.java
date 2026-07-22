import java.util.ArrayList;
import java.util.Scanner;

public class doubleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<>();
        double number;
        double sum =0, average;

        System.out.println("Enter array a value: ");
        number = input.nextDouble();

        while(true)
        {
            if(number<0)
            {
                break;
            }
            values.add(number);
            System.out.println("Enter array a value: ");
            number = input.nextDouble();
        }
        if(values.size()>0)
        {
            for(int i=0;i<values.size();i++)
            {
                sum += values.get(i);
            }
        }
        average = sum/values.size();

        System.out.println("The average price is: "+average);
        System.out.println("The average price is: "+sum);
    }
}
