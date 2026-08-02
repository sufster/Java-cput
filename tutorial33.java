import java.util.Scanner;

public class tutorial33 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] fundRaiser = {"Malan","Jones","West","Nadille","King","Bester","Peters","Adams"};
        double[] amount = {50000,80000,45000,42000,61000,30000,49000,25000};

        System.out.println("People who raised > 30000");
        System.out.println("-----------------------------\n");
        System.out.println("Surname\t\t\tAmount");
        System.out.println("-------\t\t\t-------");
        for(int i=0;i<fundRaiser.length;i++)
        {
            if(amount[i] >= 30000)
            {
                System.out.println(fundRaiser[i] + "\t\t\t" +"R"+amount[i]);
            }
        }

    }
}
