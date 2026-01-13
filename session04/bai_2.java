package session04;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("nhap so hang cua mang: ");
        n = sc.nextInt();
        System.out.print("nhap so cot cua mang: ");
        m = sc.nextInt();
        int [][] a = new int[n][m];
        int sumOdd =0 , sumEven = 0;
        System.out.println("nhap cac phan tu cua mang:");
        for(int i = 0 ; i< n; i++){
            for(int j = 0 ; j< m ;j++){
                System.out.printf("phan tu [%d][%d]: \n", i, j);
                a[i][j]= sc.nextInt();
                if(a[i][j] % 2 ==0) sumEven += a[i][j];
                else sumOdd += a[i][j];
            }
        }
        System.out.println("tong cac so chan "+ sumEven);
        System.out.println("tong cac so le "+ sumOdd);
    }
}
