/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annab
 */
public class Answer {
    private QuestionType type;
    private int numQ;
    private String answer;
    private int stuID;
    
    //constructor
    public Answer(QuestionType type, int numQ, String answer, int stuID){
        this.type = type;
        this.numQ = numQ;
        this.stuID = stuID;
        
        //we check if the answer type is correct, if not we print an error
        if (this.type == QuestionType.TrueFalse){
            if (answer.compareTo("True") == 0 || answer.compareTo("False") == 0 ){
                this.answer = answer;
            }else{
                System.out.println("Error: wrong answer type");
            }
        }else{
            if(this.type == QuestionType.MCQ){
                if (answer.compareTo("A") == 0 || answer.compareTo("B") == 0  || answer.compareTo("C") == 0  || answer.compareTo("D") == 0 ){
                    this.answer = answer;
                }else{
                    System.out.println("Error: wrong answer type");
                }
            }else{
                if (this.type == QuestionType.ShortAnswer){
                    if (answer.length()> 0 && answer.length()<100 ){
                        this.answer = answer;
                    }else{
                        System.out.println("Error: wrong answer type");
                    }
                }else{
                    if (this.type == QuestionType.LongAnswer){
                        if ( answer.length() >= 100 ){
                        this.answer = answer;
                        }else{
                            System.out.println("Error: wrong answer type");
                        }
                    }
                }
            }
        }
    }
    
    //accessor
    public String getAnswer(){
        return answer;
    }
    
    public int getNumQ(){
        return numQ;
    }
    
    public int getStuID(){
        return stuID;
    }
}

