/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author annab
 */
public class ExtraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //get variables from the user
        ArrayList list= new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (int) or -1 if you want to stop entering numbers:");
        int n;
        do{
          n=sc.nextInt();
          if(n != -1) list.add(n);
        } while (n != -1);        
        
        
        //instanciation + initialiation ExtraOperation
        ExtraOperation num = new ExtraOperation(list);
        
        //display results
        
        System.out.println("The maximum is "+ num.max());
        System.out.println("The minimum is "+ num.min());
        System.out.println("The average is "+ num.avg());
        
    }  
                
}
