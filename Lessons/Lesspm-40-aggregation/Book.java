public class Book {
    private String title;
    private int pageCount; // Aggregation: Book "has-a" Author

    Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title; 
    }

    public int getPageCount() {
        return pageCount;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}