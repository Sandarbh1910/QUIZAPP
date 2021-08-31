/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.net.InetAddress;

/**
 *
 * @author Sandarbh Taran
 */
public class DBConnection {
    private static Connection conn;
    
    static 
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection( "jdbc:oracle:thin:@"+InetAddress.getLocalHost().getHostName()+":1521:xe","quizapp","quizapp");  
            JOptionPane.showMessageDialog(null,"Connection established successfully");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"!!Unable to connect to database");
            ex.printStackTrace();
            System.exit(1);
        }
    }
    
    public static Connection getConnection()
    {
        return conn;
    }
    
    public static void closeConnection()
    {
       try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Connection closed successfully");
            
       }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"!Unable to disconnect  database");
            ex.printStackTrace();
            
        }
       
    }
    
}
