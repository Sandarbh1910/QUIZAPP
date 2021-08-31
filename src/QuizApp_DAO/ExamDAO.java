/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_DAO;

import QuizApp_Pojo.Exam;
import QuizApp_dbutil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sandarbh Taran
 */
public class ExamDAO {
    
    public static String getExamId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select count(*) from exam");
        rs.next();
        int count=rs.getInt(1);
        String nextId="EX-"+(count+1);
        return nextId;
    }
    
    public static boolean addExam(Exam exam)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into exam values (?,?,?)");
        ps.setString(1,exam.getExamId());
        ps.setString(2,exam.getSubject());
        ps.setInt(3,exam.getTotal_no_of_questions());
        int res=ps.executeUpdate();
        System.out.println(res);
        return (res==1);
    }
    
    
    public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where subject=?");
        ps.setString(1,subject);
        
        ResultSet rs=ps.executeQuery();
        ArrayList<String> examIdList=new ArrayList<>();
        while(rs.next())
        {
            examIdList.add(rs.getString(1));
        }
        
        return examIdList;
    }
    
    public static int getQuestionCountByExam(String examId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select no_of_questions from exam where examid=?");
        ps.setString(1, examId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    
    public static boolean isPaperSet(String subject)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        System.out.println("In ispaperset examDao subject= "+subject);
        PreparedStatement ps=conn.prepareStatement("select examid from exam where subject=?");
        ps.setString(1,subject);
        ResultSet rs=ps.executeQuery();
        
       return rs.next();
    }
    
    public static ArrayList<String>getExamIdBySubject(String subject,String userId)throws SQLException
    {
        String qry="select examid from exam where subject=? minus select examid from performance where userid=?";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, subject);
        ps.setString(2, userId);
        ResultSet rs=ps.executeQuery();
        ArrayList<String> examIdList=new ArrayList<>();
        while(rs.next())
        {
            examIdList.add(rs.getString(1));
        }
        
        return examIdList;
        
     
    }
}
