package GUI.Controllers;

import BE.Book;
import GUI.Models.BookModel;
import GUI.Models.UIBookModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GalleryController implements Initializable {

    @FXML
    private GridPane bookContainer;

    @FXML
    private Button closeNewScenebutton;

    @FXML
    private AnchorPane itemBook;

    @FXML
    private MenuItem closeMenuItem, normalView;

    BookModel bookModel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookModel = BookModel.getInstance();
        setBooks();
    }

    @FXML
    void toCloseNewScene(ActionEvent event) {
        Stage stage = (Stage) closeNewScenebutton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void toNormalView(ActionEvent event) {
        Stage stage = (Stage) closeNewScenebutton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void toCloseGalleryView(ActionEvent event) {
            System.exit(0);
    }

    public void setBooks(){
        int column = 0;
        int row = 1;
        try {
        for (Book book : bookModel.getAllBooks()) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("ItemBookView.fxml"));
            itemBook = fxmlLoader.load();
            ItemBookController itemBookController = fxmlLoader.getController();
            itemBookController.setData(book);

            if (column == 6){
                column = 0;
                ++row;
            }

            bookContainer.add(itemBook, column++, row);
        } //TODO it cannot load location
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
