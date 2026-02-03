package vanh.BT1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        //them 3 sinh vien vao danh sach
        studentList.add(new Student("Nguyen Van A", 1, 20));
        studentList.add(new Student("Tran Thi B", 2, 22));
        studentList.add(new Student("Le Van C", 3, 21));

        //lay va in ten sinh vien co index =2
        System.out.println("student at index 2: " + studentList.get(2).getName());

        //sua ten sinh vien thu 2 thanh "ho duc minh"
        studentList.get(1).setName("Ho Duc Minh");
        studentList.get(1).displayInfo();

        //xoa sinh vien tai vi tri dau tien
        studentList.remove(0);
        System.out.println(studentList);

        //them sinh vien theo vi tri bat ki
        Student stu = new Student();
        System.out.print("Enter name: ");
        stu.setName(sc.nextLine());
        System.out.print("Enter id: ");
        stu.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter age: ");
        stu.setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter position to add: ");
        int position = Integer.parseInt(sc.nextLine());
        studentList.add(position, stu);

        //tim kiem cac sinh vien co ten chua chu "van" trong ten
        System.out.println("Students with 'van' in their name:");
        for(Student s: studentList){
            if(s.getName().toLowerCase().contains("van")){
                s.displayInfo();
            }
        }
    }
}
