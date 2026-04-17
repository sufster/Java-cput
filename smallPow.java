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
public class smallPow {
    public static void main(String args[])
    {
        int num1,num2;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num1 = myScanner.nextInt();
        System.out.print("Enter a number: ");
        num2 = myScanner.nextInt();
        
        if(Math.pow(num1,2) < Math.pow(num2,2))
        {
            System.out.print("First number: " + num1 + ", is the smallest, the root is "+ Math.pow(num1,2));
        }
        else if(Math.pow(num2,2) < Math.pow(num1,2))
        {
            System.out.print("Second number: " + num2 + ", is the smallest, the root is "+ Math.pow(num2,2));
        }
        else
        {
            System.out.print("They are equal");
        }
    }
}
