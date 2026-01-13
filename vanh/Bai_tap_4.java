package vanh;

import java.util.Scanner;

public class Bai_tap_4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while (true){
            System.out.println("nhap lua chon");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    int n = sc.nextInt();
                    long giaiThua = 1;
                    for(int i=1;i<=n;i++) giaiThua*=i;
                    System.out.printf("giai thua cua %d: %d\n", n, giaiThua);
                    break;
                case 2:
                    int n2 = sc.nextInt();
                    long sum = 0;
                    for(int i=1;i<=n2;i++) sum+=i;
                    System.out.printf("tong cua %d so dau tien: %d\n", n2, sum);
                    break;
                case 3:
                    int n3 = sc.nextInt();
                    System.out.println("cac uoc cua "+n3);
                    for(int i=1;i<=n3;i++){
                        if(n3%i==0){
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    return;
            }
        }
    }
}
