package GUI.Controllers;

import BE.Book;
import BE.Category;
import GUI.Models.BookModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class NewBookController implements Initializable {

    @FXML
    private ChoiceBox<Category> choiceBoxCategory;

    @FXML
    private TextField textFieldAuthor;

    @FXML
    private TextField textFieldImage;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextField textFieldYear;

    @FXML
    private Button buttonCancel, buttonSave;

    private BookModel modelBook = BookModel.getInstance();
    private Controller controller;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBoxCategory.getItems().addAll(modelBook.getEnumList());
        }

    @FXML
    void toCancelWindow(ActionEvent event) {
        Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    void toChooseImage(ActionEvent event) {

    }

    @FXML
    void toSaveBook(ActionEvent event) {
        modelBook.createBook(new Book(textFieldName.getText(), textFieldAuthor.getText(),choiceBoxCategory.getSelectionModel().getSelectedItem(),Integer.parseInt(textFieldYear.getText())));
        Stage stage = (Stage) buttonSave.getScene().getWindow();
        stage.close();
    }

}
