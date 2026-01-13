package session04;

import java.util.Scanner;

public class bai_1 {
    public static void bubbleSort(int [] a, int n){
        for(int i = 0; i < n; i++){
            boolean swapped = false;
            for(int j = 0 ; j<n-i-1; j++){
                if(a[j] < a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("nhap cac phan tu cua mang:");
        for(int i = 0; i<n; i++){
            System.out.print("phan tu thu "+ (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("mang sau khi da sap xep giam dan: ");
        bubbleSort(arr, n);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
