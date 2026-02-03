package session13.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PersonManagement pm = new PersonManagement();
        while(true){
            System.out.println("""
                    ******************* Menu quan ly nguoi dung *******************
                    1. Them nguoi dung dung
                    2. Hien thi danh sach nguoi dung
                    3. Xoa nguoi dung theo email
                    4. Thoat
                    ***************************************************************
                    moi ban chon chuc nang:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap email: ");
                    String email = sc.nextLine();
                    System.out.println("Nhap phone: ");
                    String phone = sc.nextLine();
                    Person p = new Person(name,email,phone);
                    pm.addPerson(p);
                    break;
                case 2:
                    pm.displayPerson();
                    break;
                case 3:
                    System.out.println("Nhap email can xoa: ");
                    String emailDel = sc.nextLine();
                    pm.deletePersonByEmail(emailDel);
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Chuc nang khong hop le, vui long chon lai");
            }
        }
    }
}
