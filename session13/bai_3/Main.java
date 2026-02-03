package session13.bai_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InvoiceManager invoiceManager = new InvoiceManager();
        while (true) {
            System.out.println("""
                    1. them hoa don
                    2. sua hoa don
                    3. xoa hoa don
                    4. hien thi danh sach hoa don
                    5. thoat
                    nhap lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    try{
                        System.out.println("nhap ma hoa don:");
                        String id = sc.nextLine();
                        System.out.println("nhap so tien:");
                        double amount = Double.parseDouble(sc.nextLine());
                        while (amount < 0){
                            System.out.println("vui long nhap so thuc >=0 !");
                            amount = Double.parseDouble(sc.nextLine());
                        }
                        Invoice invoice = new Invoice(id, amount);
                        invoiceManager.add(invoice);
                    } catch (Exception e){
                        System.out.println("du lieu khong hop le, vui long thu lai");
                    }
                    System.out.println("hoa don da duoc them thanh cong");
                    break;
                case 2:
                    invoiceManager.display();
                    System.out.println("nhap ma hoa don can sua:");
                    String updateId = sc.nextLine();
                    while(updateId.isEmpty() || invoiceManager.getIdxById(updateId)==-1){
                        System.out.println("ma hoa don khong hop le, vui long nhap lai:");
                        updateId = sc.nextLine();
                    }
                    System.out.println("nhap id hoa don moi:");
                    String newId = sc.nextLine();
                    System.out.println("nhap so tien moi:");
                    double newAmount = Double.parseDouble(sc.nextLine());
                    while (newAmount < 0) {
                        System.out.println("vui long nhap so thuc >=0 !");
                        newAmount = Double.parseDouble(sc.nextLine());
                    }
                    invoiceManager.update(invoiceManager.getIdxById(updateId), new Invoice(newId, newAmount) );
                    System.out.println("hoa don da duoc sua thanh cong");
                    break;
                case 3:
                    invoiceManager.display();
                    System.out.println("nhap ma hoa don can xoa:");
                    String deleteId = sc.nextLine();
                    while(deleteId.isEmpty() || invoiceManager.getIdxById(deleteId)==-1) {
                        System.out.println("ma hoa don khong hop le, vui long nhap lai:");
                        deleteId = sc.nextLine();
                    }
                    invoiceManager.delete(invoiceManager.getIdxById(deleteId));
                    System.out.println("hoa don da duoc xoa thanh cong");
                    break;
                case 4:
                    invoiceManager.display();
                    break;
                case 5:
                    System.out.println("thoat chuong trinh");
                    return;
                default:
                    System.out.println("lua chon khong hop le, vui long thu lai");
                    break;
            }
        }
    }
}
