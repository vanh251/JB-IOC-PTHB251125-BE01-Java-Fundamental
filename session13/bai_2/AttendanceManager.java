package session13.bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendanceManager implements Manage<Student>{
    private static List<Student> studentList = new ArrayList<>();

    public AttendanceManager() {
    }

    @Override
    public void add(Student item) {
        studentList.add(item);
    }

    @Override
    public void update(int idx, Student item) {
        studentList.set(idx, item);
    }

    public int getIdxById(int id){
        for(Student s: studentList){
            if(s.getId() == id){
                return studentList.indexOf(s);
            }
        }
        return -1;
    }

    @Override
    public void delete(int idx) {
        studentList.remove(idx);
    }

    @Override
    public void display() {
        for(Student s: studentList){
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName());
        }
    }
}
