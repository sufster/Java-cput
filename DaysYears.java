import java.util.Scanner;

public class DaysYears {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int daysInput;

        int weeks, years;

        years = 365;
        weeks = 7;

        System.out.print("enter an amount of days: ");

        daysInput = myScanner.nextInt();

        int yearsCalc = daysInput/ years;
        int weeksCalc = daysInput/weeks;
        int daysCalc = daysInput/yearsCalc;

        System.out.println("days: " + daysCalc + " weeks: " + weeksCalc + " Years: " + yearsCalc);

    }
}
