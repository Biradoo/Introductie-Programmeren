import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import javax.security.auth.login.AccountLockedException;
import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1600, 768);
    }

    public void run() {
        ArrayList<Book> books = new ArrayList<>();

        //Read the books from the csv file
        readBooks(books);
        int input = -1;

        while (input != 0) {
            SaxionApp.clear();
            //creates the menu
            menu();
            input = SaxionApp.readInt();

            if (input == 1) {
                searchBook(books, "titel");
            } else if (input == 2) {
                searchBook(books, "auteur");
            } else if (input == 3) {
                searchBook(books, "ISBN");
            } else if (input == 4) {
                printTopRatedBooks(books);
            } else if (input == 5) {
                rentOrBringBackBook(books, "rent");
            } else if (input == 6) {
                rentOrBringBackBook(books, "bringBack");
            } else if (input == 0) {
            }
            SaxionApp.pause();
        }
    }

    void rentOrBringBackBook(ArrayList<Book> books, String rentOrBringBack) {
        if (rentOrBringBack.equals("rent")) {
            SaxionApp.print("Welke boek (id) wilt u lenen? ");
        } else {
            SaxionApp.print("Welk boek (id) wilt u terugbrengen? ");
        }
        int inputId = SaxionApp.readInt();
        Book rentOrBringBackBook = new Book();

        for (Book book : books) {
            if (book.id == inputId) {
                rentOrBringBackBook = book;
            }
        }
        if (rentOrBringBack.equals("rent")) {
            if (rentOrBringBackBook.isBorrowed) {
                SaxionApp.printLine("Boek is al uitgeleend!");
            } else {
                printBook(rentOrBringBackBook);
                rentOrBringBackBook.isBorrowed = true;
                SaxionApp.printLine("Book is now rented!", Color.green);
            }
        } else if (rentOrBringBack.equals("bringBack")) {
            if (rentOrBringBackBook.isBorrowed) {
                rentOrBringBackBook.isBorrowed = false;
            } else {
                SaxionApp.printLine("That's not possible!!");
            }

        }
    }

    void printTopRatedBooks(ArrayList<Book> books) {
        double topRated = 4.8;
        for (Book book : books) {
            if (book.rating > topRated) {
                printBook(book);
            }
        }
    }

    void searchBook(ArrayList<Book> books, String type) {
        SaxionApp.print("Zoek op woord: ");
        String input = SaxionApp.readString();
        int counter = 0;

        for (Book book : books) {
            if (type.equals("titel")) {
                if (book.title.contains(input)) {
                    printBook(book);
                    counter++;
                }
            } else if (type.equals("auteur")) {
                if (book.authors.contains(input)) {
                    printBook(book);
                    counter++;
                }
            } else if (type.equals("ISBN")) {
                if (book.isbn13.contains(input)) {
                    printBook(book);
                    counter++;
                }
            }
        }
    }

    void printBook(Book book) {
        if (book.isBorrowed) {
            SaxionApp.print(book.id + " ", Color.red);
            SaxionApp.print("ISBN: ", Color.red);
            SaxionApp.print(book.isbn13, Color.red);
            SaxionApp.print(" Title and authors: ", Color.red);
            SaxionApp.print(book.title + " (" + book.authors + ")", Color.red);
            SaxionApp.print(" Rating: ", Color.red);
            SaxionApp.printLine(book.rating, Color.red);
        } else {
            SaxionApp.print(book.id + " ");
            SaxionApp.print("ISBN: ", Color.yellow);
            SaxionApp.print(book.isbn13);
            SaxionApp.print(" Title and authors: ", Color.yellow);
            SaxionApp.print(book.title + " (" + book.authors + ")");
            SaxionApp.print(" Rating: ", Color.yellow);
            SaxionApp.printLine(book.rating);
        }
    }

    public void readBooks(ArrayList<Book> books) {
        CsvReader reader = new CsvReader("Exercise3/books.csv");
        reader.skipRow();
        reader.setSeparator(';');

        while (reader.loadRow()) {
            Book book = new Book();
            book.authors = reader.getString(2);
            book.id = reader.getInt(0);
            book.isbn13 = reader.getString(4);
            book.rating = reader.getDouble(3);
            book.title = reader.getString(1);

            books.add(book);
        }
    }

    void menu() {
        SaxionApp.printLine("1. Search for a title");
        SaxionApp.printLine("2. Search for an author");
        SaxionApp.printLine("3. Search for an ISBN");
        SaxionApp.printLine("4. Give top rated books");
        SaxionApp.printLine();
        SaxionApp.printLine("5. Rent a book");
        SaxionApp.printLine("6. Return a book");
        SaxionApp.printLine();
        SaxionApp.printLine("0. Quit");
        SaxionApp.printLine();

        SaxionApp.print("Make a choice: ", Color.gray);
    }
}