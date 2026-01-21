package vanh;

import java.util.Scanner;

public class session07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product("p01", "dieu hoa", "rat mat", 100, 100.0f, TrangThai.an);
        p1.displayInfo();
    }
}
