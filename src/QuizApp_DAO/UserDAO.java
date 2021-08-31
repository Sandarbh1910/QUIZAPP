/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_DAO;

import QuizApp_Pojo.User;
import QuizApp_dbutil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sandarbh Taran
 */
public class UserDAO {
    
    public static boolean validateUser(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where username=? and password=? and usertype=?");
        ps.setString(1, user.getUsername());
        ps.setString(2,user.getPassword());
         ps.setString(3,user.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    
    public static boolean changePassword(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where username=? and usertype=? ");
        ps.setString(2, user.getUsername());
        ps.setString(1,user.getPassword());
         ps.setString(3,user.getUserType());
        int rs=ps.executeUpdate();
        return rs==1;
    }
    
    public static boolean changeStudentsPassword(User user,String currentPassword)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where username=? and usertype=? and password=? ");
        ps.setString(2, user.getUsername());
        ps.setString(1,user.getPassword());
         ps.setString(3,user.getUserType());
         ps.setString(4,currentPassword);
        int rs=ps.executeUpdate();
        return rs==1;
    }
    
    public static boolean registerUser(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?) ");
        ps.setString(1, user.getUsername());
        ps.setString(2,user.getPassword());
         ps.setString(3,user.getUserType());
        int rs=ps.executeUpdate();
        return rs==1;
    }
    
}
