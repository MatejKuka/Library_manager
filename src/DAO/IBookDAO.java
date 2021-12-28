package DAO;

import BE.Book;

import java.util.List;

public interface IBookDAO {

    public Book createBook(Book book);
    public int getNextId();
    public void deleteBook(Book bookToDelete);
    public List<Book> getAllBooks();
    public List<Book> getWishList();
    public Book addToWishList(Book bookToWishList);
    public void setUpRandomBooks();
    public void removeFromWishList (Book bookFromWishList);

}
