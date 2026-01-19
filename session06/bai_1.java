package session06;

import java.util.Arrays;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************** Quan ly diem sinh vien ****************");
        float [] arr = new float[10];
        float sumScore=0, avgScore, maxScore = 0, minScore = 10;
        int pass=0, fail =0, excellent=0;
        while (true){
            System.out.println("""
                1.  nhap danh sach diem sinh vien
                2.  in danh sach diem
                3.  tinh diem trung binh cua cac sinh vien
                4.  tim diem cao nhat va thap nhat
                5.  dem so luong sinh vien dat va truot
                6.  sap xep diem tang dan
                7.  thong ke so luong sinh vien gioi va xuat sac
                8.  thoat
                lua chon cua ban:
                """);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i<10; i ++){
                        arr[i] = sc.nextInt();
                        sumScore+=arr[i];
                        if(maxScore<arr[i]) maxScore=arr[i];
                        if(minScore>arr[i]) minScore=arr[i];
                        if(arr[i]>=8) excellent++;
                        if(arr[i]>=5) pass++;
                        else fail++;
                    }
                    break;
                case 2:
                    for (int i= 0;i < 10; i++){
                        System.out.println(arr[i]);
                    }
                    break;
                case 3:
                    avgScore = sumScore/10;
                    System.out.println(avgScore);
                    break;
                case 4:
                    System.out.printf("diem cao nhat: %.1f\n diem thap nhat: %.1f\n", maxScore, minScore);
                    break;
                case 5:
                    System.out.printf("so luong sinh vien dat: %d, so luong sinh vien truot: %d\n", pass, fail);
                    break;
                case 6:
                    Arrays.sort(arr);
                    for(int i =0; i<10; i++) System.out.printf("%.1f ", arr[i] );;
                    break;
                case 7:
                    System.out.printf("so luong sinh vien gioi va xuat sac: %d\n", excellent);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("nhap lai lua chon tu 8-10");
            }
        }
    }
}
