package session17.bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();

        while (true) {
            System.out.println("\n--- QUAN LY THU VIEN ---");
            System.out.println("1. Them sach | 2. Hien thi | 3. Sua | 4. Xoa | 0. Thoat");
            System.out.print("Nhap lua chon: ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Tieu de: "); String title = sc.nextLine();
                        System.out.print("Tac gia: "); String author = sc.nextLine();
                        System.out.print("Nam: "); int year = Integer.parseInt(sc.nextLine());
                        System.out.print("Gia: "); double price = Double.parseDouble(sc.nextLine());
                        manager.addBook(new Books(id, title, author, year, price));
                        break;
                    case 2:
                        manager.displayAllBooks();
                        break;
                    case 3:
                        System.out.print("Nhap ID can sua: "); int editId = Integer.parseInt(sc.nextLine());
                        System.out.print("Tieu de moi: "); String nTitle = sc.nextLine();
                        System.out.print("Tac gia moi: "); String nAuthor = sc.nextLine();
                        System.out.print("Nam moi: "); int nYear = Integer.parseInt(sc.nextLine());
                        System.out.print("Gia moi: "); double nPrice = Double.parseDouble(sc.nextLine());
                        manager.updateBook(editId, new Books(editId, nTitle, nAuthor, nYear, nPrice));
                        break;
                    case 4:
                        System.out.print("Nhap ID can xoa: ");
                        manager.deleteBook(Integer.parseInt(sc.nextLine()));
                        break;
                    case 0: return;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap lieu, vui long kiem tra lai!");
            }
        }
    }
}