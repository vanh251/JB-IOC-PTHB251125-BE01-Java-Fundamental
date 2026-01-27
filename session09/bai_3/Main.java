package session09.bai_3;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(20, "Nguyen Van A", 3.5);
        Student s2 = new Student(22, "Le Thi B", 4.1);
        Student s3 = new Student(19, "Tran Van C", 2.8);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        System.out.println("Total students: " + Student.getCnt());
    }
}
