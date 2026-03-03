package session18.bai_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = new session18.bai_1.ProductManager();

        while (true) {
            System.out.println("\n********************PRODUCT MANAGEMENT****************");
            System.out.println("1. Danh sach | 2. Them moi | 3. Xoa | 4. Tim kiem | 0. Thoat");
            System.out.print("Chon: ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: manager.displayAll(); break;
                    case 2:
                        System.out.print("Ten SP: "); String name = sc.nextLine();
                        System.out.print("Gia (>0): "); float price = Float.parseFloat(sc.nextLine());
                        if (price <= 0) throw new Exception("Gia phai > 0!");
                        System.out.print("Tieu de: "); String title = sc.nextLine();
                        System.out.print("Danh muc: "); String cat = sc.nextLine();
                        manager.addProduct(new Product(0, name, price, title, LocalDate.now(), cat, true));
                        break;
                    case 3:
                        System.out.print("ID can xoa: ");
                        manager.deleteProduct(Integer.parseInt(sc.nextLine()));
                        break;
                    case 4:
                        System.out.print("Nhap ten tim kiem: ");
                        manager.searchByName(sc.nextLine());
                        break;
                    case 0: return;
                }
            } catch (Exception e) {
                System.err.println("Loi: " + e.getMessage());
            }
        }
    }
}