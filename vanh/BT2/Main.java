package vanh.BT2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        while(true){
            System.out.println("""
                    1. in danh sách sản phẩm
                    2. thêm 1 sản phẩm
                    3. xoá 1 sản phẩm
                    4. tìm kiếm tương đối theo tên
                    5. thoát
                    nhap lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    for (Product p: productList) {
                        System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Price: " + p.getPrice());
                    }
                    break;
                case 2:
                    System.out.println("nhap id san pham:");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap ten san pham:");
                    String name = sc.nextLine();
                    System.out.println("nhap gia san pham:");
                    double price = Double.parseDouble(sc.nextLine());
                    productList.add(new Product(name, id, price));
                    break;
                case 3:
                    System.out.println("nhap id san pham can xoa:");
                    int deleteIndex = Integer.parseInt(sc.nextLine());
                    productList.remove(0);
                    break;
                case 4:
                    System.out.println("nhap ten san pham can tim:");
                    String searchName = sc.nextLine();
                    for(Product p: productList){
                        if(p.getName().toLowerCase().contains(searchName)){
                            System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Price: " + p.getPrice());
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
