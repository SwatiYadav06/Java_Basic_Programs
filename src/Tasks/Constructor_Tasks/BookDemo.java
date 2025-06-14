package Tasks.Constructor_Tasks;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 399.00);

        book1.displayDetails();
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : ₹" + price);
    }
}