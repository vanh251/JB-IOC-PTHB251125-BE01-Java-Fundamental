package session14.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Nhap so nguyen duong: ");
                int n = Integer.parseInt(sc.nextLine());
                if(n<=0){
                    throw new NumberFormatException("so khong phai so nguyen duong");
                }
                System.out.println(checkPrime(n));
                break;
            }catch(NumberFormatException e){
                System.out.println("Vui long nhap so nguyen duong!");
            }
        }
    }

    public static String checkPrime(int n){
        if(n<2 ) return "Khong phai so nguyen to";
        for(int i=2; i*i<=n;i++){
            if(n%i==0) return "Khong phai so nguyen to";
        }
        return "La so nguyen to";
    }
}
