import java.util.Scanner;

public class arrayBMI {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] height = new double[10];
        double[] weight = new double[10];

        int counter = 0;
        double bmi;
        while (counter < 10)
        {
            System.out.print("Enter height in integer(in meters): ");
            height[counter] = input.nextDouble();
            System.out.print("Enter weight in integer(in kg): ");
            weight[counter] =  input.nextDouble();
            counter++;
        }
        System.out.println("Height" +"\t" + "Weight"+"\t" + "BMI"+"\t" + "classification");
        for(int j=0;j<counter;j++)
        {
            bmi = weight[j]/Math.pow(height[j],2);
            if(bmi < 17)
            {
                System.out.println(height[j] +"\t" + weight[j]+"\t" + Math.round(bmi)+"\t" + "Underweight");
            }
            else if(bmi >= 17 && bmi < 25)
            {
                System.out.println(height[j] +"\t" + weight[j]+"\t" + Math.round(bmi)+"\t" + "Normal");
            }
            else if(bmi > 25 && bmi < 30)
            {
                System.out.println(height[j] +"\t" + weight[j]+"\t" + Math.round(bmi)+"\t" + "Overweight");
            }
            else
            {
                System.out.println(height[j] +"\t" + weight[j]+"\t" + Math.round(bmi)+"\t" + "Obese");
            }
        }
    }
}
