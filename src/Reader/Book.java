package Reader;

import java.util.Objects;

public class Book {
    private final String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public String toString() {
        return bookName;
    }

    public boolean equals(Object other) {
        if (other != null && this.getClass() == other.getClass()) {
            if (this == other) {
                return true;
            } else {
                Book book = (Book)other;
                return bookName.equals(book.bookName);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.bookName);
    }
}
