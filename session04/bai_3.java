package session04;

import java.util.Arrays;
import java.util.Scanner;

public class bai_3 {
    public static void selectionSort(int[] a, int n){
        for(int i = 0 ; i<n-1; i++){
            for(int j = i+1; j<n;j++){
                if(a[j]>a[i]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0 ;i<n;i++){
            System.out.print("phan tu thu "+(i+1)+": ");
            a[i] = sc.nextInt();
        }
        selectionSort(a,n);
        System.out.println("mang sau khi sap xep giam dan: ");
        System.out.println(Arrays.toString(a));
        int val = sc.nextInt();
        int index1 = 0, index2 = 0;
        for(int i = 0; i<n;i++){
            if(a[i]==val) {
                index1 =i;
                break;
            }
        }
        System.out.printf("tim kiem tuyen tinh: so %d co vi tri %d ", val, index1);
        System.out.println();
        int left = 0, right =n-1;
        while (left<=right){
            int mid = (left + right) /2;
            if(val == a[mid]){
                index2=mid;
                break;
            }
            else if(val>a[mid]){
                right = mid -1;
            }
            else {
                left = mid+1;
            }
        }
        System.out.printf("tim kiem nhi phan: so %d co vi tri %d ", val, index2);
    }
}
