//Sort Book objects using Comparable and Comparator interfaces

import java.util.*;

class Book implements Comparable<Book> {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int compareTo(Book other) {
        return Double.compare(this.price, other.price);
    }
}

class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.title.compareTo(b2.title);
    }
}

public class Program4 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Java Basics", "Alice", 450.0));
        books.add(new Book("Python Guide", "Bob", 400.0));
        books.add(new Book("Data Structures", "Charlie", 500.0));
        books.add(new Book("Algorithms", "David", 350.0));

        System.out.println("=== Original List ===");
        printBooks(books);

        Collections.sort(books);
        System.out.println("\n=== Sorted by Price (Comparable) ===");
        printBooks(books);

        books.sort(new TitleComparator());
        System.out.println("\n=== Sorted by Title (Comparator) ===");
        printBooks(books);
    }

    static void printBooks(ArrayList<Book> books) {
        System.out.printf("%-20s %-15s %-8s\n", "Title", "Author", "Price (₹)");
        System.out.println("-----------------------------------------------");
        for (Book b : books) {
            System.out.printf("%-20s %-15s ₹%-7.2f\n", b.title, b.author, b.price);
        }
    }
}