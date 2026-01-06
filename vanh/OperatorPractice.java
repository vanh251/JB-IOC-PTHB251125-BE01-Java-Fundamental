package vanh;

import java.util.Scanner;
import java.math.*;

public class OperatorPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float chuVi = a+b+c;
        float p = chuVi / 2;
        float dienTich = (float) Math.sqrt(p* (p-a) * (p-b) * (p-c));
        System.out.println(chuVi + " " + dienTich);

        float delta = b*b - 4*a*c;
        if(delta <0) System.out.println("phuong trinh vo nghiem");
        else if (delta == 0) System.out.println("x = " + -b/(2*a));
        else {
            float x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
            float x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
            System.out.println("x1 = "+ x1+ " x2 = " + x2);
        }

    }
}
