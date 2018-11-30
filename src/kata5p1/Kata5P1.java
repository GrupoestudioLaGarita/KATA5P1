package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Kata5P1 {

    public static void main(String[] args) {
      
        createTable();
        
    }
    
    public static void createTable(){
            String url = "jdbc:sqlite:mail.db";
            String sql = "CREATE TABLE IF NOT EXISTS direcc_email (\n"
                    + " id integer PRIMARY KEY AUTOINCREMENT, \n"
                    + " direccion text NOT NULL);";
            
            try (Connection conn = DriverManager.getConnection(url);
                 Statement stmt = conn.createStatement()){
                stmt.execute(sql);
                System.out.println("Tabla creada.");                
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
}
