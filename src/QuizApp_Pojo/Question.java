/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_Pojo;

import java.util.Objects;

/**
 *
 * @author Sandarbh Taran
 */
public class Question {
    private String examId;
    private int Qno;
    private String subject;
    private String option1,option2,option3,option4;

    @Override
    public String toString() {
        return "Question{" + "examId=" + examId + ", Qno=" + Qno + ", subject=" + subject + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4 + ", correctAnswer=" + correctAnswer + ", question=" + question + '}';
    }
    private String correctAnswer;
    private String question;

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Question other=(Question)obj;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        if (this.Qno != other.Qno) {
            return false;
        }
        if (this.examId.equals( other.examId)==false) {
            return false;
        }
        if (this.subject.equals( other.subject)==false) {
            return false;
        }
        if (this.option1.equals(other.option1)==false) {
            return false;
        }
        if (this.option2.equals( other.option2)==false) {
            return false;
        }
        if (this.option3.equals( other.option3)==false) {
            return false;
        }
        if (this.option4.equals( other.option4)==false) {
            return false;
        }
        if (this.correctAnswer.equals( other.correctAnswer)==false) {
            return false;
        }
        if (this.question.equals( other.question)) {
            return false;
        }
        return true;
    }

    public Question(String examId, int Qno, String subject, String option1, String option2, String option3, String option4, String correctAnswer, String question) {
        this.examId = examId;
        this.Qno = Qno;
        this.subject = subject;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
        this.question = question;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public int getQno() {
        return Qno;
    }

    public void setQno(int Qno) {
        this.Qno = Qno;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
}
