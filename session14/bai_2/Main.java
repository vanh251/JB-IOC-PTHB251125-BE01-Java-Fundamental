package session14.bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNotInt = 0;
        List<Integer> arr = new ArrayList<>();
        while (true) {
            try {
                System.out.println("nhap vao so nguyen a:");
                String s = sc.nextLine();
                if (s.equals("exit")) {
                    System.out.println("Thoat chuong trinh");
                    break;
                }
                int a = Integer.parseInt(s);
                arr.add(a);

            } catch (NumberFormatException e) {
                countNotInt++;
                System.out.println("nhap so nguyen khong hop le");
            }
        }
        System.out.println("so luong chuoi hop le: " + arr.size());
        System.out.println("so luong chuoi khong hop le: " + countNotInt);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
