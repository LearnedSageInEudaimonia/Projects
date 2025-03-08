package Day02.LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle(){
        return  title;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void borrowBook(){
        isAvailable = false;
    }

    public void returnBook(){
        isAvailable = true;
    }

    @Override
    public String toString(){
        return  (STR."\{title} by \{author} - \{isAvailable ? "Available" : "Not Available"}");
    }
}