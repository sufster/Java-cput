/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author 219273421
 */
public class theSmallestNumber {
    public static void main(String args[])
    {
        int num1,num2,num3;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num1 = myScanner.nextInt();
        System.out.print("Enter a number: ");
        num2 = myScanner.nextInt();
        System.out.print("Enter a number: ");
        num3 = myScanner.nextInt();
        
        if(num1 < num2 && num1 < num3)
        {
            System.out.print("First number: " + num1 + ", is the smallest");
        }
        else if(num2 < num1 && num2 < num3)
        {
            System.out.print("Second number: " + num2 + ", is the smallest");
        }
        else if(num3 < num1 && num3 < num2)
        {
            System.out.print("Third number: " + num3 + ", is the smallest");
        }
        else
        {
            System.out.print("They are equal");
        }
    }
}
