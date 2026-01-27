package session08;

class Book{
    private String title, author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

public class bai_2 {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 29.99);
        System.out.println(book.toString());
    }
}
