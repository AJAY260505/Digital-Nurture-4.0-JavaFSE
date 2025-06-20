public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(5, "Moby Dick", "Herman Melville")
        };

        Library library = new Library(books);

        System.out.println("Linear Search:");
        Book result1 = library.linearSearch("1984");
        if (result1 != null)
            System.out.println("Found: " + result1);
        else
            System.out.println("Book not found.");

        System.out.println("\nBinary Search:");
        Book result2 = library.binarySearch("Moby Dick");
        if (result2 != null)
            System.out.println("Found: " + result2);
        else
            System.out.println("Book not found.");
    }
}
