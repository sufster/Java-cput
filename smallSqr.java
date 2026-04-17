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
public class smallSqr {
    public static void main(String args[])
    {
        int num1,num2;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num1 = myScanner.nextInt();
        System.out.print("Enter a number: ");
        num2 = myScanner.nextInt();
        
        if(Math.sqrt(num1) < Math.sqrt(num2))
        {
            System.out.print("First number: " + num1 + ", is the smallest, the root is "+ Math.sqrt(num1));
        }
        else if(Math.sqrt(num2) < Math.sqrt(num1))
        {
            System.out.print("Second number: " + num2 + ", is the smallest, the root is "+ Math.sqrt(num2));
        }
        else
        {
            System.out.print("They are equal");
        }
    }
}
