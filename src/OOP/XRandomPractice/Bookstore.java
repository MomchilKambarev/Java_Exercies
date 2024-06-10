package OOP.XRandomPractice;

import static OOP.XRandomPractice.Book.collection;

public class Bookstore {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K.Rolling", "912399");
        Book book2 = new Book("Cooking for dummies", "Kejo", "123456");
        collection.add(book1);
        collection.add(book2);
        for (Book book : collection) {
            System.out.println(book.getTitle()+ " by " + book.getAuthor() + " with ISBN " + book.getISBN());
        }
    }

}
