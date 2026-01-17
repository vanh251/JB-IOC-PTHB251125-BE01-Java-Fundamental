package session05;

import java.util.Random;
import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        if(n<1 || n>1000){
            System.out.println("n nam ngoai khoan 0-1000");
        }
        else{
            System.out.println(randomString(n));
        }
    }

    public static String randomString (int n){
        StringBuilder sb= new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        for(int i = 0 ;i <n ;i++){
            int x = random.nextInt(characters.length());
            sb.append(characters.charAt(x));
        }
        return sb.toString();
    }
}
