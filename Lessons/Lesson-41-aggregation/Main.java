public class Main {
    public static void main(String[] args) {
        // Aggregation represents a "has-a" relationship between objects
        // One object conatains another object as part of its structure
        Book book1 = new Book("Lord of the Flies", 224);
        Book book2 = new Book("Lord of the Rings", 1178);
        Book[] books = {book1, book2};

        Library library = new Library("Your local library", books);

        System.out.println(library.getName() + " has the following books:");
        
        for (Book book : library.getBooks()) {
            System.out.println("- " + book.getTitle() + " with " + book.getPageCount() + " pages");
        }
    }
}