package session17.bai_2;

import vanh.config.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public void addBook(Books book) {
        String sql = "INSERT INTO books (id, title, author, published_year, price) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement pre = conn.prepareStatement(sql)) {
            pre.setInt(1, book.getId());
            pre.setString(2, book.getTitle());
            pre.setString(3, book.getAuthor());
            pre.setInt(4, book.getPublishedYear());
            pre.setDouble(5, book.getPrice());
            pre.executeUpdate();
            System.out.println("Them sach thanh cong!");
        } catch (SQLException e) {
            System.err.println("Loi khi them sach: " + e.getMessage());
        }
    }

    public void displayAllBooks() {
        String sql = "SELECT * FROM books ORDER BY id";
        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement pre = conn.prepareStatement(sql);
             ResultSet rs = pre.executeQuery()) {
            while (rs.next()) {
                Books b = new Books(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("published_year"),
                        rs.getDouble("price")
                );
                System.out.println(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(int id, Books book) {
        String sql = "UPDATE books SET title = ?, author = ?, published_year = ?, price = ? WHERE id = ?";
        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement pre = conn.prepareStatement(sql)) {
            pre.setString(1, book.getTitle());
            pre.setString(2, book.getAuthor());
            pre.setInt(3, book.getPublishedYear());
            pre.setDouble(4, book.getPrice());
            pre.setInt(5, id);
            int row = pre.executeUpdate();
            if (row > 0) System.out.println("Cap nhat thanh cong!");
            else System.out.println("Khong tim thay ID de cap nhat.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(int id) {
        String sql = "DELETE FROM books WHERE id = ?";
        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement pre = conn.prepareStatement(sql)) {
            pre.setInt(1, id);
            int row = pre.executeUpdate();
            if (row > 0) System.out.println("Xoa thanh cong!");
            else System.out.println("Khong tim thay ID de xoa.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}