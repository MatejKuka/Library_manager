package DAO;

import BE.Book;
import BE.Category;

import java.util.ArrayList;
import java.util.List;

public class BookDAO implements IBookDAO{
    List<Book> allBooksList;
    List<Book> wishListBooks;

    public BookDAO(){
        System.out.println("BookDAO test");
        allBooksList = new ArrayList<>();
        wishListBooks = new ArrayList<>();
        setUpRandomBooks();
    }

    @Override
    public Book createBook(Book book) {
        allBooksList.add(book);
        return book;
    }

    /*@Override
    public int getNextId() {
        return 0;
    }*/

    @Override
    public void deleteBook(Book bookToDelete) {
        allBooksList.remove(bookToDelete);
    }

    @Override
    public List<Book> getAllBooks() {
        return allBooksList;
    }

    @Override
    public List<Book> getWishList() {
        return wishListBooks;
    }

    @Override
    public Book addToWishList(Book bookToWishList) {
        wishListBooks.add(bookToWishList);
        return bookToWishList;
    }

    public void setUpRandomBooks() {
        wishListBooks.add(new Book("wishlisttest", "authortest", Category.Business, 2022));
        createBook(new Book("Picture etiquette", "Ladislav Špaček", Category.Ekonómia, 2015));
        createBook(new Book("The Lean Startup", "Eric Ries", Category.Horor, 2018));
        createBook(new Book("Lolita", "Matej Nabokov", Category.Cooking, 1984));
        createBook(new Book("Súmrak demokracie", "Anne Plabeum", Category.História, 2019));
        createBook(new Book("Yes,chef!", "Marcus Samuelsson", Category.Cestopis,2014 ));
        createBook(new Book("Finest dining", "Gordon Ramsey", Category.Politickévedy, 2004));
        createBook(new Book("16 etických dilém", "Roman Keres", Category.Spoločenskévedy, 2021));
    }

    @Override
    public void removeFromWishList(Book bookFromWishList) {
        wishListBooks.remove(bookFromWishList);
    }
}
