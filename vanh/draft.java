package vanh;

import java.util.Scanner;

public class draft {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String [] s = str.trim().split(" ");
        for(String x:s) System.out.println(x);
    }
}
