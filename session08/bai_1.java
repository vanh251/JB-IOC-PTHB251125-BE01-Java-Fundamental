package session08;

class Student {
    private int id, age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class bai_1 {
    public static void main(String[] args) {
        Student student = new Student(1,20,"Nguyen Van A");
        System.out.println(student.toString());
    }
}
