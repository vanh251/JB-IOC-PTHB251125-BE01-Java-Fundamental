package session15.bai_3;

import java.util.*;

public class Main {
    private static List<Product> productList = new ArrayList<>();
    private static Map<String, Order> orderMap = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- QUAN LY CUA HANG ---");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi san pham");
            System.out.println("3. Xoa san pham");
            System.out.println("4. Tao don hang moi");
            System.out.println("5. Hien thi tat ca don hang");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        productList.forEach(System.out::println);
                        break;
                    case 3:
                        removeProduct();
                        break;
                    case 4:
                        createOrder();
                        break;
                    case 5:
                        orderMap.forEach((k, v) -> System.out.println("Ma tra cuu: " + k + " | " + v));
                        break;
                    case 0:
                        return;
                }
            } catch (NumberFormatException e) {
                System.err.println("Loi: Vui long nhap so!");
            } catch (Exception e) {
                System.err.println("Loi: " + e.getMessage());
            }
        }
    }

    private static void addProduct() throws InvalidPriceException {
        System.out.print("ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Ten: ");
        String name = sc.nextLine();
        System.out.print("Gia: ");
        double price = Double.parseDouble(sc.nextLine());
        if (price <= 0) throw new InvalidPriceException("Gia san pham phai lon hon 0!");
        productList.add(new Product(id, name, price));
    }

    private static void removeProduct() {
        System.out.print("Nhap ID can xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean removed = productList.removeIf(p -> p.getId() == id);
        if (!removed) throw new NotFoundException("Khong tim thay san pham ID: " + id);
        System.out.println("Da xoa thanh cong.");
    }

    private static void createOrder() {
        System.out.print("Nhap ID don hang: ");
        int orderId = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ma tra cuu (String): ");
        String code = sc.nextLine();

        Order newOrder = new Order(orderId);
        while (true) {
            System.out.print("Nhap ID san pham muon them vao don (0 de dung): ");
            int pId = Integer.parseInt(sc.nextLine());
            if (pId == 0) break;

            Product p = productList.stream()
                    .filter(product -> product.getId() == pId)
                    .findFirst()
                    .orElseThrow(() -> new NotFoundException("San pham khong ton tai!"));

            newOrder.addProductToOrder(p);
            System.out.println("Da them " + p.getName());
        }
        orderMap.put(code, newOrder);
        System.out.println("Don hang da duoc luu.");
    }
}