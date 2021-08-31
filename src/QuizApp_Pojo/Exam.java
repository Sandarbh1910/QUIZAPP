/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_Pojo;

/**
 *
 * @author Sandarbh Taran
 */
public class Exam {
    
   private String examId;
   private String subject;
   private int total_no_of_questions;

    @Override
    public String toString() {
        return "Exam{" + "examId=" + examId + ", subject=" + subject + ", total_no_of_questions=" + total_no_of_questions + '}';
    }
    public Exam(String examId, String subject, int total_no_of_questions) {
        this.examId = examId;
        this.subject = subject;
        this.total_no_of_questions = total_no_of_questions;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTotal_no_of_questions() {
        return total_no_of_questions;
    }

    public void setTotal_no_of_questions(int total_no_of_questions) {
        this.total_no_of_questions = total_no_of_questions;
    }
   
    
   
}
