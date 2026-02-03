package session12.bai_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductBusiness {
    ArrayList<Product> products;

    public void addProduct(Product product) {
        if (products == null) {
            products = new ArrayList<>();
        }
        products.add(product);
    }

    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("No Products Available");
        }
        else{
            for (Product product : products) {
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Product Name: " + product.getProductName());
                System.out.println("Category: " + product.getCategory());
                System.out.println("Price: " + product.getPrice());
                System.out.println("Quantity: " + product.getQuantity());
                System.out.println("---------------------------");
            }
        }
    }

    public void updateProduct(String productId, Float newPrice, int newQuantity) {
        for(Product p : products){
            if(p.getProductId().equals(productId)){
                p.setPrice(newPrice);
                p.setQuantity(newQuantity);
                System.out.println("Product updated successfully.");
                return;
            }
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        for(Product p : products){
            if(p.getProductId().equals(productId)){
                products.remove(p);
                System.out.println("Product deleted successfully.");
                return;
            }
            System.out.println("Product not found.");
        }
    }

    public void searchProductByName(String productName){
        for(Product p: products){
            if(p.getProductName().toLowerCase().contains(productName.toLowerCase())){
                System.out.println("Product ID: " + p.getProductId());
                System.out.println("Product Name: " + p.getProductName());
                System.out.println("Category: " + p.getCategory());
                System.out.println("Price: " + p.getPrice());
                System.out.println("Quantity: " + p.getQuantity());
                System.out.println("---------------------------");
                System.out.println("Search completed.");
                return;
            }
        }
        System.out.println("No products found with the given name.");
    }

    public void sortProductIncreaseByPrice(){
        Collections.sort(products, new Comparator<Product>() {;
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getPrice().compareTo(p2.getPrice());
            }
        });
        for(Product p : products){
            p.displayData();
        }
    }

    public void sortProductDecreaseByPrice(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p2.getPrice().compareTo(p1.getPrice());
            }
        });
        for(Product p : products){
            p.displayData();
        }
    }
}
