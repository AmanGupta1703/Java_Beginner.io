package Collection.LibraryManagement;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("C++", "xyz"));
        book.add(new Book("Python", "abc"));
        book.add(new Book(" Kotlin", "wvx"));

        Library library = new Library(book);


    }
}
class Book {
    String book, Author;

    public Book(String book, String author) {
        this.book = book;
        Author = author;
    }
}

class Library {
    ArrayList<Book> books;

    Library(ArrayList<Book> books) {
        this.books = books;
    }

    // adding to the library
    public void addBooks(Book book, String issue_To) {
        System.out.println("* " + book + " is added");
        this.books.add(book);
    }

    // returning the book to the library
    public void returnBook(Book book, String return_By) {
        System.out.println(book + " has been returned by " + return_By);
        this.books.add(book);
    }

    // issuing the book
    public void issueBook(Book book, String issued_To) {
        System.out.println("Book has been issued to: " + issued_To);
        this.books.remove(book);
    }
}
