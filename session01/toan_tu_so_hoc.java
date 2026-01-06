package session01;

import java.util.Scanner;

public class toan_tu_so_hoc {
    public static void main(String[] args) {
//        Khai báo 2 biến kiểu số nguyên int và nhập giá trị :
//        Khai báo hai số nguyên firstNumber và secondNumber có kiểu int
//        Nhập các giá trị bất kỳ cho 2 biến
//        Thực hiện các phép toán:
//        Tính tổng của firstNumber và secondNumber và gán cho
//        Tính hiệu của firstNumber và secondNumber
//        Tính tích của firstNumber và secondNumber
//        Tính thương của firstNumber chia cho secondNumber
//        Tính phần dư khi chia firstNumber cho secondNumber
//        In giá trị 2 biến firstNumber, secondNumber và kết quả các phép tính ra màn hình
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thu nhat: ");
        int firstNumber = sc.nextInt();
        System.out.println("nhap so thu hai: ");
        int secondNumber = sc.nextInt();
        System.out.println("firstNumber = "+ firstNumber);
        System.out.println("secondNumber = "+ secondNumber );
        System.out.println("tong = " + (firstNumber + secondNumber));
        System.out.println("hieu = " + (firstNumber - secondNumber));
        System.out.println("tich = " + (firstNumber * secondNumber));
        System.out.println("thuong = " + (firstNumber / secondNumber));
        System.out.println("phan du = " + (firstNumber % secondNumber));
    }
}
