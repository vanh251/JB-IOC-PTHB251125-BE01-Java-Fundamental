package session01;

import java.util.Scanner;

public class tinh_tong_hai_phan_so {
    public static void main(String[] args) {
//        Nhập tử số và mẫu số của hai phân số từ người dùng
//        Sử dụng biến để lưu trữ tử số và mẫu số
//        Tính tổng của hai phân số theo công thức
//        In kết quả ra màn hình dưới dạng phân số (a/b)
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int tu = a*d + b*c;
        int mau = b*d;
        System.out.printf("ket qua = %d/%d", tu, mau);
    }
}
