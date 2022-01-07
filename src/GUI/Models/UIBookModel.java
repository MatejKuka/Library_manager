package GUI.Models;


import BE.Book;
import BLL.BookBLL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class UIBookModel {

    private ObservableList<Book> bookObservableList;
    BookBLL controller;



    public UIBookModel() {
        controller = new BookBLL();
        setBookObservableList();
    }

    private static UIBookModel single_instance = null;

    public static UIBookModel getInstance() {
        if (single_instance == null)
            single_instance = new UIBookModel();

        return single_instance;
    } // static singleton class

    public void setBookObservableList(){
        bookObservableList = FXCollections.observableArrayList();
        bookObservableList.setAll(controller.getAllBooks());
        System.out.println("dasd" + bookObservableList.size());
    }

    public ObservableList<Book> getBookObservableList(){
        return bookObservableList;
    }
}
