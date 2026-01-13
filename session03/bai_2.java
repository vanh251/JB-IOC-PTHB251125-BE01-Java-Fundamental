package session03;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********** Menu Nhap Diem **********");
        System.out.println("1. Nhap diem hoc vien");
        System.out.println("2. Hien thi thong ke");
        System.out.println("3. thoat");
        System.out.println("lua chon cua ban:");

        int cnt = 0;
        int choice = sc.nextInt();
        if(choice == 3){
            System.out.println("ket thuc chuong trinh");
        }
        else if (choice == 1){
            System.out.println("--- Nhap diem hoc vien ( nhap -1 de dung");
            float score = Float.parseFloat(sc.nextLine());
            while (score != -1){

            }
        }
    }
}
