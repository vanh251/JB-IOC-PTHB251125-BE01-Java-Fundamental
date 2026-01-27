package vanh.bth;

import java.util.Scanner;

public class StudentManager {
    private Student [] students = new Student[100];
    private int size = 0;
    private static final int MAX_SIZE = 100;

    public StudentManager() {
        // khởi tao mảng 100 sinh viên
        students = new Student[MAX_SIZE];
        Student s1 = new Student(1,"Nguyen Van A", "11/11/2006","anv@gmail.com","0989743654",true);
        students[0] = s1;
        size = 1;
    }

    public void showListStudent(){
        if(size==0){
            System.out.println("Chưa có sinh viên nào trong danh sách");
            return;
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("| %-4s | %-15s | %-10s | %-15s | %-10s | %-5s \n",
                "ID", "Tên Sinh Viên", "Ngày Sinh", "Email", "Số ĐT", "Sex");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i <size ; i++) {
            students[i].displayData();
        }
        System.out.println("-----------------------------------------------");
    }

    public void addStudent(Scanner sc){
        System.out.println("nhap so sinh vien muon them:");
        int n= Integer.parseInt(sc.nextLine());
        if(size + n > MAX_SIZE){
            System.out.println("khong the them sinh vien, vuot qua so luong cho phep");
            return;
        }
        for(int i = size; i< size + n; i++){
            Student newStudent = new Student();
            newStudent.inputData(sc);
            newStudent.setId(i + 1);
            students[i] = newStudent;
        }
        size += n;
    }
    public void updateStudent(Scanner sc ){
        System.out.println("nhap id sinh vien can sua:");
    }
    public void deleteStudent(){

    }
    public void removeStudent(){

    }
}
