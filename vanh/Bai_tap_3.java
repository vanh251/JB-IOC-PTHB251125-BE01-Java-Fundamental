package vanh;

import java.util.Scanner;

public class Bai_tap_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen n");
        int n = sc.nextInt();
        while (n<0){
            System.err.println("nhap so khong hop le");
            n = sc.nextInt();
        }
        System.out.println("so khong am thoa man: " + n);
    }
}
