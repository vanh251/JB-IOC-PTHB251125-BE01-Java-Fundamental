package session13.bai_2;

public interface Manage <T> {
    void add (T item);
    void update (int idx, T item);
    void delete (int idx);
    void display();
}
