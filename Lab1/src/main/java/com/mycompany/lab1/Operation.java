/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author annab
 */
public class Operation {
    //variables
        int a,b,c;
        
    //constructor
    public Operation (int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    //function returning the maximum of three arguments
    public int max(){
        //comparing 1st and 2nd arguments
        if (a<=b) {
            //comparing 2nd and 3rd arguments
            if (c<=b){
                return b;
            }else{
                return c;
            }  
        }else{
            //comparing 1st and 3rd arguments
            if (c<=a){
                return a;
            }else{
                return c;
            }
        }

    }

    //function returning the minimum of three arguments
    public int min(){
        //comparing 1st and 2nd arguments
        if (a<=b) {
            //comparing 1st and 3rd arguments
            if (a<=c){
                return a;
            }else{
                return c;
            }  
        }else{
            //comparing 2nd and 3rd arguments
            if (b<=c){
                return b;
            }else{
                return c;
            }
        }

    }

    //function returning the average of three arguments
    public double avg(){
        return (a+b+c)/3.0;
    }
}
