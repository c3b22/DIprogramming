package DBprogramming2.java;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Lab7 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username ="root";
        String password = "Prem1613#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connection = DriverManager.getConnection(url,username,password);
            Statement statement = Connection.createStatement();
            String sql = "SELECT * from student";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                System.out.println(result.getString(1)+ " " +result.getString(2) + " " + result.getString(3) + " " + result.getString(4) + " " + result.getString(5));
            }
        } catch (ClassNotFoundException ex){
            Logger.getLogger(DBprogramming2.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex){
            Logger.getLogger(DBprogramming2.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

}
