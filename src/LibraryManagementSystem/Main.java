package LibraryManagementSystem;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("Python");
        centralLibrary.addBook("Java");
        centralLibrary.issueBook("Java");
        try {
            centralLibrary.returnBook("Java");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        centralLibrary.showAvailableBook();
    }
}

class Library {
    ArrayList<String> books;
    int no_of_books;

    Library() {
        books = new ArrayList<String>();
        no_of_books = 0;
    }
    public void addBook(String book) {
        System.out.println("========================================");
        books.add(no_of_books, book);
        no_of_books++;
        System.out.println("Book Added : "+ book);
        System.out.println("========================================\n");
    }
    public void issueBook(String book) {
        System.out.println("========================================");
        for(int count = 0; count <= books.size(); count++) {
            if(books.contains(book)) {
                System.out.println(book + " book has been issued");
                books.remove(book);
                break;
            } else {
                System.out.println(book + " book not found");
                break;
            }
        }
        System.out.println("========================================\n");
    }
    public void showAvailableBook() {
        System.out.println("========================================");
        System.out.println("Available Books");
        for (String book: books) {
            if(book == null) {
                continue;
            } else {
                System.out.println("* "+ book);
            }
        }
        System.out.println("========================================");
    }
    public void returnBook(String returnBook) {
        books.add(returnBook);
    }

}
