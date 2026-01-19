package session06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> danhSachBienSo = new ArrayList<>();
        while (true){
            System.out.println("""
                    ************** quan ly bien so xe  **************
                    1. them cac bien so xe
                    2. hien thi danh sach bien so xe
                    3. tim kiem bien so xe
                    4. tim bien so xe theo ma tinh
                    5. sap xep bien so xe tang dan
                    6. thoat
                    lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                System.out.print("Nhập số lượng biển số muốn thêm: ");
                int n = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < n; i++) {
                    System.out.print("Nhập biển số thứ " + (i + 1) + ": ");
                    String bienSo = sc.nextLine().trim().toUpperCase();
                    if (bienSo.matches("^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$")) {
                        danhSachBienSo.add(bienSo);
                    } else {
                        System.out.println("Định dạng sai, mời nhập lại!");
                        i--;
                    }
                }
                break;
                case 2:
                    System.out.println("Danh sách biển số hiện tại:");
                    for (String s : danhSachBienSo) System.out.println(s);
                    break;
                case 3:
                    System.out.print("Nhập biển số cần tìm: ");
                    String timKiem = sc.nextLine().trim().toUpperCase();
                    if (danhSachBienSo.contains(timKiem)) {
                        System.out.println("Tìm thấy biển số " + timKiem);
                    } else {
                        System.out.println("Không tìm thấy.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã tỉnh: ");
                    String maTinh = sc.nextLine().trim();
                    boolean found = false;
                    for (String s : danhSachBienSo) {
                        if (s.startsWith(maTinh)) {
                            System.out.println(s);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Không có biển số thuộc mã tỉnh này.");
                    break;
                case 5:
                    Collections.sort(danhSachBienSo);
                    System.out.println("Đã sắp xếp xong!");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
