public class Library {
    private String name;
    private Book[] books; // Example of aggregation: Library "has-a" Book(s)

    Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }
    
    
    public Book[] getBooks() {
        return books;
    }
}