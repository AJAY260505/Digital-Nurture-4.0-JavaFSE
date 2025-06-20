import java.util.Arrays;

public class Library {
    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book linearSearch(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearch(String title) {
        Arrays.sort(books, (a, b) -> a.title.compareToIgnoreCase(b.title));
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0)
                return books[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }
}
