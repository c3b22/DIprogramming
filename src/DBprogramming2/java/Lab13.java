package DBprogramming2.java;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab13 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username ="root";
        String password = "Prem1613#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connection = DriverManager.getConnection(url,username,password);
            Statement statement = Connection.createStatement();
            String sql = "update student set email=? where studentID=?";
            PreparedStatement preparedStatement = Connection.prepareStatement(sql);
            preparedStatement.setString(1,"aaaa@kmutt.ac.th");
            preparedStatement.setString(2,"111111");
            preparedStatement.execute();
        } catch (ClassNotFoundException ex){
            Logger.getLogger(DBprogramming2.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex){
            Logger.getLogger(DBprogramming2.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

}
