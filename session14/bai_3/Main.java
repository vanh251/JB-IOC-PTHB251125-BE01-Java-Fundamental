package session14.bai_3;

import session14.bai_2.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Account account = new Account(1000000,50000);
        while(true){
            try{
                System.out.println("nhap so tien muon rut:");
                double amount = Double.parseDouble(sc.nextLine());
                if (amount <=0 ){
                    System.err.println("So tien rut phai lon hon 0");
                    System.out.println("nhap so tien muon rut:");
                    amount = Double.parseDouble(sc.nextLine());
                }
                else if(amount > account.getInitialBalance()){
                    System.err.println("So tien rut vuot qua so du");
                    System.out.println("nhap so tien muon rut:");
                    amount = Double.parseDouble(sc.nextLine());
                }
                else if(account.getInitialBalance()-amount < account.getMinimumBalance()){
                    System.err.println("tai khoan phai duy tri so du toi thieu 50000");
                    System.out.println("nhap so tien muon rut:");
                    amount = Double.parseDouble(sc.nextLine());
                }
                else{
                    double newBalance = account.getInitialBalance() - amount;
                    account.setInitialBalance(newBalance);
                    System.out.println("So tien rut: " + amount);
                    System.out.println("Rut tien thanh cong! So du hien tai: " + account.getInitialBalance());
                    break;
                }
            } catch(NumberFormatException e){
                System.err.println("vui long nhap so hop le");
            }
        }
    }
}
