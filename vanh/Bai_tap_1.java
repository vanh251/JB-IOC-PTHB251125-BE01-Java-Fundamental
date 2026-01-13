package vanh;

import java.util.Scanner;

public class Bai_tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng và chiều cao");
        float canNang = sc.nextFloat();
        float chieuCao = sc.nextFloat();
        float bmi = canNang/(chieuCao * chieuCao);
        if(bmi < 16) System.out.println("Gầy độ 3");
        else if(bmi < 17) System.out.println("Gầy độ 2");
        else if(bmi < 18.5) System.out.println("Gầy độ 1");
        else if(bmi < 25) System.out.println("Bình thường");
        else if(bmi < 30) System.out.println("Tiền béo phì");
        else if(bmi < 35) System.out.println("Béo phì độ I");
        else if(bmi < 40) System.out.println("Béo phì độ II");
        else System.out.println("Béo phì độ III");
    }
}