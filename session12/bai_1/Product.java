package session12.bai_1;

import java.util.Scanner;

public class Product {
    private String productId, productName, category;
    private Float price;
    private int quantity;

    public Product() {
    }

    public Product(String productId, String productName, String category, Float price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void inputData(Scanner sc){
        System.out.print("Enter product ID: ");
        productId = sc.nextLine();
        System.out.print("Enter product name: ");
        productName = sc.nextLine();
        System.out.print("Enter category: ");
        category = sc.nextLine();
        System.out.print("Enter price: ");
        price = Float.parseFloat(sc.nextLine());
        System.out.print("Enter quantity: ");
        quantity = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void displayData(){
        System.out.println(this.toString());
    }
}
