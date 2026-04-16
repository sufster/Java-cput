import java.util.Scanner;

public class tutorials {
    public static void main(String[] args) {
        
        double price1, price2, price3, price4, price5, sum;
        String item_1, item_2, item_3,  item_4,  item_5;
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the name of the first item you want to buy: ");
        item_1 = myScanner.nextLine();
        System.out.print("Enter the price of the first item you want to buy: ");
        price1 = myScanner.nextDouble();
        myScanner.nextLine();

        System.out.print("Enter the name of the second item you want to buy: ");
        item_2 = myScanner.nextLine();
        System.out.print("Enter the price of the second item you want to buy: ");
        price2 = myScanner.nextDouble();
        myScanner.nextLine();

        System.out.print("Enter the name of the third item you want to buy: ");
        item_3 = myScanner.next();
        System.out.print("Enter the price of the third item you want to buy: ");
        price3 = myScanner.nextDouble();
        myScanner.nextLine();

        System.out.print("Enter the name of the fourth item you want to buy: ");
        item_4 = myScanner.nextLine();
        System.out.print("Enter the price of the fourth item you want to buy: ");
        price4 = myScanner.nextDouble();
        myScanner.nextLine();

        System.out.print("Enter the name of the fifth item you want to buy: ");
        item_5 = myScanner.nextLine();
        System.out.print("Enter the price of the fifth item you want to buy: ");
        price5 = myScanner.nextDouble();
        myScanner.nextLine();

        System.out.println("======================================================");
        
        System.out.println("You have selected the following items: ");
        
        System.out.println("------------------------------------------------------");

        System.out.println("Item: " + item_1+" at "+price1);
        
        System.out.println("Item: " + item_2+" at "+price2);
        
        System.out.println("Item: " + item_3+" at "+price3);
        
        System.out.println("Item: " + item_4+" at "+price4);
        
        System.out.println("Item: " + item_5+" at "+price5);

        sum = price1+price2+price3+price4+price5;

        System.out.println("------------------------------------------------------");

        System.out.println("total due for all items: "+sum);
    }
}
