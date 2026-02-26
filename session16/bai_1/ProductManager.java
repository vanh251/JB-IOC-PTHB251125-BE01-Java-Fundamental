package session16.bai_1;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    Map<Integer, Product> productMap;

    public ProductManager() {
        productMap = new HashMap<>();
    }

    public void addProduct(int id, Product p){
        productMap.put(id, p);
        System.out.println("da them san pham thanh cong");
    }

    public void updateProduct(int id, Product p){
        if(productMap.get(id) != null){
            productMap.put(id, p);
            System.out.println("da cap nhat san pham thanh cong");
        } else {
            System.out.println("khong tim thay san pham de cap nhat");
        }
    }

    public void deleteProduct(int id){
        if(productMap.get(id) != null){
            productMap.remove(id);
            System.out.println("da xoa san pham thanh cong");
        } else {
            System.out.println("khong tim thay san pham de xoa");
        }
    }

    public void displayProducts(){
        System.out.println("Cac san pham trong danh sach:");
        productMap.values().forEach(System.out::println);
    }

    public void filterProductsByPrice(){
        System.out.println("Cac san pham co gia > 100:");
        productMap.values().stream().filter(x-> x.getPrice()>100).forEach(System.out::println);
    }

    public void calculateTotalPrice(){
        double totalPrice = productMap.values().stream().mapToDouble(Product::getPrice).sum();
        System.out.println("Tong gia tri san pham: " + totalPrice);
    }

}
