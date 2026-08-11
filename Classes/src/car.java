import java.util.Scanner;

public class car {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        carFeatures car = new carFeatures();
        String userChoice;
        int addFuel;

        while(true)
        {
            System.out.println("Do you want to start or stop the car: ");
            userChoice = sc.nextLine();
            if(userChoice.equalsIgnoreCase("stop"))
            {
                System.out.println("Car has stopped");
                car.setIsDriving(false);
                break;
            }
            if(userChoice.equalsIgnoreCase("start")) {
                car.setIsRunning(true);
                System.out.println("Car has started");
                System.out.println("Do you want to drive: ");
                userChoice = sc.nextLine();
                if(car.getFuel() >= 90 && userChoice.equalsIgnoreCase("drive"))
                {
                    while(true)
                    {
                        System.out.println("Your fuel is at: " + car.getFuelConsumption());
                        if(car.getFuelConsumption() == 0)
                        {
                            System.out.println("Do you want to refuel: ");
                            userChoice = sc.nextLine();
                            if(userChoice.equalsIgnoreCase("refuel"))
                            {
                                System.out.println("How much do you want to refuel: ");
                                addFuel = sc.nextInt();
                                car.setFuel(addFuel);
                            }
                            else
                            {
                                System.out.println("Car broke down");
                                break;
                            }
                        }
                    }
                }

            }
        }
    }
}

