package javaBeginner;
import java.util.ArrayList;
import java.util.List;

public class challange {
    private List<String> availableBooks;
    private List<String> issuedBooks;

    public challange() {
        availableBooks = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(String bookTitle) {
        availableBooks.add(bookTitle);
        System.out.println(bookTitle + " has been added to the library.");
    }

    // Method to issue a book to a user
    public void issueBook(String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println("You have successfully borrowed " + bookTitle + ".");
        } else {
            System.out.println("Sorry, " + bookTitle + " is not available in the library.");
        }
    }

    // Method to return a book to the library
    public void returnBook(String bookTitle) {
        if (issuedBooks.contains(bookTitle)) {
            issuedBooks.remove(bookTitle);
            availableBooks.add(bookTitle);
            System.out.println("Thank you for returning " + bookTitle + ".");
        } else {
            System.out.println("This book was not issued from this library.");
        }
    }

    // Method to display the available books in the library
    public void showAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books are available in the library.");
        } else {
            System.out.println("Available Books:");
            for (String book : availableBooks) {
                System.out.println(book);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        challange library = new challange();

        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        library.showAvailableBooks();

        library.issueBook("Book 2");
        library.showAvailableBooks();

        library.returnBook("Book 2");
        library.showAvailableBooks();
    }
}
