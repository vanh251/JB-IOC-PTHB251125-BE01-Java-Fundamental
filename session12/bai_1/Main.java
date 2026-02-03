package session12.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductBusiness productBusiness = new ProductBusiness();
        while(true){
            System.out.println("""
                    ****************** Quan Ly San Pham ******************
                    1. Them san pham
                    2. Hien thi danh sach san pham
                    3. Cap nhat san pham theo ma san pham
                    4. Xoa san pham theo ma san pham
                    5. Tim kiem san pham theo ten san pham
                    6. Sap xep san pham theo gia tang dan
                    7. Sap xep san pham theo gia giam dan
                    8. Thoat
                    ******************************************************
                    """);
            System.out.print("Chon chuc nang: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    Product product =  new Product();
                    product.inputData(sc);
                    productBusiness.addProduct(product);
                    break;
                case 2:
                    productBusiness.displayProducts();
                    break;
                case 3:
                    System.out.print("Nhap ma san pham can cap nhat: ");
                    String updateId = sc.nextLine();
                    System.out.print("Nhap gia moi: ");
                    Float newPrice = Float.parseFloat(sc.nextLine());
                    System.out.print("Nhap so luong moi: ");
                    int newQuantity = Integer.parseInt(sc.nextLine());
                    productBusiness.updateProduct(updateId, newPrice, newQuantity);
                    break;
                case 4:
                    System.out.print("Nhap ma san pham can xoa: ");
                    String deleteId = sc.nextLine();
                    productBusiness.deleteProduct(deleteId);
                    break;
                case 5:
                    System.out.print("Nhap ten san pham can tim kiem: ");
                    String searchName = sc.nextLine();
                    productBusiness.searchProductByName(searchName);
                    break;
                case 6:
                    productBusiness.sortProductIncreaseByPrice();
                    System.out.println("Danh sach san pham da duoc sap xep theo gia tang dan.");
                    break;
                case 7:
                    productBusiness.sortProductDecreaseByPrice();
                    System.out.println("Danh sach san pham da duoc sap xep theo gia giam dan.");
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                default:
                    System.out.println("Chuc nang khong hop le. Vui long chon lai.");
            }
        }
    }
}
