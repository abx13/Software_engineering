/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;
import java.util.ArrayList;

/**
 *
 * @author annab
 */
public class ExtraOperation {
    
    //variables
    ArrayList<Integer> list;
    
    //constructor
    public ExtraOperation (ArrayList<Integer> list){
        this.list=list;
    }
    
    //function returning the maximum of three arguments
    public int max(){
        //create default value with 1st value of the list
        int max=list.get(0);
        //go through the list and memorize and reset the temporary maximum
        for (int i=0; i<list.size(); i++){
            if (list.get(i)>max){
                max=list.get(i);
            }
        }
        //return the overall maximum
        return max;
    }

    //function returning the minimum of three arguments
    public int min(){
        //create default value with 1st value of the list
        int min=list.get(0);
        //go through the list and memorize and reset the temporary minimum
        for (int i=0; i<list.size(); i++){
            if (list.get(i)<min){
                min=list.get(i);
            }
        }
        //return the overall minimum
        return min;

    }

    //function returning the average of a list of arguments
    public double avg(){
        int sum=0;
        //go through the list and sum up the different numbers
        for (int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        //do a flaot division to have the average
        return (sum*1.0)/list.size();
    } 
    
}
