package OOP.XRandomPractice;

import java.util.ArrayList;

public class Book {
    String title;
    String author;
    String ISBN;

    final static ArrayList<Book> collection = new ArrayList<Book>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

     public void addBook(Book book) {
        collection.add(book);
     }

    public void deleteBook(Book book) {
        collection.remove(book);
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

}
