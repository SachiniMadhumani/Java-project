
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class connection {
    public static Connection connect(){
        Connection conn =null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return conn;
        
    }
}
