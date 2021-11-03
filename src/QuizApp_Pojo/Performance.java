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
public class Performance implements Comparable {
     private String examId;
    private String subject;
    private String userId;
    private int right;
    private int wrong;
    private int unattempted;
    private double percent;

    public Performance(String examId, String subject, String userId, int right, int wrong, int unattempted, double percent) {
        this.examId = examId;
        this.subject = subject;
        this.userId = userId;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.percent = percent;
    }
    
   

   

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
     @Override
    public int compareTo(Object p)
    {
        Performance perf=(Performance)p;
        if(perf.getPercent()==this.getPercent())
        {
            if(perf.getExamId().compareTo(this.getExamId())==0)
            {
                return 0;
            }
            
            else if(perf.getExamId().compareTo(this.getExamId())<0)
            {
                return 1;
            }
            
            else if(perf.getExamId().compareTo(this.getExamId())>0)
            {
                return -1;
            }
            
        }
        
        else if(perf.getPercent()<this.getPercent())
        {
             if(perf.getExamId().compareTo(this.getExamId())==0)
            {
                return 0;
            }
            
            else if(perf.getExamId().compareTo(this.getExamId())<0)
            {
                return 1;
            }
            
            else if(perf.getExamId().compareTo(this.getExamId())>0)
            {
                return -1;
            }
        }
        else if(perf.getPercent()>this.getPercent())
        {
             if(perf.getExamId().compareTo(this.getExamId())==0)
            {
                return 0;
            }
            
            else if(perf.getExamId().compareTo(this.getExamId())<0)
            {
                return 1;
            }
            
            else if(perf.getExamId().compareTo(this.getExamId())>0)
            {
                return -1;
            }
        }
        return 0;
    }
    
}
