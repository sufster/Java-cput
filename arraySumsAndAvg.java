import java.util.Scanner;

public class arraySumsAndAvg {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int[] number = new int[5];

        int counter = 0;

        int sum = 0;
        double avg;
        while(counter<5)
        {
            System.out.print("Enter a number: ");
            number[counter]= sc.nextInt();
            counter++;
        }
        for(int i = 0; i<number.length; i++)
        {
            sum+=number[i];
        }
        avg = sum/number.length;

        System.out.println("The sum is "+sum);
        System.out.println("The average is "+avg);

    }
}
