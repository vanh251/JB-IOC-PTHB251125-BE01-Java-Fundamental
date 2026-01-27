package session09.bai_3;

public class Student {
    private int age;
    private String fullName;
    private double gpa;
    static int cnt ;
    final double MAX_GPA = 4.0;
    final double MIN_GPA = 0.0;

    public Student(int age, String fullName, double gpa) {
        this.age = age;
        this.fullName = fullName;
        this.gpa = gpa;
        cnt++;
        if(gpa < MIN_GPA || gpa > MAX_GPA){
            System.out.println("GPA khong hop le!");
        }
    }

    public void printInfo(){
        System.out.printf("Full name: %s, Age: %d, GPA: %.2f\n", fullName, age, gpa);
    }

    public static int getCnt() {
        return cnt;
    }
}
