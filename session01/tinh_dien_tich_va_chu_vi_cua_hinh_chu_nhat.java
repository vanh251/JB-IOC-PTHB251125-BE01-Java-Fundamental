package session01;

import java.util.Scanner;

public class tinh_dien_tich_va_chu_vi_cua_hinh_chu_nhat {
    public static void main(String[] args) {
//        Khai báo 2 biến width và height có kiểu float lần lượt là 2 chiều rộng và chiều cao, 2 biến area và  perimeter có kiểu float lần lượt là diện tích và chu vi hình chữ nhật
//        Nhập dữ liệu
//        Nhập chiều dài và chiều rộng của hình chữ nhật từ bàn phím
//        Tính diện tích và chu vi:
//        Sử dụng công thức để tính diện tích và chu vi của hình chữ nhật và lưu giá trị tính toán vào 2 biến diện tích và chu vi
//        In kết quả diện tích và chu vi của hình chữ nhật lên màn hình`
        Scanner sc = new Scanner(System.in);
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        float area = width * height;
        float perimeter = (width + height) * 2;
        System.out.printf("Dien tich: %.2f Chu vi: %.2f ", area, perimeter);
    }
}
