package session13.bai_1;

import java.util.Collection;
import java.util.LinkedList;

public class PersonManagement {
    public LinkedList<Person> listPerson;

    public PersonManagement() {
    }

    public void addPerson(Person p){
        if(listPerson == null){
            listPerson = new LinkedList<>();
        }
        listPerson.add(p);
    }

    public void displayPerson(){
        if(listPerson.isEmpty()){
            System.out.println("Danh sach rong");
        }
        else{
            for(Person p: listPerson){
                System.out.println("Name: " + p.getName());
                System.out.println("Email: " + p.getEmail());
                System.out.println("Phone: " + p.getPhone());
                System.out.println("---------------------");
            }
        }
    }

    public void deletePersonByEmail(String email){
        if(listPerson.isEmpty()){
            System.out.println("Danh sach rong");
        }
        else {
            for(Person p: listPerson){
                if(p.getEmail().equals(email)){
                    listPerson.remove(p);
                    System.out.println("Da xoa nguoi co email: " + email);
                    return;
                }
            }
            System.out.println("Khong tim thay nguoi co email: " + email);
        }
    }
}
