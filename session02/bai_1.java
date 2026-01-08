package session02;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum=0;
        if(n<=0){
            System.out.println("Số nhập vào không hợp lệ");
        }
        else {
            for(int i = 1; i<=n; i++){
                sum+=i;
            }
            System.out.printf("Tổng các số từ 1 đến %d là: %d", n, sum);
        }
    }
}
