package vanh.bth;

import java.util.Scanner;

public class Student {
    // 	id, name, dateofbirth, email, phone, sex
    private int id;
    private String name, dateOfBirth, email, phone;
    private boolean sex;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String email, String phone, boolean sex) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Tên Sinh Viên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập Ngày Sinh (dd/MM/yyyy): ");
        this.dateOfBirth = sc.nextLine();
        System.out.println("Nhập Email: ");
        this.email = sc.nextLine();
        System.out.println("Nhập Số Điện Thoại: ");
        this.phone = sc.nextLine();
        System.out.println("Nhập Giới Tính (nam/nữ hoặc true/false): ");
        String sexInput = sc.nextLine();
        // accept 'nam', 'n', 'true', 'male' as male; otherwise treat as female
        if(sexInput == null) {
            this.sex = false;
        } else {
            String s = sexInput.trim().toLowerCase();
            this.sex = s.equals("nam") || s.equals("n") || s.equals("true") || s.equals("male");
        }
    }

    public void displayData() {
        // use %s for string fields to avoid format exceptions
        System.out.printf("| %-4d | %-15s | %-10s | %-15s | %-10s | %-5s |\n",
                id, name, dateOfBirth, email, phone, sex ? "nam" : "nữ");
    }
}
