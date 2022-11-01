package Reader;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;

public class Library {
    private final Book[] books;

    private Library(Book[] books) {
        this.books = books;
    }

    Library() {
        this.books = new Book[50];
        Arrays.fill(this.books, (Object)null);
    }

    public void addBookToLibrary(String bookName) {
        Book book = new Book(bookName);

        for(int i = 0; i < this.books.length; ++i) {
            if (this.books[i] == null) {
                this.books[i] = book;
                return;
            }
        }

    }

    public void takeBook(int amountOfBooks, Reader reader) {
        for(int i = 0; i <= amountOfBooks - 1; ++i) {
            if (this.books[i] != null) {
                this.books[i] = null;
            }
        }

        PrintStream var10000 = System.out;
        String var10001 = reader.getFullName();
        var10000.println(var10001 + " взял " + amountOfBooks + " книг/-у/-и");
    }

    public void takeBook(String bookName, Reader reader) {
        for(int i = 0; i < this.books.length; ++i) {
            if (this.books[i] != null && this.books[i].getBookName().equals(bookName)) {
                PrintStream var10000 = System.out;
                String var10001 = reader.getFullName();
                var10000.println(var10001 + " взял книгу " + this.books[i].getBookName());
                this.books[i] = null;
                return;
            }
        }

    }

    public void returnBook(String bookName, Reader reader) {
        Book book = new Book(bookName);

        for(int i = 0; i < this.books.length; ++i) {
            if (this.books[i] == null) {
                this.books[i] = book;
                PrintStream var10000 = System.out;
                String var10001 = reader.getFullName();
                var10000.println(var10001 + " вернул книгу " + this.books[i].getBookName());
                return;
            }
        }

    }

    public String toString() {
        return Arrays.toString(this.books);
    }

    public int hashCode() {
        return Objects.hashCode(this.books);
    }

    public boolean equals(Object other) {
        if (other != null && this.getClass() == other.getClass()) {
            return this == other ? true : Arrays.equals(this.books, ((Library)other).books);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Reader reader1 = new Reader("Аксёнов Виталий", 1, "Экономика", "19.02.2000", "89023567898");
        Library library = new Library();
        library.addBookToLibrary("Война и мир");
        library.addBookToLibrary("Начать думать в понедельник и не перестать во вторник");
        library.addBookToLibrary("Анатомические поезда");
        library.addBookToLibrary("1984");
        System.out.println(library);
        library.takeBook(3, reader1);
        System.out.println(library);
    }
}