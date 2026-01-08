package session02;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println("Tong cac chu so la:" + sum);
    }
}
