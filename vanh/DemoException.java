package vanh;

import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        divide(sc);
    }

    public static void divide(Scanner sc){
        while (true){
            try{
                System.out.println("nhap vao so a:");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("nhap vao so b:");
                int b = Integer.parseInt(sc.nextLine());
                int c = a / b;
                System.out.println("ket qua a/b = " + c);
                break;
            } catch (NumberFormatException e){
                System.out.println("nhap so khong hop le, vui long nhap lai");
            } catch (ArithmeticException e){
                System.out.println("khong the chia cho 0, vui long nhap lai");
            }
        }
    }
}
