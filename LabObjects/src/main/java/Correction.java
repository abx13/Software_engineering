
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
public class Correction {
    ArrayList<Answer> correctAnswers;
    
    //constructor
    public Correction(ArrayList<Answer> correctAnswers){
        this.correctAnswers = correctAnswers;
    }
    
    //accessor
    public String getAnswer(int n){
        for (int i=0; i<correctAnswers.size(); i++){
            if (correctAnswers.get(i).getNumQ() == n){
                return correctAnswers.get(i).getAnswer();
            }
        }
        return null;
    }
}
