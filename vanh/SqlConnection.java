package vanh;
import java.sql.*;

public class SqlConnection {
    private static final String URL = "jdbc::postgresqql://localhost:5432/viet_taste_db";
    private static final String USER = "postgres";
    private static final String PASS = "vietanh2k5";

    public static void main(String[] args) {
        String sql = "select id, full_name from students";
        try(
                Connection conn = DriverManager.getConnection(URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ){
            System.out.println("ket noi thanh cong");
            while(rs.next()){
                int id = rs.getInt("id");
                String full_name = rs.getString("full_name");
                System.out.println("id: " + id + ", full_name: " + full_name);
            }
        }
        catch (SQLException e){
            System.out.println("ket noi that bai: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
