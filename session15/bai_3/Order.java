package session15.bai_3;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProductToOrder(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public int getOrderId() { return orderId; }
    public List<Product> getProducts() { return products; }

    @Override
    public String toString() {
        return "Don hang ID: " + orderId + " | So luong SP: " + products.size() + " | Tong tien: " + calculateTotal();
    }
}