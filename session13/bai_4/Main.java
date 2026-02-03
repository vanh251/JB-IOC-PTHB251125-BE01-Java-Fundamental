package session13.bai_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();
        while (true){
            System.out.println("""
                    ****************** quan ly don hang ******************
                    1. Them don hang
                    2. sua don hang
                    3. Xoa don hang
                    4. Hien thi danh sach don hang
                    5. Thoat
                    ******************************************************
                    lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap ma don hang:");
                    String id = sc.nextLine();
                    while (id.isEmpty()){
                        System.out.println("ma don hang khong duoc de trong, vui long nhap lai:");
                        id = sc.nextLine();
                    }
                    System.out.println("nhap ten khach hang:");
                    String customerName = sc.nextLine();
                    while (customerName.isEmpty()) {
                        System.out.println("ten khach hang khong duoc de trong, vui long nhap lai:");
                        customerName = sc.nextLine();
                    }
                    Order order = new Order(id, customerName);
                    orderManager.add(order);
                    System.out.println("don hang da duoc them thanh cong.");
                    break;
                case 2:
                    orderManager.display();
                    System.out.println("nhap ma don hang can sua:");
                    String updateId = sc.nextLine();
                    while(updateId.isEmpty() || orderManager.getIndexById(updateId) == -1){
                        System.out.println("ma don hang khong hop le, vui long nhap lai:");
                        updateId = sc.nextLine();
                    }
                    System.out.println("nhap ten khach hang moi:");
                    String newCustomerName = sc.nextLine();
                    while (newCustomerName.isEmpty()) {
                        System.out.println("ten khach hang khong duoc de trong, vui long nhap lai:");
                        newCustomerName = sc.nextLine();
                    }
                    orderManager.update(orderManager.getIndexById(updateId), new Order(updateId, newCustomerName));
                    System.out.println("don hang da duoc cap nhat thanh cong.");
                    break;
                case 3:
                    orderManager.display();
                    System.out.println("nhap ma don hang can xoa:");
                    String deleteId = sc.nextLine();
                    while(deleteId.isEmpty() || orderManager.getIndexById(deleteId) == -1) {
                        System.out.println("ma don hang khong hop le, vui long nhap lai:");
                        deleteId = sc.nextLine();
                    }
                    orderManager.delete(orderManager.getIndexById(deleteId));
                    System.out.println("don hang da duoc xoa thanh cong.");
                    break;
                case 4:
                    orderManager.display();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    return;
            }
        }
    }
}
