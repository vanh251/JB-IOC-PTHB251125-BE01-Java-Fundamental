package session09.bai_2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Book> b = new ArrayList<>();
        Book b1 =  new Book("Java core", "Nguyen Van A", 120000);
        Book b2 =  new Book("C++", "Nguyen Van B", 100000);
        Book b3 =  new Book("Python", "Nguyen Van C", 150000);
        b.add(b1);
        b.add(b2);
        b.add(b3);
        for (Book book : b) {
            book.printInfo();
            System.out.println();
        }
    }
}
