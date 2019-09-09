/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annab
 */
public class Student {
    private String name;
    private int id;
    public static int numStudents=0;
    
    //constructor
    public Student(String name){
        this.name = name;
        this.id = ++numStudents;
    }
       
    //accessors:
    public String getName(){
        return name;
    }
    
    public int getID(){
        return id;
    }
    
}
