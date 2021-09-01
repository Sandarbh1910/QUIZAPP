/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_DAO;

import QuizApp_Pojo.Question;
import QuizApp_Pojo.QuestionStore;
import QuizApp_dbutil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sandarbh Taran
 */
public class QuestionDAO {
    public static void addQuestions(QuestionStore qstore)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Question q;
        PreparedStatement ps=conn.prepareStatement("insert into question values(?,?,?,?,?,?,?,?,?)");
        ArrayList<Question>questionList=qstore.getAllQuestions();
        Iterator<Question> it=questionList.iterator();
        while(it.hasNext())
        {
           q= it.next();
            System.out.println(q);
            ps.setString(1,q.getExamId());
            ps.setInt(2, q.getQno());
            ps.setString(3, q.getQuestion());
            ps.setString(4, q.getOption1());
            ps.setString(5, q.getOption2());
            ps.setString(6, q.getOption3());
            ps.setString(7, q.getOption4());
            System.out.println(q.getCorrectAnswer());
            ps.setString(8, q.getCorrectAnswer());
            ps.setString(9, q.getSubject());
            ps.executeUpdate();
        }
        
        
    }
    
    public static ArrayList<Question>getQuestionsByExamId(String examId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        
        PreparedStatement ps=conn.prepareStatement("select * from question where examid=?");
        ps.setString(1, examId);
        ResultSet rs=ps.executeQuery();
        
        ArrayList<Question>questionList=new ArrayList<>();
        
        
        while(rs.next())
        {
            int qno=rs.getInt(2);
            String question =rs.getString(3);
            String option1=rs.getString(4);
            String option2=rs.getString(5);
            String option3=rs.getString(6);
            String option4=rs.getString(7);
            String correct_answer=rs.getString(8);
            String subject=rs.getString(9);
            Question newQuestion=new Question (examId,qno,subject,option1,option2,option3,option4,correct_answer,question);
            System.out.println("QuestionDAO Question obj "+newQuestion);
            questionList.add(newQuestion);
            
        }
        System.out.println("QuestionDAO questionlist "+questionList);
        return questionList;
    }
    
    
    public static void updateQuestions(QuestionStore qstore)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Update question set question=?, option1=?, option2=?, option3=?, option4=?, correct_answer=? where examid=? and question_no=?");
        ArrayList<Question> questionList=qstore.getAllQuestions();
        for(Question q:questionList){
            ps.setString(1,q.getQuestion());
            ps.setString(2,q.getOption1());
            ps.setString(3,q.getOption2());
            ps.setString(4,q.getOption3());
            ps.setString(5,q.getOption4());
            ps.setString(6,q.getCorrectAnswer());
            ps.setString(7,q.getExamId());
            ps.setInt(8,q.getQno());
            
            ps.executeUpdate();
        }
    }
    
}
