package vanh;

import java.util.Scanner;

public class Bai_tap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        switch (t){
            case 1:
                System.out.println("nhap n:");
                int n = sc.nextInt();
                System.out.println("tổng của n số tự nhiên đầu tiên là: "+ (n*(n+1))/2);
                break;
            case 2:
                System.out.println("nhap a va b");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                if ( b == 0) System.err.println("b nhập vào không hợp lệ");
                else {
                    System.out.printf("thương của a và b: %.2f", a/b);
                }
                break;
            default:
                System.err.println("chức năng không hợp lệ");
                break;
        }
    }
}
