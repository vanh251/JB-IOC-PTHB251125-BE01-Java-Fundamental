package session03;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================Nhap thong tin hoa don=================");
        System.out.print("nhap ten khach hang: ");
        String tenKh= sc.nextLine();

        System.out.print("nhap ten san pham: ");
        String tenSp= sc.nextLine();

        System.out.print("nhap ten gia san pham: ");
        double giaSp= Double.parseDouble(sc.nextLine());

        System.out.print("nhap so luong mua: ");
        int soLuong= Integer.parseInt((sc.nextLine()));

        System.out.print("Khach hang co the thanh vien? (true/false) ");
        boolean theThanhVien= Boolean.parseBoolean(sc.nextLine());

        double thanhTien = giaSp*soLuong;
        double giamGia =0;
        if(theThanhVien == true) giamGia = thanhTien * 0.1;
        double vat = thanhTien * 0.08;
        System.out.printf("khach hang: %s\n", tenKh);
        System.out.printf("san pham: %s\n", tenSp);
        System.out.printf("so luong: %d\n", soLuong);
        System.out.printf("don gia: %.2f\n", giaSp);
        System.out.printf("thanh tien: %.2f\n", thanhTien);
        System.out.printf("giam gia thanh vien (10%%): %.2f\n", giamGia);
        System.out.printf("tien VAT (8%%): %.2f\n", vat);
        System.out.printf("tong tien thanh toan: %.2f\n", thanhTien - giamGia + vat);
    }
}
