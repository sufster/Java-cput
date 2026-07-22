import java.util.ArrayList;
import java.util.Scanner;

public class tutorial31 {
    public static void main(String[] args)
    {
        ArrayList<String> flyweight = new ArrayList<>();
        ArrayList<String> featherweight = new ArrayList<>();
        ArrayList<String> lightweight = new ArrayList<>();

        int weight;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a weight: ");
        weight = input.nextInt();

        while(weight != -1)
        {
            if(weight < 56)
            {
                flyweight.add("Flyweight");
            }
            if(weight < 57)
            {
                featherweight.add("Featherweight");
            }
            else
            {
                lightweight.add("Lightweight");
            }
            System.out.print("Enter a weight: ");
            weight = input.nextInt();

        }
        System.out.println("The number of Flyweight is: " +  flyweight.size());
        System.out.println("The number of Featherweight is: "  +  featherweight.size());
        System.out.println("The number of Lightweight is: "   +  lightweight.size());
    }
}
