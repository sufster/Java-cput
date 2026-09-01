import java.util.Scanner;

public class employ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee newEmployee = new employee();
        taxes newTaxes = new taxes();
        menu newMenu = new menu();

        System.out.println("Enter Name: ");
        newEmployee.setName(sc.nextLine());
        System.out.println("Enter Salary: ");
        newEmployee.setSalary(sc.nextInt());
        System.out.println("Enter Employee Number: ");
        newEmployee.setEmployeeNumber(sc.nextInt());
        int choice;
        double tax;

        newMenu.setMenu("Show Employee Name","Show Employee Number","Show Salary","Update Salary","Show All","Exit");

        if(newEmployee.getSalary() >6000 )
        {
            System.out.println("Salary exceeds 6000, you need to pay taxes, how much are the taxes: ");
            tax =  sc.nextDouble()/100;

            newTaxes.setTaxes(tax, newEmployee.getSalary());

            newEmployee.setSalary(newTaxes.getTaxes());
        }

        newMenu.setMenu();

        while (true){
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();
            if(choice==6)
            {
                break;
            }
            else if(choice==1)
            {
                newEmployee.showName();
            }
            else if(choice==2)
            {
                newEmployee.showEmployeeNumber();
            }
            else if(choice==3)
            {
                newEmployee.showSalary();
            }
            else if(choice==4)
            {
                System.out.println("Enter Your Salary: ");
                newEmployee.setSalary(sc.nextInt());
                if(newEmployee.getSalary() >6000 )
                {
                    System.out.println("Salary exceeds 6000, you need to pay taxes, how much are the taxes: ");
                    tax =  sc.nextDouble()/100;

                    newTaxes.setTaxes(tax, newEmployee.getSalary());

                    newEmployee.setSalary(newTaxes.getTaxes());
                }
            }
            else if(choice==5)
            {
                newEmployee.showAll();
            }
            newMenu.getMenu();
        }
    }
}
