package session05;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine().trim();
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";
        boolean check = email.matches(regex);
        System.out.println(check?"email hop le":"email khong hop le");
    }
}

//Phần username: Có thể chứa các chữ cái, chữ số, dấu chấm (.), hoặc dấu gạch dưới (_).
//Ký tự @: Ngăn cách giữa phần username và domain.
//Phần domain: Chứa chữ cái hoặc chữ số, có thể chứa dấu chấm (.).
//Đuôi miền (TLD - Top-level Domain): Dài từ 2 đến 6 ký tự, chỉ chứa chữ cái.