package session03;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        while(true) {
            int cnt = 0;
            float maxScore = 0 , minScore=10;
            float sumScore = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("********** Menu Nhap Diem **********");
            System.out.println("1. Nhap diem hoc vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. thoat");
            System.out.println("lua chon cua ban:");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 3) {
                System.out.println("ket thuc chuong trinh");
                System.exit(0);
            } else if (choice == 1) {
                while (true) {
                    System.out.println("--- Nhap diem hoc vien ( nhap -1 de dung");
                    float score = Float.parseFloat(sc.nextLine());
                    if (score == -1){
                        System.out.println("ket thuc nhap diem");
                        break;
                    }
                    if (score<0 || score>10 ){
                        System.out.println("nhap diem ngoai khoang 0-10");
                        continue;
                    }
                    sumScore+=score;

                }
            }
        }
    }
}
