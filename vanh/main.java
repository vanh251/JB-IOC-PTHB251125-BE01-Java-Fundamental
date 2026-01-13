package vanh;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float maxScore = 0, minScore = 10, totalScore =0 ;
//        float [] arr = new float[10];
//        for(int i = 0 ; i<10; i++){
//            System.out.printf("nhap diem mon thu %d:", i+1 );
//            arr[i] = sc.nextFloat();
//            totalScore += arr[i];
//            if( arr[i] > maxScore) maxScore = arr[i];
//            if( arr[i] < minScore) minScore = arr[i];
//        }
//        System.out.printf("diem cao nhat: %.2f, diem thap nhat: %.2f, diem trung binh: %.2f", maxScore, minScore, totalScore/10);
        Random random =  new Random();
        int [] a = new int[100];
        for(int i = 0; i < 100; i++){
            a[i] = random.nextInt(1000);
        }
        for(int i: a) System.out.print(i+" ");
    }
}
