package BLL;

import BE.Book;
import DAO.BookDAO;

import java.util.List;

public class BookBLL {
    private BookDAO databaseBook;

    public BookBLL(){
        this.databaseBook = new BookDAO();
    }

    public Book createBook(Book book){
        return databaseBook.createBook(book);
    }

    public void deleteBook(Book bookToDelete){
         databaseBook.deleteBook(bookToDelete);
    }
    public List<Book> getAllBooks(){
        return databaseBook.getAllBooks();
    }
    public List<Book> getWishList(){
        return databaseBook.getWishList();
    }
    public Book addToWishList(Book bookToWishList){
        return databaseBook.addToWishList(bookToWishList);
    }

    public void removeFromWishList (Book bookFromWishList){
         databaseBook.removeFromWishList(bookFromWishList);
    }
}
