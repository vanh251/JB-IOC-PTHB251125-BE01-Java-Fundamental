package session18.bai_1;

import vanh.config.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    public void displayAll() {
        String sql = "SELECT * FROM Product";
        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement pre = conn.prepareStatement(sql);
             ResultSet rs = pre.executeQuery()) {
            while (rs.next()) {
                System.out.println(mapResultSetToProduct(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addProduct(Product p) {
        Connection conn = null;
        try {
            conn = ConnectionDB.getConnection();
            conn.setAutoCommit(false); // Bat dau Transaction

            String sql = "CALL add_product(?, ?, ?, ?, ?)";
            CallableStatement call = conn.prepareCall(sql);
            call.setString(1, p.getName());
            call.setFloat(2, p.getPrice());
            call.setString(3, p.getTitle());
            call.setDate(4, Date.valueOf(p.getCreated()));
            call.setString(5, p.getCatalog());

            call.execute();
            conn.commit(); // Thanh cong thi commit
            System.out.println("Them san pham thanh cong!");
        } catch (SQLException e) {
            if (conn != null) try { conn.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
            System.err.println("Loi: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(conn);
        }
    }

    public void deleteProduct(int id) {
        String sql = "CALL delete_product(?)";
        try (Connection conn = ConnectionDB.getConnection();
             CallableStatement call = conn.prepareCall(sql)) {
            call.setInt(1, id);
            call.execute();
            System.out.println("Da xoa san pham ID: " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchByName(String name) {
        String sql = "SELECT * FROM Product WHERE Product_Name ILIKE ?";
        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement pre = conn.prepareStatement(sql)) {
            pre.setString(1, "%" + name + "%");
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                System.out.println(mapResultSetToProduct(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Product mapResultSetToProduct(ResultSet rs) throws SQLException {
        return new Product(
                rs.getInt("Product_Id"),
                rs.getString("Product_Name"),
                rs.getFloat("Product_Price"),
                rs.getString("Product_Title"),
                rs.getDate("Product_created").toLocalDate(),
                rs.getString("Product_catalog"),
                rs.getBoolean("Product_Status")
        );
    }
}