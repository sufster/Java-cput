import java.util.Scanner; //import scanner

public class StudentDetails {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //declaring scanner variable

        String initial, surname; // declaring string variable for initial and surname

        long stdNumber; //declaring long variable for student number

        System.out.print("Enter an initial: "); //asking for student initial

        initial = myScanner.nextLine();

        System.out.print("Enter a surname: "); //asking for surname

        surname = myScanner.nextLine();

        System.out.print("Enter a student number: "); //asking for student number

        stdNumber = myScanner.nextLong();

        System.out.println("\nYour initials are: " + initial + "\t\n Your surname is: " + surname + "\t\n Your student number is: " + stdNumber); //Gives final answer

    }
}
