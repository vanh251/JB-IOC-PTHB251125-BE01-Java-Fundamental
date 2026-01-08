package session02;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b<=c || a+c<=b || b+c<=a){
            System.out.println("Ba cạnh không tạo thành tam giác");
        }
        else {
            if(a==b && b==c) System.out.println("Tam giác đều");
            else if (a==b || b==c || a==c) System.out.println("Tam giác cân");
            else if ((a*a +b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) System.out.println("Tam giác vuông");
            else System.out.println("Tam giác thường");
        }
    }
}
