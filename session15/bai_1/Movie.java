package session15.bai_1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
    private String id, title, director;
    private double rating;
    private LocalDate releaseDate;

    public Movie() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    }

    public Movie(String id, String title, String director, double rating, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void displayInfo(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dtf.format(releaseDate);
        System.out.printf("ID: %s | Title: %s | Director: %s | Rating: %.1f | Release Date: %s\n",
                id, title, director, rating, formattedDate);
    }
}
