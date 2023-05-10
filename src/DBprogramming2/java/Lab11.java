package DBprogramming2.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab11 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username ="root";
        String password = "Prem1613#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connection = DriverManager.getConnection(url,username,password);
            Statement statement = Connection.createStatement();
            String sql = "delete from student where studentID = '00082'";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(DBprogramming2.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex){
            Logger.getLogger(DBprogramming2.class.getName()).log(Level.SEVERE,null,ex);
        }
    }


}
