import java.util.Scanner;

public class tutorial22 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int birthday = 10;
        int guess;
        System.out.println("Enter a birthday number: ");

        guess = myScanner.nextInt();

        if(guess == birthday){
            System.out.println("Congratulations! You are 100% correct");
        } else if (guess < 0) {
            System.out.println("Sorry, enter a number between 1 and 12");
        }
        else{
            System.out.println("Sorry, Your guess is incorrect");
        }
    }
}
