package Level_2.LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook( Book book){
        books.add(book);
    }

    public void showBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    public void borrowBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title) && book.isAvailable()){
                book.borrowBook();
                System.out.println(STR."You borrowed : \{title}");
                return;
            }
        }
        System.out.println("Book not Available");
    }

    public void returnBook(String title){
    for(Book book : books){
        if(book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()){
            book.returnBook();
            System.out.println(STR."You returned : \{title}");
            return;
        }
    }
        System.out.println("Invalid return request");
    }


}
