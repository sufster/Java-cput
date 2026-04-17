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
public class smallestNumber {
    public static void main(String args[])
    {
        Scanner myScanner = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Enter a number ");
        num1 = myScanner.nextInt();
        System.out.print("Enter another number ");
        num2 = myScanner.nextInt();
        
        if(num1 < num2)
        {
            System.out.print(num1 + " is smaller than " + num2);
        }
        else if(num2 < num1)
        {
            System.out.print(num2 + " is smaller than " + num1);
        }
        else
        {
            System.out.print("They are even");
        }
    }
}
