package session13.bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceManager attendanceManager = new AttendanceManager();
        while(true){
            System.out.println("""
                    1. them sinh vien
                    2. sua sinh vien
                    3. xoa sinh vien
                    4. hien thi danh sach sinh vien
                    5. thoat
                    nhap lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap id sinh vien:");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap ten sinh vien:");
                    String name = sc.nextLine();
                    Student newStudent = new Student(name, id);
                    attendanceManager.add(newStudent);
                    break;
                case 2:
                    System.out.println("nhap id sinh vien can sua:");
                    int updateId = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap ten sinh vien moi:");
                    String updateName = sc.nextLine();
                    attendanceManager.update(attendanceManager.getIdxById(updateId), new Student(updateName, updateId));
                    break;
                case 3:
                    System.out.println("nhap id sinh vien can xoa:");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    attendanceManager.delete(attendanceManager.getIdxById(deleteId));
                    break;
                case 4:
                    attendanceManager.display();
                    break;
                case 5:
                    System.out.println("thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("lua chon khong hop le, vui long chon lai");
            }
        }
    }
}
