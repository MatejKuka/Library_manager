package GUI.Models;

import BE.Book;
import BE.Category;
import BLL.BookBLL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Arrays;

public class BookModel {
    private static BookModel single_instance = null;

    public static BookModel getInstance() {
        if (single_instance == null)
            single_instance = new BookModel();

        return single_instance;
    }

    private BookBLL managerBook;
    public ObservableList<Book> observableListBook;
    public ObservableList<Book> observableWishList;
    public ObservableList<Category> observableEnumList;

    public BookModel(){
        managerBook = new BookBLL();
        observableListBook = FXCollections.observableArrayList();
        observableListBook.addAll(managerBook.getAllBooks());

        observableWishList = FXCollections.observableArrayList();
        observableWishList.addAll(managerBook.getWishList());
        setUpEnumList();
    }

    public void createBook(Book book){
        Book bookCreated = managerBook.createBook(book);
        observableListBook.add(bookCreated);
        System.out.println(book.getID());
    }

    public void deleteBook(Book book){
        managerBook.deleteBook(book);
        observableListBook.remove(book);
    }

    public ObservableList<Book> getAllBooks(){
        return observableListBook;
    }

    public ObservableList<Book> getObservableWishList(){return observableWishList;}

    public void addBookToWishList(Book book){
        managerBook.getWishList().add(book);
        observableWishList.add(book);
    }

    public void removeBookFromWishList(Book book){
        managerBook.removeFromWishList(book);
        observableWishList.remove(book);
    }

    public void setUpEnumList(){
        observableEnumList = FXCollections.observableArrayList();
        observableEnumList.addAll(Arrays.asList(Category.values()));
    }

    public ObservableList<Category> getEnumList(){
        return observableEnumList;
    }
}
