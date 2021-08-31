/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_DAO;

import QuizApp_Pojo.Performance;
import QuizApp_Pojo.StudentScore;
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
public class PerformanceDAO {
    
    public static void addPerformance(Performance p)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        ps.setString(1, p.getUserId());
        ps.setString(2, p.getExamId());
        ps.setInt(3, p.getRight());
         ps.setInt(4, p.getWrong());
          ps.setInt(5, p.getUnattempted());
          ps.setDouble(6, p.getPercent());
           ps.setString(7, p.getSubject());
        ps.executeUpdate();
    }
    
    public static ArrayList<String>getStudentList()throws SQLException
    {
        ArrayList<String>studentList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement ps=conn.createStatement();
       ResultSet rs=ps.executeQuery("select distinct userid from performance");
       while(rs.next())
       {
           studentList.add(rs.getString(1));
       }
       return studentList;
    }
    
    public static ArrayList<String>getExamList(String userid)throws SQLException
    {
        ArrayList<String>examList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select  examid from performance where userid=?");
        ps.setString(1,userid);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            examList.add(rs.getString(1));
        }
        
        return examList;
    }
    
    public static StudentScore getPerformanceDetatils(String userId,String examId)throws SQLException
    {
        StudentScore score=new StudentScore();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select subject , percent from performance where userid=? and examid=?");
        ps.setString(1,userId);
        ps.setString(2,examId);
        ResultSet rs=ps.executeQuery();
        
        rs.next();
        
            score.setSubject(rs.getString(1));
            score.setPerc(rs.getDouble(2));
            return score;
        
    }
    
     
   
    
    
    public static ArrayList<Performance>getAllData()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ArrayList<Performance>performanceList=new ArrayList<>();
        ResultSet rs=st.executeQuery("select * from performance order by examid");
        while(rs.next())
        {
            String userid=rs.getString(1);
            String examId=rs.getString(2);
            int right=rs.getInt(3);
            int wrong=rs.getInt(4);
            int unattempted=rs.getInt(5);
            double per=rs.getDouble(6);
            String subject=rs.getString(7);
            Performance perf=new Performance(examId,subject,userid,right,wrong,unattempted,per);
            performanceList.add(perf);
        }
        return performanceList;
    }
    
    
    public static ArrayList<Performance>getAllDataByUsername(String username)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from performance where userid=? order by examid");
        ps.setString(1, username);
        ArrayList<Performance>performanceList=new ArrayList<>();
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String userid=rs.getString(1);
            String examId=rs.getString(2);
            int right=rs.getInt(3);
            int wrong=rs.getInt(4);
            int unattempted=rs.getInt(5);
            double per=rs.getDouble(6);
            String subject=rs.getString(7);
            Performance perf=new Performance(examId,subject,userid,right,wrong,unattempted,per);
            performanceList.add(perf);
        }
        return performanceList;
    }
    
}
