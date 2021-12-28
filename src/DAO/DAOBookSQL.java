package DAO;

import BE.Book;

import java.util.List;

public class DAOBookSQL implements IBookDAO{

    @Override
    public Book createBook(Book book) {
        return null;
    }

    @Override
    public int getNextId() {
        return 0;
    }

    @Override
    public void deleteBook(Book bookToDelete) {

    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public List<Book> getWishList() {
        return null;
    }

    @Override
    public Book addToWishList(Book bookToWishList) {
        return null;
    }

    @Override
    public void setUpRandomBooks() {

    }

    @Override
    public void removeFromWishList(Book bookFromWishList) {

    }
}
