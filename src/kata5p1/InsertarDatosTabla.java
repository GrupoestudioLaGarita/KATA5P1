package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class InsertarDatosTabla {

    private Connection connect() {
        String url = "jdbc:sqlite:mail.db";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(List<String> email) {
        String sql = "INSERT INTO direcc_email(direccion) VALUES(?)";

        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            for (String string : email) {
                pstmt.setString(1, string);
                pstmt.execute();

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
