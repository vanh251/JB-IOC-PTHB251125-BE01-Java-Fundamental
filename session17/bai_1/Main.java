package session17.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieManager movieManager = new MovieManager();
        while (true){
            System.out.println("""
                    ------------------ Menu ------------------
                    1. them phim moi
                    2. hien thi danh sach phim
                    3. sua phim
                    4. xoa phim
                    5. thoat
                    nhap lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap tieu de:");
                    String title = sc.nextLine();
                    System.out.println("nhap tac gia:");
                    String director = sc.nextLine();
                    System.out.println("nhap nam xuat ban:");
                    int year = Integer.parseInt(sc.nextLine());
                    Movies movie = new Movies(id, title, director, year);
                    movieManager.addMovie(movie);
                    System.out.println("them phim thanh cong");
                    break;
                case 2:
                    System.out.println("danh sach phim: ");
                    movieManager.DisplayMovies();
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("thoat chuong trinh");
                    return;
            }
        }
    }
}
