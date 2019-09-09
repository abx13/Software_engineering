
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annab
 */
public class Exam {
    private ArrayList<Question> questions;
    private ArrayList<Answer> answers;
    private ArrayList<Student> students;
    private Correction correction;
    
   //constructor
    public Exam(ArrayList<Question> questions, ArrayList<Student> students, Correction correction){
        this.questions = questions;
        this.students = students;
        this.correction = correction;
        this.answers = new ArrayList<Answer>();
    }
    
    //add an answer to the list of answers
    public void addAnswer(Answer a){
        this.answers.add(a);
    }  
    
    //save a file with the answers of each student, the name of the file is the name of the student
    void saveFile(String filename, Student s) { 
        String str = "";
        for (int i=0; i<answers.size(); i++){
            str += answers.get(i).getAnswer()+"\n";
        }
        try {    
            Files.write(Paths.get(filename), str.getBytes());  
        } catch (IOException ex) {            
            Logger.getLogger(s.getName()).log(Level.SEVERE, null, ex); 
        }  
    }
    
    
    
    
}
