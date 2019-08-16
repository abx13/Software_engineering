/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;
import java.util.Scanner; 

/**
 *
 * @author annab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //get variables from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number (int) :");
        int a = sc.nextInt();
        System.out.println("Enter second number (int) :");
        int b = sc.nextInt();
        System.out.println("Enter third number (int) :");
        int c = sc.nextInt();
       
        //instanciation + initialization of the Operation class
        Operation num = new Operation(a,b,c);
        
        //display results
        System.out.println("The maximum is "+ num.max());
        System.out.println("The minimum is "+ num.min());
        System.out.println("The average is "+ num.avg());
        
    }
}