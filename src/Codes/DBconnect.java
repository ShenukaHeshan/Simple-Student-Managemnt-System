package Codes;

import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class DBconnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        return conn;
    }
    
}
