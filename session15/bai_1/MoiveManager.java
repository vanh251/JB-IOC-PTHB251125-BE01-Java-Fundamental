package session15.bai_1;

import java.util.ArrayList;
import java.util.List;

public class MoiveManager <T extends Movie>{
    private List<T> listMovie;

    public MoiveManager() {
        listMovie = new ArrayList<>();
    }

    public T findMovieById(String id){
        for(T movie :  listMovie){
            if(movie.getId().equals(id)){
                return movie;
            }
        }
        return null;
    }

    public void addMovie(T movie){
        listMovie.add(movie);
        System.out.println("phim da duoc them thanh cong");
    }

    public void deleteMovie(String id){
        T movie = findMovieById(id);
        if(movie == null){
            System.out.println("khong tim thay phim voi id da cho");
        }
        else {
            listMovie.remove(movie);
            System.out.println("phim da duoc xoa thanh cong");
        }
    }

    public void displayAllMovies(){
        for(T movie : listMovie){
            movie.displayInfo();
        }
    }

    public void updateMovie(String id, T newMovie){
        T movie = findMovieById(id);
        if(movie == null){
            System.out.println("khong tim thay phim voi id da cho");
        }
        else {
            int index = listMovie.indexOf(movie);
            listMovie.set(index, newMovie);
            System.out.println("phim da duoc cap nhat thanh cong");
        }
    }

    public void searchMoviesByTitle(String title){
        boolean check = false;
        for(T movie : listMovie){
            if(movie.getTitle().toLowerCase().contains(title.toLowerCase())){
                movie.displayInfo();
                check = true;
            }
        }
        if (!check){
            System.out.println("khong tim thay phim voi tieu de da cho");
        }
    }

    public void filterMoviesByRating(double rating){
        boolean check = false;
        for(T movie : listMovie){
            if(movie.getRating() >= rating){
                movie.displayInfo();
                check = true;
            }
        }
        if (!check){
            System.out.println("khong tim thay phim voi danh gia da cho");
        }
    }
}
