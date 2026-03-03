package session17.bai_1;

import vanh.config.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MovieManager {
    private Collection<Movies> movieList;

    public MovieManager() {
        movieList = new ArrayList<>();
    }

    public void addMovie(Movies movie){
        try(
                Connection conn = ConnectionDB.getConnection();
                PreparedStatement pre = conn.prepareStatement("insert into movies values (?,?, ?, ?)");
                ){
            pre.setInt(1, movie.getId());
            pre.setString(2, movie.getTitle());
            pre.setString(3, movie.getDirector());
            pre.setInt(4, movie.getYear());
            pre.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DisplayMovies(){
        try (
                Connection conn = ConnectionDB.getConnection();
                PreparedStatement pre = conn.prepareStatement("select * from movies");
        ) {
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String director = rs.getString("director");
                int year = rs.getInt("year");
                Movies movie = new Movies(id, title, director, year);
                System.out.println(movie);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
