
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annab
 */
public class Question {
    private QuestionType type;
    private String question;
    public static int numQuestions=0;
    private int num;
    
    //constructor
    public Question(QuestionType type, String question){
        this.type = type;
        this.question = question;
        this.num = ++numQuestions;
    }
    
    //accessors
    
    public String toString(){
        return question;
    }
    
    public QuestionType getType(){
        return type;
    }
    
    public int getNum(){
        return num;
    }
}
