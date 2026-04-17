/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author 219273421
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        char lett;
        
        System.out.println("Enter a letter: ");
                    
        lett = myScanner.next().charAt(0);
        
        lett = Character.toUpperCase(lett);
        
        switch (lett){
            case 'A':
                System.out.print("A is Alpha (Al fah)");
                break;
            case 'B':
                System.out.print("B is Bravo (brah voh)");
                break;
            case 'C':
                System.out.print("C is Charlie (char lee)");
                break;
            case 'D':
                System.out.print("D is Delta (del tah)");
                break;
            case 'E':
                System.out.print("E is Echo (eck oh)");
                break;
            case 'F':
                System.out.print("F is Foxtrot (foks trot)");
                break;
            case 'G':
                System.out.print("G is Golf (golf)");
                break;
            case 'H':
                System.out.print("H is Hotel (ho tell)");
                break;
            case 'I':
                System.out.print("I is India (in dee ah)");
                break;
            case 'J':
                System.out.print("J is Juliett (joe lee ett)");
                break;
            case 'K':
                System.out.print("K is Kilo (key loh)");
                break;
            case 'L':
                System.out.print("L is Lima (lee mah)");
                break;
            case 'M':
                System.out.print("M is Mike (mike)");
                break;
            case 'N':
                System.out.print("N is November (no vem ber)");
                break;
            case 'O':
                System.out.print("O is Oscar (oss cah)");
                break;
            case 'P':
                System.out.print("P is Papa (pah pah)");
                break;
        }
    }
}
