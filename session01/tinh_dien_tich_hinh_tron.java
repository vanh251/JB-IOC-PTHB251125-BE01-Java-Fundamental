package session01;

import java.util.Scanner;

public class tinh_dien_tich_hinh_tron {
    //Viết chương trình yêu cầu người dùng nhập bán kính của một hình tròn , sau đó tính và hiển thị diện tích
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = 3.14 * r * r;
        System.out.printf("Dien tich: %.2f", s);
    }
}
