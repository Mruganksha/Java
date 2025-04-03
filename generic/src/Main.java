/*You are developing a library management system and need to implement a generic class Library<T> that can store books, journals, or magazines.

    Implement the generic class Library<T>.

    Ensure that only objects of type Book, Journal, or Magazine can be added.

    Add a method getItems() that returns all stored items.*/

import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + title;
    }
}

class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }
}

class Journal extends LibraryItem {
    public Journal(String title) {
        super(title);
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }
}

class Library<T extends LibraryItem> {
    private List<T> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class Main {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addItem(new Book("java programming"));
        bookLibrary.addItem(new Book("kernal"));

        // Create a Library for Journals
        Library<Journal> journalLibrary = new Library<>();
        journalLibrary.addItem(new Journal("science journal"));
        journalLibrary.addItem(new Journal("research journal"));

        // Create a Library for Magazines
        Library<Magazine> magazineLibrary = new Library<>();
        magazineLibrary.addItem(new Magazine("Time Magazine"));
        magazineLibrary.addItem(new Magazine("Compics"));

        // Display all books
        System.out.println("Books in Library:");
        for (Book book : bookLibrary.getItems()) {
            System.out.println(book);
        }

        // Display all journals
        System.out.println("\nJournals in Library:");
        for (Journal journal : journalLibrary.getItems()) {
            System.out.println(journal);
        }

        // Display all magazines
        System.out.println("\nMagazines in Library:");
        for (Magazine magazine : magazineLibrary.getItems()) {
            System.out.println(magazine);
        }
    }
}
