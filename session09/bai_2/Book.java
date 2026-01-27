package session09.bai_2;

public class Book {
    private String title, author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo(){
        System.out.printf("author: %s, title: %s, price: %.2f", author,title, price);
    }
}
