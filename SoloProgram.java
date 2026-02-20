public class SoloProgram {
    public static void main(String[] args){
        int anInt = 15; //declaring 15 as a variable value

        int cube = Math.powExact(anInt, 3); //raising 15 to the power of 3

        String doubleLine = "===============";//declaring a string ===============

        int quote = 15/7; // calculating the quotient

        int remaind = 15%7; //calculating the remainder

        System.out.println(doubleLine); //outputs the doubleLine variable showing ===============

        System.out.println(anInt +  " cubed is " + cube); //outputs the answer for the cube variable

        System.out.println(anInt + " divide by 7 is " + quote + " remainder "+ remaind); //outputs the quotient and remainder

        System.out.println("The sum of " + cube + " and  " + remaind + " is " + (cube+remaind)); //gives the sum for the cube and remainder

    }
}
