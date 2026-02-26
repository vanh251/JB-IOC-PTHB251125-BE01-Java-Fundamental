package session16.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while(true){
            System.out.println("""
                    --------------- MENU----------------
                    1. Them san pham
                    2. Cap nhat san pham
                    3. Xoa san pham
                    4. Hien thi san pham
                    5. Loc san pham co gia > 100
                    6. Tinh tong gia tri san pham
                    7. Thoat
                    -----------------------------------
                    nhap lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap id san pham:");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap ten san pham:");
                    String name = sc.nextLine();
                    System.out.println("nhap gia san pham:");
                    double price = Double.parseDouble(sc.nextLine());
                    productManager.addProduct(id, new Product(id, name, price));
                    break;
                case 2:
                    System.out.println("nhap id san pham can cap nhat:");
                    int updateId = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap ten san pham moi:");
                    String updateName = sc.nextLine();
                    System.out.println("nhap gia san pham moi:");
                    double updatePrice = Double.parseDouble(sc.nextLine());
                    productManager.updateProduct(updateId, new Product(updateId, updateName, updatePrice));
                    break;
                case 3:
                    System.out.println("nhap id san pham can xoa:");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    productManager.deleteProduct(deleteId);
                    break;
                case 4:
                    productManager.displayProducts();
                    break;
                case 5:
                    productManager.filterProductsByPrice();
                    break;
                case 6:
                    productManager.calculateTotalPrice();
                    break;
                case 7:
                    System.out.println("thoat chuong trinh");
                    return;
                default:
                    System.out.println("lua chon khong hop le, vui long chon lai");
            }
        }
    }
}
