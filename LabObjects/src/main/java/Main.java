
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    /*  I decided that an exam had a set of questions, that can be of different types (stored in an enum class). 
        An exam is taken by several students. Each student has a name and an id. 
        And we keep track of how many students and how many questions there are (thanks to static variables) to give a unique id to every student/question.
        Each student gives a set of answers that can be compared with the correction and then graded by the professor.
        An answer has a question type and a question number/id (to know what question the answer corresponds to 
        and a studentID to know what student has given this answer. If the student id is 0, it is the correction. 
    */
    public static void main(String[] args) {
        // TODO code application logic here
        //Students
        Student s1 = new Student("Toto");
        Student s2 = new Student("Tara");
        Student s3 = new Student("Titi");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1); students.add(s2); students.add(s3);
             
        //Questions
        Question q1 = new Question (QuestionType.MCQ, "1+1= A)0 B)1 C)2 D)3");
        Question q2 = new Question (QuestionType.TrueFalse, "6/3=2 :  True or False?");
        Question q3 = new Question (QuestionType.ShortAnswer, "What is the color of the ocean?");
        Question q4 = new Question (QuestionType.LongAnswer, "What is hapiness?");
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(q1); questions.add(q2); questions.add(q3); questions.add(q4);
        
        //Correction
        Answer c1 = new Answer(QuestionType.MCQ, 1, "B", 0);
        Answer c2 = new Answer(QuestionType.TrueFalse, 2, "True", 0);
        Answer c3 = new Answer(QuestionType.ShortAnswer, 3, "blue", 0);
        String hapiness = "Happiness is a state, not a trait; in other words, "
                + "it isn’t a long-lasting, permanent feature or personality trait, "
                + "but a more fleeting, changeable state.Happiness is equated with feeling "
                + "pleasure or contentment, meaning that happiness is not to be confused with joy,"
                + " ecstasy, bliss, or other more intense feelings.Happiness can be either feeling "
                + "or showing, meaning that happiness is not necessarily an internal or external experience, "
                + "but can be both.";
        Answer c4 = new Answer(QuestionType.LongAnswer, 4, hapiness, 0);
        ArrayList<Answer> correct = new ArrayList<Answer>();
        correct.add(c1); correct.add(c2); correct.add(c3); correct.add(c4);
        Correction correction = new Correction(correct);
        
        //Exam
        Exam exam = new Exam (questions, students, correction);
              
        //Students take the exam:
        Scanner sc = new Scanner(System.in);
        System.out.println("Exam time!");
        //for each student,  
        for (int i=0; i<Student.numStudents; i++){
            System.out.println("It is "+students.get(i).getName()+" turn");
            //for each question, the question is printed, and the answer of the student is stored
            for (int q=0; q<Question.numQuestions; q++){
                System.out.println(questions.get(q).toString());
                String answer = sc.nextLine();
                exam.addAnswer(new Answer (questions.get(q).getType(), questions.get(q).getNum(), answer, i));
            }
            //the file with the answers of the student is stored in a file with his name
            exam.saveFile(students.get(i).getName()+".txt",students.get(i) );
           
        }
          
                  
        
    }   
    
}
