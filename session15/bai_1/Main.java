package session15.bai_1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MoiveManager<Movie> moiveManager = new MoiveManager<>();
        while(true){
            System.out.println("""
                    -------------------- Menu --------------------
                    1. them phim
                    2. xoa phim
                    3. sua phim
                    4. hien thi phim
                    5. tim kiem phim theo ten
                    6. loc phim theo rating
                    7. thoat
                    chon chuc nang:
                    """);
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("nhap id:");
                        String id = sc.nextLine();
                        System.out.println("nhap tieu de:");
                        String title = sc.nextLine();
                        System.out.println("nhap dao dien:");
                        String director = sc.nextLine();
                        System.out.println("nhap rating:");
                        double rating = Double.parseDouble(sc.nextLine());
                        System.out.println("nhap ngay phat hanh (yyyy-MM-dd):");
                        LocalDate releaseDate = LocalDate.parse(sc.nextLine());
                        moiveManager.addMovie(new Movie(id, title, director, rating, releaseDate));
                        break;
                    case 2:
                        System.out.println("nhap id phim can xoa");
                        String deleteId = sc.nextLine();
                        moiveManager.deleteMovie(deleteId);
                        break;
                    case 4:
                        System.out.println("danh sach phim:");
                        moiveManager.displayAllMovies();
                        break;
                    case 3:
                        System.out.println("moi nhap id phim muon sua: ");
                        String updateId = sc.nextLine();
                        System.out.println("nhap tieu de phim: ");
                        String updateTitle = sc.nextLine();
                        System.out.println("nhap dao dien: ");
                        String updateDirector = sc.nextLine();
                        System.out.println("nhap ngay phat hanh: ");
                        LocalDate updateReleaseDate = LocalDate.parse(sc.nextLine());
                        System.out.println("nhap rating: ");
                        double updateRating = Double.parseDouble(sc.nextLine());
                        moiveManager.updateMovie(updateId, new Movie(updateId, updateTitle, updateDirector, updateRating, updateReleaseDate));
                        break;
                    case 5:
                        System.out.println("nhap tieu de phim de tim kiem");
                        String searchTitle = sc.nextLine();
                        moiveManager.searchMoviesByTitle(searchTitle);
                        break;
                    case 6:
                        System.out.println("nhap rating toi thieu de loc");
                        double filterRating = Double.parseDouble(sc.nextLine());
                        moiveManager.filterMoviesByRating(filterRating);
                        break;
                    case 7:
                        return;
                    default:
                        System.out.println("vui long nhap lua chon tu 1-7");
                }
            } catch (DateTimeParseException e){
                System.out.println("Loi: sai dinh dang ngay(yyyy-MM-dd");
            } catch (NumberFormatException e){
                System.out.println("vui long nhap so");
            }
        }
    }
}
